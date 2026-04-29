/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PINO
 */
public class StudentRecordExample {

    public static void main(String[] args){
        StudentRecord aliRecord = new StudentRecord();
        StudentRecord aniRecord = new StudentRecord();
        StudentRecord deniRecord = new StudentRecord("deni");
        deniRecord.print("");
        
        aliRecord.setName("Ali");
        aliRecord.setAddres("Padang");
        aliRecord.setAge(20);
        aliRecord.setMathgrade(80);
        aliRecord.setEnglishgrade(70);
        aliRecord.setSciencegrade(90);
        
        System.out.println("Data 1");
        System.out.println("Nama :"+aliRecord.getName());
        System.out.println("Alamat :"+aliRecord.getAddres());
        System.out.println("Umur :"+aliRecord.getAge());
        System.out.println("matematika :"+aliRecord.getMathgrade());
        System.out.println("B. Ingriss :"+aliRecord.getEnglishgrade());
        System.out.println("Ilmu pengetahuan :"+aliRecord.getSciencegrade());
        System.out.println("Rata-rata :"+aliRecord.getAverage());
        
        aniRecord.setName("Ani");
        aniRecord.setAddres("Bukkittinggi");
        aniRecord.setAge(20);
        aniRecord.setMathgrade(80);
        aniRecord.setEnglishgrade(70);
        aniRecord.setSciencegrade(90);
        aniRecord.print(""); 
        
       System.out.println("Jumlah siswa =" +  StudentRecord.getStudentCount());
    }
    
}
