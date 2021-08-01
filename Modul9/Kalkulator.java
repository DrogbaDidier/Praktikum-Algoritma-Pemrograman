/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul9;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Kalkulator extends JFrame {
    String operasi = "";
    double b=0;
    double c =0;
    double total=0;

    JTextField isi = new JTextField();
    Button b1 = new Button("1");
    Button b2 = new Button("2");
    Button b3 = new Button("3");
    Button b4 = new Button("+");
    Button b5 = new Button("4");
    Button b6 = new Button("5");
    Button b7 = new Button("6");
    Button b8 = new Button("-");
    Button b9 = new Button("7");
    Button b10 = new Button("8");
    Button b11 = new Button("9");
    Button b12 = new Button("*");
    Button b13 = new Button("c");
    Button b14 = new Button("0");
    Button b15 = new Button("=");
    Button b16 = new Button("/");
    
    Kalkulator() {
        setTitle("Kalkulator Modul 9");
        setLocation(200, 100);
        setSize(300, 330);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    void objek() {
        getContentPane().setLayout(null);
        getContentPane().add(isi);
        getContentPane().setBackground(Color.BLACK);
        getContentPane().add(b1);
        getContentPane().add(b2);
        getContentPane().add(b3);
        getContentPane().add(b4);
        getContentPane().add(b5);
        getContentPane().add(b6);
        getContentPane().add(b7);
        getContentPane().add(b8);
        getContentPane().add(b9);
        getContentPane().add(b10);
        getContentPane().add(b11);
        getContentPane().add(b12);
        getContentPane().add(b13);
        getContentPane().add(b14);
        getContentPane().add(b15);
        getContentPane().add(b16);

        isi.setBounds(50, 8, 190, 50);

        b1.setBounds(50, 70, 40, 40);
        b2.setBounds(100, 70, 40, 40);
        b3.setBounds(150, 70, 40, 40);
        b4.setBounds(200, 70, 40, 40);

        b5.setBounds(50, 120, 40, 40);
        b6.setBounds(100, 120, 40, 40);
        b7.setBounds(150, 120, 40, 40);
        b8.setBounds(200, 120, 40, 40);

        b9.setBounds(50, 170, 40, 40);
        b10.setBounds(100, 170, 40, 40);
        b11.setBounds(150, 170, 40, 40);
        b12.setBounds(200, 170, 40, 40);

        b13.setBounds(50, 220, 40, 40);
        b14.setBounds(100, 220, 40, 40);
        b15.setBounds(150, 220, 40, 40);
        b16.setBounds(200, 220, 40, 40);

        b4.setBackground(Color.orange);
        b8.setBackground(Color.yellow);
        b12.setBackground(Color.orange);
        b13.setBackground(Color.yellow);
        
        b15.setBackground(Color.orange);
        b16.setBackground(Color.yellow);
        setVisible(true);
    }
    void tombol() 
    {
        b1.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent ae) 
            {
                isi.setText(isi.getText()+"1");
            }
        });
        
        b2.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent ae) 
            {
                isi.setText(isi.getText()+"2");
            }
        });
        
        b3.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent ae) 
            {
                isi.setText(isi.getText()+"3");
            }
        });
        
        b4.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent ae) 
            {
                b=Double.parseDouble(isi.getText());
                isi.setText(null);
                operasi=("+");
               
            }
        });
        
        b5.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent ae) 
            {
                isi.setText(isi.getText()+"4");
            }
        });
        
        b6.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent ae) 
            {
                isi.setText(isi.getText()+"5");
            }
        });
        
        b7.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent ae) 
            {
                isi.setText(isi.getText()+"6");
            }
        });
        
        b8.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent ae) 
            {
                b=Double.parseDouble(isi.getText());
                isi.setText(null);
                operasi=("-");
            }
        });
        
        b9.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent ae) 
            {
                isi.setText(isi.getText()+"7");
            }
        });
        
        b10.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent ae) 
            {
                isi.setText(isi.getText()+"8");
            }
        });
        
        b11.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent ae) 
            {
                isi.setText(isi.getText()+"9");
            }
        });
        
        b12.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent ae) 
            {
                b=Double.parseDouble(isi.getText());
                isi.setText(null);
                operasi=("*");
            }
        });
        
        b13.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent ae) 
            {
                isi.setText("");
            }
        });
        
        b14.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent ae) 
            {
                isi.setText(isi.getText()+"0");
                
            }
        });
        
        b15.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent ae) 
            {
                c=Double.parseDouble(isi.getText());
                try {
                    if (operasi.equals("+"))
                    {
                        total = b+c;
                    }
                    
                    else if (operasi.equals("-"))
                    {
                        total = b-c;
                    }
                    
                    else if (operasi.equals("*"))
                    {
                        total = b*c;
                    }
                    
                    else if (operasi.equals("/"))
                    {
                        total = b/c;
                    }
                    isi.setText(Double.toString(total));
                } catch (Exception e) {
                }
                
            }
        });
        
        b16.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent ae) 
            {
                b=Double.parseDouble(isi.getText());
                isi.setText(null);
                operasi=("/");
            }
        });
    }
    
    public static void main(String[] args) 
    {
        Kalkulator zz = new Kalkulator();
        zz.objek();
        zz.tombol();
    }
}
