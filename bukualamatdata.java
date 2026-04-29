/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PINO
 */
public class BukuAlamatData {
    
    BukuAlamat[] data = new BukuAlamat[5];
    
    public void insert(BukuAlamat bukuAlamat, int i){
        data[i] = bukuAlamat;
    }
    
    public void update(BukuAlamat bukuAlamatBaru, int i){
     data[i] = bukuAlamatBaru;
    }
    
    public void delete(int i){
        data[i] = null;
    }
    
    public void view(){
        for(int i=0;i<data.length;i++){
            if(data[i] != null){
             System.out.println("Data ke-"+ (i+1));
             System.out.println("Nama:"+ data[i].getNama());
             System.out.println("Alamat:"+ data[i].getAlamat());
             System.out.println("Nomor:"+ data[i].getNomor());
             System.out.println("Email:"+ data[i].getEmail());   
            }
        }
    }
}

