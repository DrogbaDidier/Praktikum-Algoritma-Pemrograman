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
public class bacakonsol2 {
    public static void main(String[] args) {
        System.out.print("data1= ");
        inputconsole ic=new inputconsole();
        int data1= ic.readInt();
        System.out.print("data2= ");
        int data2= ic.readInt();
        int data3= data1+data2;
        System.out.println("data1 + data2 = "+data3);
    }
}
