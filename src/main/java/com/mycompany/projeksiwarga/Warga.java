/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeksiwarga;

public class Warga {
    private String nik;
    private String nama;
    private String nomorRumah;
    private boolean sudahBayarIuran;
    private double totalIuran;

    public Warga(String nik, String nama, String nomorRumah) {
        setNik(nik);
        this.nama = nama;
        this.nomorRumah = nomorRumah;
        this.sudahBayarIuran = false; 
        this.totalIuran = 0;
    }
    
    public String getNik(){
        return nik;
    }
    
    public void setNik(String nik){
        if(nik == null || nik.trim().isEmpty()){
            System.out.println("NIK tidak boleh kosong!");
        }else if(nik.length() < 5){
            System.out.println("NIK minimal harus 5 karakter!");
        }else{
            this.nik = nik;
            System.out.println("NIK berhasil diubah menjadi : " + nik);
        }
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String getNomorRumah(){
        return nomorRumah;
    }
    
    public void setNomorRumah(String nomorRumah){
        this.nomorRumah = nomorRumah;
    }
    
    public boolean isSudahBayarIuran(){
        return sudahBayarIuran;
    }
    public void setSudahBayarIuran(boolean sudahBayarIuran) {
        this.sudahBayarIuran = sudahBayarIuran;
    }
    
    public double getTotalIuran(){
        return totalIuran;
    }
    
    public void setTotalIuran(double totalIuran){
        if(totalIuran < 0){
            System.out.println("Total iuran ga boleh mines!");
    }else{
            this.totalIuran = totalIuran;
        }
    }
    public void bayarIuran(double nominal) {
        if(nominal <= 0){
            System.out.println(" Nominal iuran tidak valid!");
            return;
        }
        if (!sudahBayarIuran) {
            setTotalIuran(this.totalIuran + nominal);
            setSudahBayarIuran(true);
            System.out.println(" Pembayaran iuran Rp" + nominal + " a.n " + nama + " berhasil.");
        } else {
            System.out.println(" Warga a.n " + nama + " sudah melunasi iuran bulan ini.");
        }
    }

    public void tampilkanStatus() {
        System.out.println("------------------------------------------");
        System.out.println("No. Rumah : " + nomorRumah);
        System.out.println("Nama / NIK: " + nama + " (" + nik + ")");
        System.out.println("Status    : " + (sudahBayarIuran ? "LUNAS" : "BELUM BAYAR"));
        System.out.println("Total Kas : Rp" + totalIuran);
        System.out.println("------------------------------------------");
    }
}
