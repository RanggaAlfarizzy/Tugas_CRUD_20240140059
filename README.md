  # KTP CRUD Web Application

## Deskripsi

Aplikasi web sederhana untuk melakukan **CRUD (Create, Read, Update, Delete)** data KTP menggunakan **Spring Boot, MySQL, HTML, CSS, dan jQuery AJAX**.

Aplikasi ini memungkinkan pengguna untuk:

* Menambahkan data KTP
* Melihat daftar data KTP
* Mengupdate data KTP
* Menghapus data KTP

Semua proses dilakukan secara **asynchronous menggunakan AJAX** sehingga halaman tidak perlu direfresh.

---

## Teknologi Yang Digunakan

* Java
* Spring Boot
* Spring Data JPA
* MySQL
* HTML
* CSS
* jQuery AJAX

---

## Struktur Database

Tabel: **ktp**

| Field        | Type                     |
| ------------ | ------------------------ |
| id           | int (PK, Auto Increment) |
| nomorKtp     | varchar                  |
| namaLengkap  | varchar                  |
| alamat       | varchar                  |
| tanggalLahir | date                     |
| jenisKelamin | varchar                  |

---

## Cara Menjalankan Project

1. Clone repository

```bash
git clone https://github.com/username/nama-repository.git
```

2. Masuk ke folder project

```bash
cd nama-repository
```

3. Jalankan aplikasi menggunakan IDE (IntelliJ / VSCode)

atau menggunakan command:

```bash
mvn spring-boot:run
```

4. Buka browser

```
http://localhost:8080
```

---

## Screenshot Aplikasi

### 1. Tampilan Web

Menampilkan halaman utama aplikasi untuk input dan melihat data KTP.

![Tampilan Web]()

---

### 2. Feedback Setelah Menambahkan Data

Setelah data berhasil ditambahkan, sistem akan menampilkan **popup notifikasi bahwa data berhasil ditambahkan**.

![Popup Berhasil](screenshots/popup-berhasil.png)

---

## Author

Nama: Rangga Alfarizzy
NIM: 20240140059
Project: Deployment Perangkat Lunak
