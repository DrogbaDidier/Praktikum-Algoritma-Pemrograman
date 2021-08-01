/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS;

/**
 *
 * @author Programming_18
 */

    import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ClickMe extends JFrame implements ActionListener {
	private JButton tombol;

	public ClickMe() {
		super ("Event Handling");	

		Container container = getContentPane();
		container.setLayout(new FlowLayout());		

		tombol = new JButton ("Click Me!");
		tombol.addActionListener(this);
		container.add(tombol);		

		setSize (200,100);
		setVisible (true);
	}
	
	public static void main (String arg[]) {
		ClickMe test = new ClickMe();
		test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void actionPerformed (ActionEvent e) {
		if (e.getSource() == tombol) {
			JOptionPane.showMessageDialog(null, "You click me, guys !!!");
		}
    }
}