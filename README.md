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

<img width="560" height="182" alt="image" src="https://github.com/user-attachments/assets/2c2cbe87-2d13-4602-8730-0b66e9e21077" />

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

<img width="318" height="178" alt="image" src="https://github.com/user-attachments/assets/0f447f12-3ad8-47d9-907e-63f4739b898e" />

Saat program pertama kali dijalankan, sistem akan langsung menampilkan menu utama yang berisi daftar pilihan menu. Pengguna diminta untuk memasukkan nomor menu sesuai dengan pilihan yang diinginkan. Setelah itu, program akan menjalankan perintah sesuai input pengguna dan kemudian kembali menampilkan menu utama, hingga pengguna memilih opsi Keluar untuk menghentikan program.

## 1. Tambah Koleksi

<img width="461" height="307" alt="image" src="https://github.com/user-attachments/assets/36267c6b-f627-4d59-aadd-7fce7ad4b57c" />

Jika pengguna memilih opsi 1. Tambah Koleksi, program akan meminta pengguna untuk mengisi data alat makeup yang ingin dimasukkan ke dalam daftar koleksi. Setelah semua data dimasukkan dengan benar, program akan menyimpan informasi tersebut ke dalam ArrayList dan menampilkan pesan "Koleksi berhasil ditambahkan!". Data alat makeup baru akan tersimpan dan bisa dilihat kembali melalui menu Lihat Koleksi.

<img width="387" height="257" alt="image" src="https://github.com/user-attachments/assets/a0fb64c5-fb49-4dcc-920a-224b6e19b3d6" />

Saat pengguna diminta memasukkan Nama Alat Makeup, pengguna menekan enter tanpa mengetikkan apapun sehingga program akan menampilkan pesan "Nama tidak boleh kosong!" dan berlaku untuk memasukkan jenis makeup, merk, dan jumlah.

## 2. Lihat Koleksi

<img width="648" height="291" alt="image" src="https://github.com/user-attachments/assets/05f1adac-5451-46a9-9901-6cd1479c5be6" />

Jika pengguna memilih opsi 2. Lihat Koleksi, program akan menampilkan seluruh daftar alat makeup yang sudah tersimpan.

## 3. Ubah Koleksi

<img width="721" height="502" alt="image" src="https://github.com/user-attachments/assets/09e0ea09-786d-48f6-ad8e-98439884953b" />

Jika pengguna memilih opsi 3. Ubah Koleksi, maka program akan meminta nomor koleksi yang ingin diubah. Setelah itu, pengguna dapat memasukkan data baru untuk mengganti data lama. Setelah sudah memasukkan data baru, pengguna bisa mengecek kembali dengan opsi 2. Lihat Koleksi.

<img width="649" height="325" alt="image" src="https://github.com/user-attachments/assets/f171e1a5-256e-49fc-89fc-b6135c31b6fd" />

Apabila pengguna memasukkan nomor koleksi yang tidak tersedia, program akan menampilkan pesan "Nomor tidak valid!" sebagai bentuk validasi agar pengguna tidak bisa mengubah koleksi yang tidak ada.

## 4. Hapus Koleksi

<img width="658" height="563" alt="image" src="https://github.com/user-attachments/assets/7219cd8a-7727-4abd-96cb-1011147df63e" />

Jika pengguna memilih opsi 4. Hapus Koleksi, maka program akan meminta nomor koleksi yang ingin dihapus. Setelah itu, data koleksi akan dihapus dari daftar

<img width="689" height="340" alt="image" src="https://github.com/user-attachments/assets/fad4e55f-c038-4ad6-aef7-98e5e77b38f0" />

Apabila pengguna memasukkan nomor koleksi yang tidak tersedia, program akan menampilkan pesan "Nomor tidak valid!" sebagai bentuk validasi agar pengguna tidak bisa mengubah koleksi yang tidak ada.

## 5. Cari Koleksi

<img width="688" height="257" alt="image" src="https://github.com/user-attachments/assets/b1842f83-d03a-4824-b310-b656420faffd" />

Jika pengguna memilih opsi 5, maka program akan meminta kata kunci pencarian dari nama atau merk alat makeup. Setelah itu, program akan menampilkan daftar alat makeup yang sesuai kata kunci.

<img width="523" height="245" alt="image" src="https://github.com/user-attachments/assets/3b610936-5e2b-453e-b22d-616a7b452ed8" />

Apabila pengguna memasukkan kata kunci koleksi yang tidak tersedia, program akan menampilkan pesan "Koleksi tidak ditemukan!" sebagai bentuk validasi agar pengguna tidak bisa mengubah koleksi yang tidak ada.
