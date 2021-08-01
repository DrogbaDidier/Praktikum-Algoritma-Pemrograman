/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul7;

import java.util.Scanner;

/**
 *
 * @author Programming_18
 */
public class VolumeTabung {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
       
        //deklarasi variabel
        double v, r, d, t;
        double phi  =  Math.PI;
       
        //input nilai yang di ketahui
        System.out.print("Masukkan nilai diameter tabung : ");
        d  =  input.nextDouble();
        System.out.print("Masukkan nilai panjang tabung  : ");
        t = input.nextDouble();
       
        //proses
        r = d / 2;
        v = (phi * Math.pow(r, 2) * t);
       
        //output
        System.out.println("Volume Tabungnya adalah : " +  v);
    }
}
