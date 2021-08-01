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
public class Nomor2B {
    public static void main(String[] args) {
        int data7[][] = {{4, 6, 4, 2, 8, 4, 2, 10}, {4, 2, 4, 2, 8, 4, 2, 10}};
        double ratarata = 0;
                for (int i = 0; i < data7.length; i++){
                    for (int j = 0; j < data7[0].length; j++)
                    ratarata += data7[i][j];
                    ratarata /=data7[i].length;
                    System.out.println("Rata-rata Array ke = "+ i +" = "+ratarata);
                    ratarata= 0;
        }
    }
}