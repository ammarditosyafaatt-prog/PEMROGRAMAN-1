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
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        String nama;
        int usia;
        
        System.out.println("Input Nama");
        nama = input.nextLine();
        System.out.println("Nama "+nama);
       
        System.out.println("Input Usia");
        usia = input.nextInt();
        System.out.println("Usia "+ usia);
        
    }
}
