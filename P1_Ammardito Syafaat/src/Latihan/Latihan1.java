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
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukan angka pertama:");
        int angka1=input.nextInt();
        
        System.out.print("Masukan angka kedua:");
        int angka2=input.nextInt();
        
        int hasil=angka1 + angka2;
        
        System.out.println("Hasil penjumlahan:"+hasil);
    }
}
