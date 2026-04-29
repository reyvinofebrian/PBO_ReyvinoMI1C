/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PINO
 */
public class BukuAlamat {
    
    private String Nama;
    private String Alamat;
    private String Nomor;
    private String Email;
    
    public BukuAlamat(){
    }
    
    public BukuAlamat(String temp){
        this.Nama = temp;
    }
    
    public BukuAlamat(String Nama, String Alamat){
        this.Nama = Nama;
        this.Alamat = Alamat;
    }
    
    public String getNama(){
        return Nama;
    }
    
    public void setNama(String Nama){
        this.Nama = Nama;
    }
    
    public String getAlamat(){
        return Alamat;
        
    }
    
    public void setAlamat(String Alamat){
        this.Alamat = Alamat;
        
    }
    
    public String getNomor(){
        return Nomor;
    }
    
    public void setNomor(String Nomor){
        this.Nomor = Nomor;
    }
    
    public String getEmail(){
        return Email;
    }
    
    public void setEmail(String Email){
        this.Email = Email;
    }

}  
