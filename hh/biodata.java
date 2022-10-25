/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2d;

import java.util.Scanner;

/**
 *
 * @author LK5_26
 */
public class biodata {
    public static void main(String[] args) {
        System.out.println("Data Diri");
        Scanner masukan = new Scanner(System.in);
        
        System.out.println("masukan nama anda :");
        String nama = masukan.nextLine();
        
        System.out.println("masukan alamat anda :");
        String alamat = masukan.nextLine();
        
        System.out.println("masukan kelas anda :");
        String kelas = masukan.nextLine();
        
        System.out.println("masukan no absen anda :");
        int absen = masukan.nextInt();
        
        System.out.println("Nama Anda adalah " +nama);
        System.out.println("Alamat Anda adalah " +alamat);
        System.out.println("Kelas Anda adalah " +kelas);
        System.out.println("No Absen Anda adalah " +absen);
    }
}    