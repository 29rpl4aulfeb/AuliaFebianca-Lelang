/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukklll;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Lelang {
    Scanner in = new Scanner(System.in);
    
    private ArrayList<Integer> idPenawar = new ArrayList<Integer>();
    private ArrayList<Integer> idBarang = new ArrayList<Integer>();
    private ArrayList<Integer> hargaTawar = new ArrayList<Integer>();
    private ArrayList<Integer> laba = new ArrayList<Integer>();
    
    //Setter
    public void setIdPenawar(int idPenawar){
        this.idPenawar.add(idPenawar);
    }
    
    public void setIdBarang(int idBarang){
        this.idBarang.add(idBarang);
    }
    
    public void setHargaTawar(int hargaTawar){
        this.hargaTawar.add(hargaTawar);
    }
    
    //Getter
    public int getIdPenawar(int id){
        return this.idPenawar.get(id);
    }
    
    public int getIdBarang(int id){
        return this.idBarang.get(id);
    }
    
    public int getHargaTawar(int id){
        return this.hargaTawar.get(id);
    }
    
    public void list(Masyarakat masyarakat){
        System.out.println("Daftar Masyarakat Terdaftar : ");
        System.out.println("Id\t Nama\t Alamat\t\tTelp");
        for (int i = 0; i < masyarakat.getJmlMasyarakat(); i++) {
            System.out.println(i+"\t"+masyarakat.getNama(i)+"\t"
                    +masyarakat.getAlamat(i)+"\t"
                    +masyarakat.getTelepon(i));
        }
        System.out.println("");
    }
    
    public void list(Petugas petugas){
        System.out.println("+------ Tabel Masyarakat ------+");
        System.out.println("Id\tNama\t\tAlamat\t\tTelp");
        for (int i = 0; i < petugas.getJmlPetugas(); i++) {
            System.out.println(i+"\t"+petugas.getNama(i)+"\t\t"
                    +petugas.getAlamat(i)+"\t\t"
                    +petugas.getTelepon(i));
        }
        System.out.println("");
    }
    
    public void list(Barang barang, Masyarakat masyarakat){
        System.out.println("+------ Tabel Barang ------+");
        System.out.println("Id \tBarang \tHarga Awal \tStatus");
        for (int i = 0; i < barang.getJmlBarang(); i++) {
            System.out.println(i+"\t"+barang.getNamaBarang(i)+"\t"+
                    +barang.getHargaAwal(i)+"\t"
                    +barang.getStatus(i));
        }
        System.out.println("");
    }
    
    //Tambah barang lelang
    public void lelang(Masyarakat masyarakat, Barang barang){
        System.out.println("+------ Lelang Barang ------+");
        list(masyarakat);
        System.out.print("Masukkan Id Anda\t: ");
        int idMasyarakat = in.nextInt();
        barang.setIdMasyarakat(idMasyarakat);
        
        System.out.print("Masukkan Nama Barang\t: ");
        Scanner input = new Scanner(System.in);
        String namaBarang = input.nextLine();
        barang.setNamaBarang(namaBarang);
        
        System.out.print("Masukkan Harga Awal\t: ");
        int hargaAwal = in.nextInt();
        barang.setHargaAwal(hargaAwal);
        
        barang.setStatus(true);
    }
    
    public void tawar(Masyarakat masyarakat, Barang barang){
        System.out.println("+------ Tawar Barang ------+");
        list(masyarakat);
        System.out.print("Masukkan Id Anda\t: ");
        int idPenawar = in.nextInt();
        
        
        list(barang, masyarakat);
        System.out.print("Masukkan Id Barang\t: ");
        int idBarang = in.nextInt();
        if (barang.getStatus(idBarang) != true) {
            System.out.println("Maaf produk tidak tersedia");
        }
        else {
            setIdPenawar(idPenawar);
            setIdBarang(idBarang);
        
        int hargaTawar;
        do {
            System.out.print("Masukkan Harga Tawar\t: ");
            hargaTawar= in.nextInt();
            if (hargaTawar > barang.getHargaAwal(idBarang)) {
                System.out.println("+------ Anda berhasil menawar barang ------+");
                barang.editStatus(idBarang, false);
                setHargaTawar(hargaTawar);
            }
            else {
                System.out.println("Tawaran terlalu rendah");
            }
        } while (hargaTawar <= barang.getHargaAwal(idBarang));
        
        System.out.println("+------ Berikut Transaksi Anda ------+");
            System.out.println(" ");
        System.out.println("Nama \tBarang \t\tHarga Awal \tHarga Tawar");
        System.out.println( masyarakat.getNama(idPenawar)+"\t\t"
                +barang.getNamaBarang(idBarang)+"\t\t"
                +barang.getHargaAwal(idBarang)+"\t"
                +hargaTawar+"\n");
        }
        
    }
    
    public void laporan(Masyarakat masyarakat, Barang barang){
        System.out.println("+------ Laporan Transaksi ------+");
        System.out.println("Nama \t\t Barang\t\t Harga Awal \tHarga Tawar \tLaba");
        for (int i = 0; i < idPenawar.size(); i++) {
            int laba = hargaTawar.get(i) - barang.getHargaAwal(idBarang.get(i));
            System.out.println(masyarakat.getNama(idPenawar.get(i))+"\t\t"
                +barang.getNamaBarang(idBarang.get(i))+"\t\t"
                +barang.getHargaAwal(idBarang.get(i))+"\t"
                +hargaTawar.get(i)+"\t"
                +laba);
        }
    }
}
        
        



