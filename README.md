# Koleksi Alat Makeup

| Nama                      | NIM           | Kelas             |
|---------------------------|---------------|-------------------|
| Indah Maramin Al Inayah   | 2409116086    | Sistem Informasi C |

## 📄Deskripsi Program
Program ini adalah sebuah sistem manajemen koleksi alat makeup berbasis Java yang menerapkan konsep Object-Oriented Program (OOP). Program memiliki satu role yaitu pengguna, yang dapat melakukan operasi CRUD (Create, Read, Update, Delete) terhadap data koleksi alat makeup terhadap data koleksi alat makeup. Data yang dikelola mencakup nama alat, jenis, merk, dan jumlah.

Program ini menerapkan:

* **Constructor** untuk insialisasi objek
* **Access modifier (private & public)**
* **Validasi input**, sehingga program hanya menerima data yang sesuai.
* **Fitur Search**, untuk mencari data koleksi 

Fitur utama yang tersedia antara lain:

1. **Tambah Koleksi**: Pengguna dapat menambahkan data alat makeup baru.
2. **Lihat Koleksi**: Menampilkan seluruh daftar koleksi yang sudah tersimpan.
3. **Ubah Koleksi**: Memperbarui data koleksi yang dipilih
4. **Hapus Koleksi**: Menghapus data koleksi dari daftar
5. **Cari Koleksi**: Mencari data koleksi berdasarkan nama alat.
6. **Keluar Program**: Menghentikan jalannya program

# Struktur Packages 

Program ini menggunakan Model-View-Controller (MVC):

* **model**: Menyimpan struktur data berupa class Makeup dengan atribut dan constructor.
  AlatMakeup.java: mendefinisikan properties (nama, jenis, merk, jumlah) dengan constructor dan getter/setter.
* **service**: Berisi logika bisnis CRUD dan fitur tambahan seperti validasi input dan pencarian.
  KoleksiService.java: mengelola list koleksi makeup, menambahkan, menampilkan, memperbarui, menghapus, dan mencari data.
* **main**: Menyimpan class Main yang menampilkan menu dan menghubungkan pengguna dengan service.
  Main.java: Menampilkan menu, menerima input dari pengguna, memanggil method pada KoleksiService

Dengan pemisahan ini, struktur kode menjadi lebih rapi, mudah dipelihara, dan sesuai konsep MVC.

# Penggunaan Program

<details>
<summary><h3>Menu Koleksi Alat Makeup</h3></summary>

