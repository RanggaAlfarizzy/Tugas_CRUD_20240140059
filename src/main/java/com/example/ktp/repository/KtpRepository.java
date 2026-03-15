package com.example.ktp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.ktp.entity.Ktp;

import java.util.Optional;

public interface KtpRepository extends JpaRepository<Ktp,Integer>{

    Optional<Ktp> findByNomorKtp(String nomorKtp);

}