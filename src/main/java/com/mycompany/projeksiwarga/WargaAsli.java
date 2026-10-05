/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeksiwarga;

public class WargaAsli extends Warga {
    private int jumlahAnggotaKeluarga;
    private static final double TARIF_PER_ORANG = 10000;

    public WargaAsli(String nik, String nama, String nomorRumah, int jumlahAnggotaKeluarga) {
        super(nik, nama, nomorRumah); 
        setJumlahAnggotaKeluarga(jumlahAnggotaKeluarga);
    }

    public int getJumlahAnggotaKeluarga() {
        return jumlahAnggotaKeluarga;
    }

    public void setJumlahAnggotaKeluarga(int jumlahAnggotaKeluarga) {
        if (jumlahAnggotaKeluarga <= 0) {
            System.out.println("Jumlah anggota keluarga minimal 3 orang!");
            this.jumlahAnggotaKeluarga = 1;
        } else {
            this.jumlahAnggotaKeluarga = jumlahAnggotaKeluarga;
        }
    }
    
    @Override 
    public double hitungIuranRutin(){
        return jumlahAnggotaKeluarga * TARIF_PER_ORANG;
    }

    @Override
    public void tampilkanStatus() {
        System.out.println("=== DATA WARGA ASLI ===");
        super.tampilkanStatus(); 
        System.out.println("Jumlah anggota : " + jumlahAnggotaKeluarga + " orang");
        System.out.println("------------------------------------------");
    }
}

