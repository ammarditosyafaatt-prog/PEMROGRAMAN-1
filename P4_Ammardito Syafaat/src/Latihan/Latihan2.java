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
public class Latihan2 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            
            double makan, transport, belanja, total;
            double pMakan, pTransport, pBelanja;
            
            System.out.println("=== Program Hitung Persentase Pengeluaran ===");
            
            System.out.print("Masukkan biaya Makan     : ");
            makan = input.nextDouble();
            
            System.out.print("Masukkan biaya Transport : ");
            transport = input.nextDouble();
            
            System.out.print("Masukkan biaya Belanja   : ");
            belanja = input.nextDouble();
            
            total = makan + transport + belanja;
            pMakan = (makan / total) * 100;
            pTransport = (transport / total) * 100;
            pBelanja = (belanja / total) * 100;
            
            System.out.println("\n--- Hasil Perhitungan ---");
            System.out.printf("Total Pengeluaran: Rp %.0f\n", total);
            System.out.println("-------------------------");
            System.out.printf("Persentase Makan     : %.1f%%\n", pMakan);
            System.out.printf("Persentase Transport : %.1f%%\n", pTransport);
            System.out.printf("Persentase Belanja   : %.1f%%\n", pBelanja);
        }
    }
}
