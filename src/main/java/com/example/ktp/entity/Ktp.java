package com.example.ktp.entity;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name="ktp")
public class Ktp {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(unique = true)
    private String nomorKtp;

    private String namaLengkap;

    private String alamat;

    @Temporal(TemporalType.DATE)
    private Date tanggalLahir;

    private String jenisKelamin;

    // getter setter
}