/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Asus TUF
 */
public class AlatMakeup {
    private String nama;
    private String jenis;
    private String merk;
    private int jumlah;

    // Constructor
    public AlatMakeup(String nama, String jenis, String merk, int jumlah) {
        this.nama = nama;
        this.jenis = jenis;
        this.merk = merk;
        this.jumlah = jumlah;
    }

    // Getter & Setter
    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }

    public String getJenis() { return jenis; }
    public void setJenis(String jenis) { this.jenis = jenis; }

    public String getMerk() { return merk; }
    public void setMerk(String merk) { this.merk = merk; }

    public int getJumlah() { return jumlah; }
    public void setJumlah(int jumlah) { this.jumlah = jumlah; }

    @Override
    public String toString() {
        return "Nama: " + nama + " | Jenis: " + jenis + " | Merk: " + merk + " | Jumlah: " + jumlah;
    }
}
