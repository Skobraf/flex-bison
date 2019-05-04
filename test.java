package projet;


import javax.swing.JFrame;

public class test {
	public static void main(String[] args) {
		JFrame fenetre = new JFrame();
		fenetre.setTitle("Ma fentre");
		fenetre.setSize(300,200);
		fenetre.setResizable(false);
		fenetre.setLocationRelativeTo(null);
		fenetre.setVisible(true);
	
	}
}

//

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
public class Fenetre extends JFrame {
	public Fenetre() {
		this.setTitle("Mon paneau");
		this.setSize(300,200);
		this.setLocationRelativeTo(null);
		JPanel panneau = new JPanel();
		panneau.setBackground(Color.orange);
		this.setContentPane(panneau);
		this.setVisible(true);
	}
}

 public class Paneau1 {
	 public static void main (String[] args) {
		 Fenetre fenetre = new Fenetre();
		 fenetre.setVisible(true);
	 }
 }