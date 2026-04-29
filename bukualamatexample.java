/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PINO
 */
public class BukuAlamatExample {

    public static void main(String[] args){
    BukuAlamatData data = new BukuAlamatData();
    BukuAlamat bukuAlamat= new BukuAlamat();
    bukuAlamat.setNama("ali");
    bukuAlamat.setAlamat("Padang");
    bukuAlamat.setNomor("086446823");
    bukuAlamat.setEmail("ali@gmail.com");
    data.insert(bukuAlamat, 0);
    bukuAlamat = new BukuAlamat();
    bukuAlamat.setNama("budi");
    bukuAlamat.setAlamat("Padang");
    bukuAlamat.setNomor("096446823");
    bukuAlamat.setEmail("budi@gmail.com");
    data.insert(bukuAlamat, 1);
    data.delete(0);
    data.view();
    }
}

