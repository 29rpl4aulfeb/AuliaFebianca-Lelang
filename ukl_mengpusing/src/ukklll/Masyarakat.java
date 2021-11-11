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
public class Masyarakat implements User{
    private ArrayList<String> namaMasyarakat = new ArrayList<String>();
     private ArrayList<String> alamat = new ArrayList<String>();
      private ArrayList<String> telepon = new ArrayList<String>();
       
public Masyarakat (){
    this.namaMasyarakat.add("Nana");
    this.alamat.add("Sidoarjo");
    this.telepon.add("8080808080");
    
    this.namaMasyarakat.add("Nono");
    this.alamat.add("Surabaya");
    this.telepon.add("0808080808");
}
    @Override
    public void setNama(String namaMasyarakat ){
        this.namaMasyarakat.add(namaMasyarakat);
    }
    
    @Override
    public void setAlamat(String alamat ){
        this.alamat.add(alamat);
    }
    @Override
    public void setTelepon(String telepon ){ 
        this.telepon.add(telepon);
    }
    public int getJmlMasyarakat(){
        return this.namaMasyarakat.size();
    }
    @Override
    public String getNama(int idMasyarakat){
        return this.namaMasyarakat.get(idMasyarakat);
    }
    
    @Override
    public String getAlamat(int idMasyarakat){
        return this.alamat.get(idMasyarakat);
    }
    
    @Override
    public String getTelepon(int idMasyarakat){
        return this.telepon.get(idMasyarakat);
    }    

}
