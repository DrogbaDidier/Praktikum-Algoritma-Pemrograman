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
public class Nomor2A_While {
    public static void main(String[] args) {
        int data2[][] = {{4, 6, 4, 2, 8, 4, 2, 10}, {4, 2, 4, 2, 8, 4, 2, 10}};
        System.out.println("While");
        int rc = 0;
        while (rc < data2.length) {
            System.out.println();
            System.out.println("Array ke-" + rc);
            int cr = 0;

            while (cr < data2[rc].length) {
                System.out.print(data2[rc][cr] + ",");
                cr++;
            }
            rc++;
        }
    }
}
