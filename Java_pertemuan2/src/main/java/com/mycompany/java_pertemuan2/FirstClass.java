/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.java_pertemuan2;
import java.util.Scanner;
/**
 *
 * @author A-3
 */
public class FirstClass {
    public static void main(String[] args) {
        System.out.println("Halo, Ini adalah Tugas Java OOP pertemuan 2\n");
        int nilaiA = 10;
        int nilaiB = 20;
    
        double nilaidouble1 = 11.2;
        double nilaidouble2 = 14.6;
    
        boolean isPlus = true;
    
        String iniString = "";
    
        
        Scanner input = new Scanner(System.in);
        
        
               
        System.out.println("Masukkan nilai A (Bilangan Integer) : ");
        nilaiA = input.nextInt();
        System.out.println("nilaiA = " + nilaiA);
        
        System.out.println("Masukkan nilai B (Bilangan Integer): ");
        nilaiA = input.nextInt();
        System.out.println("nilaiB = " + nilaiB);
        
        System.out.println("Masukkan Nama: ");
        iniString = input.nextLine();
        iniString = input.nextLine();
        System.out.println("Nama: " + iniString);
        
        System.out.println("Masukkan nilai Double 1 (Bilangan Double): ");
        nilaidouble1 = input.nextDouble();
        System.out.println("nilaidouble1 = " + nilaidouble1);
        
        System.out.println("Masukkan nilai Double 2 (Bilangan Double): ");
        nilaidouble2 = input.nextDouble();
        System.out.println("nilaidouble2 = " + nilaidouble2);
        
        System.out.println("Masukkan nilai Boolean (true atau false): ");
        isPlus = input.nextBoolean();
        System.out.println("isiPlus = " + isPlus);     
    }
}
