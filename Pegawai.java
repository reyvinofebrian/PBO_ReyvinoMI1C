/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PINO
 */
public class Pegawai {

    private int NIP;
    private String Nama;
    private String Golongan;
    private double Gajipokok; // bedarsarkan gol
    private double Tunjangan; // 10%
    private double Potongan; 
    private double Gajibersih; // pokok + tunjang - potongan
    
    public Pegawai(){
        
    }
    
    public Pegawai(String temp){
        this.Nama = temp;
    }
    
    public Pegawai(String Nama,String Golongan){
        this.Nama = Nama;
        this.Golongan = Golongan;
    }
    
    public int getNIP(){
        return NIP;
    }
    
    public void setNIP(int NIP){
        this.NIP = NIP;
    }
    
    public String getNama(){
        return Nama;
    }
    
    public void setNama(String Nama){
        this.Nama = Nama;
    }
    
    public String getGolongan(){
        return Golongan;
    }
    
    public void setGolongan(String Golongan){
        this.Golongan = Golongan;
        if(Golongan.equals("1A")){
            this.Gajipokok = 300000;    
        } else if(Golongan.equals("1B")){
            this.Gajipokok = 400000;
        } else{
            this.Gajipokok = 500000;
        }
        
    }
    public double getGajipokok(){
        return Gajipokok;
    }
    
    public void setGajipokok(double Gajipokok){
        this.Gajipokok = Gajipokok;
    }
    
    public double getTunjangan(){
        return Tunjangan;
    }
    
    public void setTunjangan(double Tunjangan){
        this.Tunjangan = Tunjangan;
        this.Tunjangan = 0.10 * this.Gajipokok;
    }
    
    public double getPotongan(){
        return Potongan;
    }
    
    public void setPotongan(double Potongan){
        this.Potongan = Potongan;
    }  
    public double getGajibersih(){
        return Gajibersih;
    }
    
    public void setGajibersih(double Gajibersih){
        this.Gajibersih = Gajibersih;
        this.Gajibersih = (this.Gajipokok + this.Tunjangan) - this.Potongan;
    }  
    
    
}  

