/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PINO
 */
public class StudentRecord {

    private String name;
    private String addres;
    private int age;
    private static int studentCount;
    private Double mathgrade;
    private Double englishgrade;
    private Double Sciencegrade;
    private Double average;
    
    public StudentRecord(){
        studentCount++;
    }
    
    public StudentRecord(String temp){
        studentCount++;
        this.name = temp;
    }
    
    public StudentRecord(String name, String addres){
        this.name = name;
        this.addres = addres;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getAddres(){
        return addres;
    }
    
    public void setAddres(String addres){
        this.addres = addres;
    }
    
    public int getAge(){
        return age;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    public double getMathgrade(){
        return mathgrade;
    }
    
    public void setMathgrade(double mathgrade){
        this.mathgrade = mathgrade;
    }
    
    public double getEnglishgrade() {
        return englishgrade;
    }
    
    public void setEnglishgrade(double englishgrade){
        this.englishgrade = englishgrade;
    }
    
    public double getSciencegrade(){
        return Sciencegrade;
    }
    
    public void setSciencegrade(double Sciencegrade){
        this.Sciencegrade = Sciencegrade;
    }
    
    public double getAverage(){
        average =( mathgrade + englishgrade + Sciencegrade)/3;
        return average;
    }
    
    public static int getStudentCount(){
        return studentCount;
    }
    
    public void print (String temp){
        System.out.println("Name: "+ name);
        System.out.println("Addres "+ addres);
        System.out.println("Age: "+ age);
    }
    
    public void print(double eGrade, double mGrade, double sGrade){
        System.out.println("Name:"+ name);
        System.out.println("Math Grade:"+ mGrade);
        System.out.println("English Grade:"+ eGrade);
        System.out.println("Science Grade:"+ sGrade);
    }

}

