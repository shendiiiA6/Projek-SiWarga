/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeksiwarga;

public class Warga {
   
    String nik;
    String nama;
    String nomorRumah;
    boolean sudahBayarIuran;
    double totalIuran;

    
    public Warga(String nikAwal, String namaAwal, String nomorRumahAwal) {
        this.nik = nikAwal;
        this.nama = namaAwal;
        this.nomorRumah = nomorRumahAwal;
        this.sudahBayarIuran = false; 
        this.totalIuran = 0;
    }

    
    public void bayarIuran(double nominal) {
        if (!sudahBayarIuran) {
            this.totalIuran += nominal;
            this.sudahBayarIuran = true;
            System.out.println(" Pembayaran iuran Rp" + nominal + " a.n " + nama + " berhasil.");
        } else {
            System.out.println(" Warga a.n " + nama + " sudah melunasi iuran bulan ini.");
        }
    }

    public void tampilkanStatus() {
        String status = sudahBayarIuran ? "LUNAS" : "BELUM BAYAR";
        System.out.println("------------------------------------------");
        System.out.println("No. Rumah : " + nomorRumah);
        System.out.println("Nama / NIK: " + nama + " (" + nik + ")");
        System.out.println("Status    : " + status);
        System.out.println("Total Kas : Rp" + totalIuran);
    }

    public static void main(String[] args) {
        
        Warga warga1 = new Warga("3201001", "Pak Budi", "Blok A-12");
        Warga warga2 = new Warga("3201002", "Bu Siti", "Blok A-15");

        
        warga1.tampilkanStatus();
        warga1.bayarIuran(50000); 
        warga1.tampilkanStatus();

        warga2.tampilkanStatus(); 
    }
}
