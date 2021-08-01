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
public class Nomor3 {
    public static void main(String[] args) {
        String rc[][] = {{"ABDUL", "Kediri", "085646668991"}, {"KUSNO", "Trenggalek", "085646668991"}, {"PONIRAN", "Bojonegoro", "085646668999"}};
        System.out.println("|NAMA  \t\t\t  |ALAMAT \t\t  |TELEPON");
        System.out.println("===========================" + "======================");

        for (int i = 0; i < rc.length; i++) {
            for (int j = 0; j < rc[i].length; j++) {
                System.out.print("|" +rc[i][j] + "   \t\t");
            }
            System.out.println();
        }
    }
}
