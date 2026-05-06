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
public class Latihan1 {
    public static void main(String args[]) {
        try (Scanner input = new Scanner(System.in)) {
            
            float realisasi, kehadiran, tugas, uts, uas, total;
            float b_kehadiran, b_tugas, b_uts, b_uas;
            
            System.out.print("Masukkan realisasi: ");
            realisasi = input.nextFloat();
            
            System.out.print("Masukkan kehadiran: ");
            kehadiran = input.nextFloat();
            
            System.out.print("Masukkan tugas    : ");
            tugas = input.nextFloat();
            
            System.out.print("Masukkan uts      : ");
            uts = input.nextFloat();
            
            System.out.print("Masukkan uas      : ");
            uas = input.nextFloat();
            
            b_kehadiran = (kehadiran / realisasi) * 10;
            b_tugas     = tugas * 20 / 100;
            b_uts       = uts * 30 / 100;
            b_uas       = uas * 40 / 100;
            total = b_kehadiran + b_tugas + b_uts + b_uas;
            
            System.out.println("\nHasil Perhitungan Nilai");
            
            System.out.println("Realisasi  : " + realisasi);
            
            System.out.println("Kehadiran  : " + kehadiran);
            
            System.out.println("Tugas      : " + tugas);
            
            System.out.println("UTS        : " + uts);
            
            System.out.println("UAS        : " + uas);
            
            System.out.println("Total Nilai: " + total);
        } 
    }
}
