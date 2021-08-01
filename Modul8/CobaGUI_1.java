/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul8;
import javax.swing.*;
import java.awt.*;
public class CobaGUI_1 extends JFrame{
    Button cb1 = new Button("Pilih A");
    Button cb2 = new Button("Pilih B");
    CobaGUI_1(){
        setTitle("Progarm GUI Pertamaku");
        setLocation(200,100);
        setSize(200,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    void objek(){
        getContentPane().setLayout(new FlowLayout());
        getContentPane().setBackground(Color.GREEN);
        cb1.setBackground(Color.MAGENTA);
        cb2.setBackground(Color.MAGENTA);
        getContentPane().add(cb1);
        getContentPane().add(cb2);
        setVisible(true);
    }
    public static void main(String[]args){
        CobaGUI_1  ZZ = new CobaGUI_1();
        ZZ.objek();
    }
}