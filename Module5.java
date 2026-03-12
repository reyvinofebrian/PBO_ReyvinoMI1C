/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package module.pkg5;

import java.io.*;
public class Module5 {

   
    
    
    public static void main(String[] args) {
        BufferedReader dataln = new BufferedReader(new InputStreamReader(System.in));
        String a = "";
        String b = "";
        String c = "";
        try{
            System.out.print("masukkan kata  : ");
            a = dataln.readLine();
            System.out.print("masukkan kata  : ");
            b = dataln.readLine();
            System.out.print("masukkan kata  : ");
            c = dataln.readLine();
        } catch (IOException e) {
            System.out.print("gagal");
        }
    System.out.println("----------------------");
    System.out.print(a);
    System.out.print(" " + b);
    System.out.print(" " + c);
    }
}

    

