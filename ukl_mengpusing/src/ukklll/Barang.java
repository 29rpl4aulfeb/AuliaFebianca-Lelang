/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukklll;

import java.io.InputStream;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class Barang {
      private ArrayList<Integer> idMasyarakat = new ArrayList<Integer>();  
    private ArrayList<String> namaBarang = new ArrayList<String>();
    private ArrayList<Integer> hargaAwal = new ArrayList<Integer>();
    private ArrayList<Boolean> status = new ArrayList<Boolean>();
    
    public Barang (){
       this.namaBarang.add("Cardigan");
       this.hargaAwal.add(100000);
       this.status.add(true);
       
       this.namaBarang.add("Hoodie XL");
       this.hargaAwal.add(70000);
       this.status.add(true);
       
       this.namaBarang.add("Celana Jeans");
       this.hargaAwal.add(150000);
       this.status.add(true);
    }

    public int getJmlBarang(){
        return this.namaBarang.size();
    }
    public void setIdMasyarakat(int id){
        this.idMasyarakat.add(id);
    }
    public int getIdMasyarakat(int id){
        return this.idMasyarakat.get(id);
    }
    public void setNamaBarang(String namaBarang){
        this.namaBarang.add(namaBarang);
    }
    public String getNamaBarang(int idBarang){
        return this.namaBarang.get(idBarang);
    }
    public void setStatus(boolean status){
        this.status.add(status);
    } 
    public boolean getStatus(int idBarang){
        return this.status.get(idBarang);
    }
    public void editStatus(int idBarang, boolean status){
        this.status.set(idBarang, status);
    }
    public void setHargaAwal(int hargaAwal){
        this.hargaAwal.add(hargaAwal);
    }
    public int getHargaAwal (int idBarang){
        return this.hargaAwal.get(idBarang);
    }

}
