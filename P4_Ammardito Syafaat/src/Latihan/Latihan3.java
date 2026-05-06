/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan;

import java.util.Scanner;

/**
 *
 * @author ADVAN
 */
public class Latihan3 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            final double DISKON = 0.10;
            double makan, transport, belanja;
            double totalSebelumDiskon, besarDiskon, totalSetelahDiskon;
            
            System.out.println("=== Program Kalkulator Diskon Mahasiswa ===");
            
            System.out.print("Masukkan biaya makan     : Rp ");
            makan = input.nextDouble();
            
            System.out.print("Masukkan biaya transport : Rp ");
            transport = input.nextDouble();
            
            System.out.print("Masukkan biaya belanja   : Rp ");
            belanja = input.nextDouble();
            
            totalSebelumDiskon = makan + transport + belanja;
            besarDiskon = totalSebelumDiskon * DISKON;
            totalSetelahDiskon = totalSebelumDiskon - besarDiskon;
            
            System.out.println("\n--- Ringkasan Pembayaran ---");
            System.out.printf("1. Total sebelum diskon  : Rp %.0f%n", totalSebelumDiskon);
            System.out.printf("2. Besar diskon (10%%)    : Rp %.0f%n", besarDiskon);
            System.out.printf("3. Total setelah diskon  : Rp %.0f%n", totalSetelahDiskon);
            System.out.println("----------------------------");
        }
    }
}
