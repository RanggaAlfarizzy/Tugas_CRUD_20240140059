package com.example.ktp.service;

import com.example.ktp.entity.Ktp;
import java.util.List;

public interface KtpService {

    Ktp create(Ktp ktp);

    List<Ktp> findAll();

    Ktp findById(Integer id);

    Ktp update(Integer id, Ktp ktp);

    void delete(Integer id);

}