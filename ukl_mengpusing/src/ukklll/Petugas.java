/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukklll;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class Petugas implements User{
    private ArrayList<String> namaPetugas = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    
   public Petugas (){
    this.namaPetugas.add("petugas");
    this.alamat.add("Malang");
    this.telepon.add("08000000000");
}
   public int getJmlPetugas(){
       return this.namaPetugas.size();
   }
   @Override
   public void setNama(String namaPetugas){
       this.namaPetugas.add(namaPetugas);
   }
   
   @Override
   public void setAlamat(String alamat){
       this.namaPetugas.add(alamat);
   }
   
   @Override
   public void setTelepon(String telepon){
       this.namaPetugas.add(telepon);
   }
   
   @Override
   public String getNama(int idPetugas){
       return this.namaPetugas.get(idPetugas);
   }
   
   @Override 
   public String getAlamat(int idPetugas){
       return this.alamat.get(idPetugas);
   }
   
   @Override
   public String getTelepon(int idPetugas){
       return this.telepon.get(idPetugas);
   }
}
