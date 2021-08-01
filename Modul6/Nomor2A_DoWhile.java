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
public class Nomor2A_DoWhile {
    public static void main(String[] args) {
        int data2[][] = {{4, 6, 4, 2, 8, 4, 2, 10}, {4, 2, 4, 2, 8, 4, 2, 10}};
        System.out.println("Do-While");
        int r = 0;
        
        do {            
            System.out.println();
            System.out.println("Array Baris ke = "+r);
            int c = 0;
            do {                
                System.out.print(data2[r][c]+",");
                c++;
            } while (c < data2[r].length);
            r++;
        } while (r < data2.length);
    }
}
