/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class hewan {
    // Atribut
    private final String nama;
    private final String jenis;
    private final int umur;

    // Konstruktor
    public hewan(String nama, String jenis, int umur) {
        this.nama = nama;
        this.jenis = jenis;
        this.umur = umur;
    }

    // Metode untuk menampilkan informasi hewan
    public void tampilkanInfo() {
        System.out.println("Nama Hewan: " + nama);
        System.out.println("Jenis Hewan: " + jenis);
        System.out.println("Umur Hewan: " + umur + " tahun");
    }
} 

