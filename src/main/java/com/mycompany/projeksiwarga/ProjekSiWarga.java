/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeksiwarga;
import java.util.Scanner;

public class ProjekSiWarga {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("==========================================");
        System.out.println("         SISTEM MANAJEMEN WARGA    ");
        System.out.println("==========================================");

        System.out.print("Masukkan NIK Warga      : ");
        String nik = input.nextLine();

        System.out.print("Masukkan Nama Warga     : ");
        String nama = input.nextLine();

        System.out.print("Masukkan Nomor Rumah    : ");
        String nomorRumah = input.nextLine();

        Warga warga1 = new Warga(nik, nama, nomorRumah);

        while (warga1.getNik() == null) {
            System.out.print("Silakan masukkan NIK yang valid (minimal 5 karakter): ");
            String nikBaru = input.nextLine();
            warga1.setNik(nikBaru); 
        }

        System.out.println("\n--- Data Warga Berhasil Terdaftar ---");
        System.out.println("NIK       : " + warga1.getNik());
        System.out.println("Nama      : " + warga1.getNama());
        System.out.println("No Rumah  : " + warga1.getNomorRumah());

        System.out.println("\n--- PEMBAYARAN IURAN ---");
        System.out.print("Masukkan Nominal Iuran: Rp");
        double nominal = input.nextDouble();

        while (nominal <= 0) {
            System.out.println("Nominal iuran harus lebih dari 0!");
            System.out.print("Masukkan ulang Nominal Iuran yang valid: Rp");
            nominal = input.nextDouble();
        }

        warga1.bayarIuran(nominal);

        System.out.println("\n=== STATUS AKHIR WARGA ===");
        warga1.tampilkanStatus();

        input.close();
    }
}