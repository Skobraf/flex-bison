import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;

import javax.swing.*;

public class test extends JFrame imlpements ActionListener{
	JButton b;
	public test() {
	super();
	setDefaultCloseOperation(3);
	setSize(600,600);
	setLocationRelativeTo(null);
	JPanel p = new JPanel(new GridLayout(8,8));
	for(int i = 0; i <8 ;i++) {
		for(int j = 0; j < 8; j++ ) {
			b.setBackground(i + j %2 == 0 ? Color.WHITE : Color.GRAY);
			b.addActionListener(this);
			b.setActionCommand((char) ('A' + j) + " "+ (8 - i));
			p.add(b);
		}
	}
	this.add(p);
	this.pack();
}}
public void actionPerformed (ActionEvent e) {
	system.out.print(e.getActionCommand());
}
public static void main(String[] args) {
	new test();
	
	
}