/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul7;

/**
 *
 * @author Programming_18
 */
class segiempat {
    public void segiempat(int panjang, int lebar){
        double luas;
        double keliling;
        luas=panjang*lebar;
        System.out.println("-----------------------");
        System.out.println("Panjang segiempat = "+panjang);
        System.out.println("Lebar segiempat = "+lebar);
        System.out.println("Luas segiempat = "+luas);
    }
    public static void main(String[] args) {
        segiempat se=new segiempat();
        se.segiempat(10, 5);
}
}
