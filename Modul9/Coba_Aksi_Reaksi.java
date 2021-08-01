/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul9;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author Programming_18
 */
public class Coba_Aksi_Reaksi extends JFrame {
    JTextArea nama = new JTextArea(10, 10);
    Button bt = new Button("Copy");
    JTextArea txnama = new JTextArea(10, 10);
    
    Coba_Aksi_Reaksi(){
        super("Absensi Mahasantri");
        setLocation(200, 100);
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    void tampilan(){
        getContentPane().add(nama);
        nama.append("nama kamu siapa");
        getContentPane().add(bt);
        getContentPane().add(txnama);
        txnama.setBackground(Color.LIGHT_GRAY);
        getContentPane().setLayout(new FlowLayout());
        setVisible(true);
    }
    void aksi_reaksi(){
        bt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                txnama.append(nama.getSelectedText());
            }
        });
    }
    
    public static void main(String[] args) {
        Coba_Aksi_Reaksi f = new Coba_Aksi_Reaksi();
        f.tampilan();
        f.aksi_reaksi();
    }
    
    
}
