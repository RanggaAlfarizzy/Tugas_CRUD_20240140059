package com.example.ktp.controller;

import com.example.ktp.entity.Ktp;
import com.example.ktp.service.KtpService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ktp")
@CrossOrigin
public class KtpController {

    private final KtpService service;

    public KtpController(KtpService service){
        this.service = service;
    }

    @PostMapping
    public Ktp create(@RequestBody Ktp ktp){
        return service.create(ktp);
    }

    @GetMapping
    public List<Ktp> findAll(){
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Ktp findById(@PathVariable Integer id){
        return service.findById(id);
    }

    @PutMapping("/{id}")
    public Ktp update(@PathVariable Integer id,@RequestBody Ktp ktp){
        return service.update(id,ktp);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id){
        service.delete(id);
    }
}