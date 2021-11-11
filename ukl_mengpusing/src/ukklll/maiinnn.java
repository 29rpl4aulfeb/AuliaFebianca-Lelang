/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukklll;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class maiinnn {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
         Barang yiha = new Barang ();
         Lelang ehey = new Lelang();
         Masyarakat yuhu = new Masyarakat ();
         Petugas uhuy = new Petugas ();
         
         System.out.println("+------ Silahkan Belanja ------+");
          int pilih;
          
          ehey.list(yuhu);
        do {
            System.out.println("+------ Pilih kode ------+");
            System.out.println(" Ketik 1 >> Melelang");
            System.out.println(" Ketik 2 >> Menawar");
            System.out.println(" Ketik 3 >> List Barang");
            System.out.println("Ketik 4 >> Keluar");
            System.out.print("Masukkan Kode : ");
            pilih = in.nextInt();
            
            if (pilih == 1) {
                System.out.println(" ");
                ehey.lelang(yuhu, yiha);
            }
            
            else if (pilih == 2) {
                System.out.println(" ");
                ehey.tawar(yuhu, yiha);
            }
            
            else if (pilih == 3) {
                System.out.println(" ");
                ehey.list(yiha, yuhu);
            }
        } while (pilih != 4);
        
    ehey.laporan(yuhu, yiha);
    }
    
}
