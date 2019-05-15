package ma.fsr.smi.tp3;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class Fenetre extends JFrame {
	private JButton bouton1, bouton2, bouton3, bouton4, bouton5;

	public Fenetre(String titre) {
		setTitle(titre);
		setSize(500, 300);
		Container c = getContentPane();
		JPanel panneau = new JPanel();
		c.add(panneau, "North");
		panneau.setLayout(new GridLayout(2, 3, 10, 15));
		bouton1 = new JButton("BOUTON1");
		panneau.add(bouton1, "1");
		bouton2 = new JButton("BOUTON2");
		panneau.add(bouton2, "2");
		bouton3 = new JButton("BOUTON3");
		panneau.add(bouton3, "3");
		bouton4 = new JButton("BOUTON4");
		panneau.add(bouton4, "4");
		bouton5 = new JButton("BOUTON5");
		panneau.add(bouton5, "5");
		setLocationRelativeTo(this.getParent());
		setDefaultCloseOperation(3);
	}
}

public class GridLayoutDemo {
	public static void main(String[] args) {
		JFrame f = new Fenetre("Mise en forme : SMI-S6-2015");
		f.setVisible(true);
	}
}