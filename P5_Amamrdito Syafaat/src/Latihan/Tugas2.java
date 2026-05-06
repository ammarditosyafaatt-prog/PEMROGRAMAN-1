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
public class Tugas2 {
    public static void main(String[]args){
        try (Scanner input = new Scanner(System.in)) {
            
            System.out.print("Masukkan Role Anda (admin/user/guest): ");
            String role = input.nextLine();
            
            if (role.equalsIgnoreCase("admin")) {
                System.out.println("Selamat datang, Admin! Anda memiliki akses penuh.");
            }
            else if (role.equalsIgnoreCase("user")) {
                System.out.println("Selamat datang, User! Anda memiliki akses terbatas.");
            }
            else if (role.equalsIgnoreCase("guest")) {
                System.out.println("Selamat datang, Tamu! Silakan daftar untuk akses lebih lanjut.");
            }
            else {
                System.out.println("Role tidak dikenali.");
            }
        }
    }
}
