/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul6;

/**
 *
 * @author Programming_18
 */
public class Nomor1B {
    public static void main(String[] args) {
        int data2[][] = {{4,6,4,2,8,4,2,10},{4,2,4,2,8,4,2,10}};
        for (int a = 0; a < data2.length; a++) {
            for (int b = 0; b < data2[0].length; b++) {
                System.out.print(data2[a][b]+" ");
            }
            System.out.println("\n");
        }
    }
}
