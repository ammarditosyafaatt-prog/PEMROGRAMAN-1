/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan;

/**
 *
 * @author ADVAN
 */
public class Latihan2 {
    public static void main(String[] args) {
    Latihan2 objek = new Latihan2();
    String hasil = objek.getNumberInWords(1);
    System.out.println("Hasil: " + hasil);
}
    public String getNumberInWords(int num) {
        if (num == 1) {
            return "one"; 
        } else if (num == 2) {
            return "two"; 
        }
        
        String defaultNum = "zero";
        return defaultNum;
    }    
}    