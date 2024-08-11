/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class hewaninduk {
     public static void main(String[] args) {
        // Membuat objek dari kelas Hewan
        hewan hewan1 = new hewan("Kucing", "Mamalia", 3);
        hewan hewan2 = new hewan("Burung", "Aves", 2);

        // Menampilkan informasi hewan
        hewan1.tampilkanInfo();
        System.out.println(); // Menambah baris kosong antara dua informasi hewan
        hewan2.tampilkanInfo();
    }
}

