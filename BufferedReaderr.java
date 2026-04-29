/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PINO
 */
import java.io.*;
public class BufferedReaderr {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));

        String name1 = "";
        System.out.println("nama 1: ");

        try {
            name1 = dataIn.readLine();
        } catch (IOException e) {
            System.out.println("Error");
        }
        String name2= "";
        System.out.println("nama 2: ");
         try {
            name2 = dataIn.readLine();
        } catch (IOException e) {
            System.out.println("Error");
        }
         String name3 = "";
         System.out.println("nama 3: ");
         try {
            name3 = dataIn.readLine();
        } catch (IOException e) {
            System.out.println("Error");
        }

        System.out.println(name1 + " " + name2 + " " + name3);
    }
}
