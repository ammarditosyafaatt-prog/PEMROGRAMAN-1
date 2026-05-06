/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 *
 * @author ADVAN
 */
public class Latihan1 {
    public static void main(String[] args) throws IOException {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        String nama = ""; 

        System.out.print("Ketik nama anda: ");

        nama = dataIn.readLine();

        System.out.println("\nHello " + nama + "\nSemangat belajarnya semoga menjadi programmer Java!");
    }
}
    
    
