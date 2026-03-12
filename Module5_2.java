/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package module5_2;

import javax.swing.JOptionPane;
import java.io.*;
public class Module5_2 {


  public static void main(String[] args) {
        BufferedReader dataln = new BufferedReader(new InputStreamReader(System.in));
        String a = "";
        String b = "";
        
        a = JOptionPane.showInputDialog("masukkan kata");
        b = JOptionPane.showInputDialog("masukkan kata");
        String msg = a + " " + b + " hello" + " !";
        JOptionPane.showMessageDialog(null, msg);
                                  
    }
}