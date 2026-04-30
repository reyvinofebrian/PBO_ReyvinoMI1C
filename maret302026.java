/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LAB-SI-PC
 */
public class maret302026 {
    
   private String Idsewa;
    private String Namapenyewa;
    private String Jenismobil;
    private int Lamasewa;
    private int Hargasewa;
    private double Biayatambah;
    private double Totalbayar;

    public maret302026(String id, String nama, String jenis, int lama) {
        this.Idsewa = id;
        this.Namapenyewa = nama;
        this.Jenismobil = jenis;
        this.Lamasewa = lama;
    }

    public void hitungTotal() {
        if (Jenismobil.equalsIgnoreCase("Avanza")) {
            Hargasewa = 300000;
        } else if (Jenismobil.equalsIgnoreCase("Innova")) {
            Hargasewa = 500000;
        } else if (Jenismobil.equalsIgnoreCase("Fortuner")) {
            Hargasewa = 800000;
        } else {
            Hargasewa = 0;
        }

        double biayaSewa = (double) Hargasewa * Lamasewa;

        if (Lamasewa > 5) {
            Biayatambah = 0.10 * biayaSewa;
        } else {
            Biayatambah = 0;
        }

        Totalbayar = biayaSewa - Biayatambah;
    }

    public void tampilkanData() {
        System.out.println("---------------");
        System.out.println("ID Sewa        : " + Idsewa);
        System.out.println("Nama Penyewa   : " + Namapenyewa);
        System.out.println("Jenis Mobil    : " + Jenismobil);
        System.out.println("Lama Sewa      : " + Lamasewa + " hari");
        System.out.println("Harga Sewa/Hari: Rp" + Hargasewa);
        System.out.println("Diskon (10%)   : Rp" + Biayatambah);
        System.out.println("TOTAL BAYAR    : Rp" + Totalbayar);
    }
}
