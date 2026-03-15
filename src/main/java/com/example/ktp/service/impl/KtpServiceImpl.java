package com.example.ktp.service.impl;

import com.example.ktp.entity.Ktp;
import com.example.ktp.repository.KtpRepository;
import com.example.ktp.service.KtpService;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KtpServiceImpl implements KtpService {

    private final KtpRepository repository;

    public KtpServiceImpl(KtpRepository repository){
        this.repository = repository;
    }

    @Override
    public Ktp create(Ktp ktp){

        if(repository.findByNomorKtp(ktp.getNomorKtp()).isPresent()){
            throw new RuntimeException("Nomor KTP sudah ada");
        }

        return repository.save(ktp);
    }

    @Override
    public List<Ktp> findAll(){
        return repository.findAll();
    }

    @Override
    public Ktp findById(Integer id){
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Data tidak ditemukan"));
    }

    @Override
    public Ktp update(Integer id, Ktp ktp){

        Ktp data = findById(id);

        data.setNamaLengkap(ktp.getNamaLengkap());
        data.setAlamat(ktp.getAlamat());
        data.setTanggalLahir(ktp.getTanggalLahir());
        data.setJenisKelamin(ktp.getJenisKelamin());

        return repository.save(data);
    }

    @Override
    public void delete(Integer id){
        repository.deleteById(id);
    }
}