/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeksiwarga;

public class ProjekSiWarga {

    public static void main(String[] args) {
       
        Warga warga1 = new Warga("3201001", "Pak Budi", "Blok A-12");
        Warga warga2 = new Warga("3201002", "Bu Siti", "Blok A-15");

        
        warga1.tampilkanStatus();
        warga1.bayarIuran(50000);
        warga1.tampilkanStatus();
        
        warga2.tampilkanStatus();
    }
}