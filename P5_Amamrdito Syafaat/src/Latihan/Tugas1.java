/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan;

/**
 *
 * @author ADVAN
 */
public class Tugas1 {
    public static void main(String[]args){
    int usia=25;
    
        if (usia <0){
            System.out.println("Usia tidak valid");
        } 
        else if (usia<=12){
            System.out.println("Kategori : Anak-Anak)");
        } 
        else if (usia<19) {
            System.out.println("Kategori : Remaja");
        } 
        else if (usia <=59){
            System.out.println("Kategori : Dewasa");
        } 
        else {
            System.out.println("Kategori : Lansia");
        }
    }
}