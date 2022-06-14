/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uklseleksikondisi;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Uklseleksikondisi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
           String[] ParaPelanggan = {"HADUH", "ARDINA", "ROBBY", "FATWA", "ULYA"};
        System.out.println("DAFTAR NAMA PELANGGAN");
        System.out.println("======================");
        
        for (int i = 0; i < ParaPelanggan.length; i++) {
            System.out.println((i + 1) + " " + ParaPelanggan[i]);
        }
        System.out.print("MASUKKAN ID = ");
        int idPelanggan = input.nextInt();

        System.out.print("MASUKKAN TOTAL PEMBELIAN = ");
        int total_Pemakaian = input.nextInt();

        int TarifperM3 = 5000;
        int pemakaian;
        pemakaian = total_Pemakaian;

        int total_Pembayaran = 10 * TarifperM3;
        pemakaian -= 10;
        TarifperM3 = 6000;

        if (pemakaian >= 10) {
            total_Pembayaran += 10 * TarifperM3;
            pemakaian -= 10;
            TarifperM3 = 7000;
        }
        else if (pemakaian >= 10) {
            total_Pembayaran += 10 * TarifperM3;
            pemakaian -= 10;
            TarifperM3 = 8000;
        }
        else {
            pemakaian = 0;
        }

        total_Pembayaran += pemakaian * TarifperM3;

        total_Pembayaran += 20000;

        System.out.println("================");
        System.out.println("RESI PEMBAYARAN");
        System.out.println("ID         = " + idPelanggan);
        System.out.println("Nama       = " + ParaPelanggan[idPelanggan - 1]);
        System.out.println("Pemakaian  = " + total_Pemakaian);
        System.out.println("Pembayaran = " + total_Pembayaran);
        System.out.println("================");
    
    }}
    
    

