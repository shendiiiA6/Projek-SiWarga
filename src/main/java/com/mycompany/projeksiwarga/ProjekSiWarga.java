package com.mycompany.projeksiwarga;

import java.util.Scanner;

public class ProjekSiWarga {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("==========================================");
        System.out.println("           SISTEM MANAJEMEN WARGA         ");
        System.out.println("==========================================");

        System.out.print("Masukkan NIK warga     : ");
        String nik = input.nextLine();

        System.out.print("Masukkan nama warga    : ");
        String nama = input.nextLine();

        System.out.print("Masukkan nomor rumah   : ");
        String nomorRumah = input.nextLine();

        System.out.print("Masukkan jumlah anggota keluarga: ");
        int jmlAnggota = input.nextInt();
        input.nextLine();

        WargaAsli warga1 = new WargaAsli(nik, nama, nomorRumah, jmlAnggota);

        while (warga1.getNik() == null) {
            System.out.print("NIK harus 16!: ");
            String nikBaru = input.nextLine();
            warga1.setNik(nikBaru); 
        }
        
        System.out.println("\n=== DATA WARGA BERHASIL TERDAFTAR ===");
        System.out.println("NIK            : " + warga1.getNik());
        System.out.println("Nama           : " + warga1.getNama());
        System.out.println("No. Rumah       : " + warga1.getNomorRumah());
        System.out.println("Jumlah anggota : " + warga1.getJumlahAnggotaKeluarga() + " Orang");

        System.out.println("\n=== PEMBAYARAN IURAN ===");
        System.out.print("Masukkan nominal iuran/bulan: Rp ");
        double nominal = input.nextDouble();

        while (nominal <= 0) {
            System.out.println("Iuran tidak boleh mines!");
            System.out.print("Masukkan ulang nominal iuran yang valid: Rp ");
            nominal = input.nextDouble();
        }

        warga1.bayarIuran(nominal);

        System.out.println("\n=== STATUS AKHIR WARGA ===");
        warga1.tampilkanStatus();

        input.close();
    }
}