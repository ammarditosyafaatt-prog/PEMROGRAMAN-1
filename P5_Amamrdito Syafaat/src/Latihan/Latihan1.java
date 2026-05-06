/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan;

/**
 *
 * @author ADVAN
 */
import java.util.Scanner;

public class Latihan1 {
    public static void main (String[]args){
        try(Scanner input = new Scanner(System.in)) {
            System.out.print("Masukan Persentase Kehadiran");
            double kehadiran = input.nextDouble();
            
            System.out.print("Masukan Nilai Akhir");
            double nilai = input.nextDouble();
            
            if(kehadiran>75) {
                char grade;
                if(nilai>=80){
                    grade = 'A';
                } else if (nilai>=70){
                    grade = 'B';
                } else if (nilai>=60){
                    grade = 'C';
                } else if (nilai>=55){
                    grade = 'D';
                } else {
                    grade = 'E';
                }
                
                System.out.println("Nilai: "+ nilai);
                System.out.println("Grade: "+ grade);
            } else {
                System.out.println("Tidak memenuhi syarat(Kehadiran kurang dari satu sama dengan 75%)");
            }
        }
    }    
}
