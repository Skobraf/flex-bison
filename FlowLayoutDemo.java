package ma.fsr.smi.tp3;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutDemo {
	static class Fenetre extends JFrame {
		private JButton bouton1, bouton2, bouton3, bouton4, bouton5;

		public Fenetre(String titre) {
			setTitle(titre);
			setSize(300, 300);
			Container c = getContentPane();
			c.setLayout(new FlowLayout(FlowLayout.LEFT) );
			bouton1 = new JButton("BOUTON1");
			c.add(bouton1);
			bouton2 = new JButton("BOUTON2");
			c.add(bouton2);
			bouton3 = new JButton("BOUTON3");
			c.add(bouton3);
			bouton4 = new JButton("BOUTON4");
			c.add(bouton4);
			bouton5 = new JButton("BOUTON5");
			c.add(bouton5);
			setLocationRelativeTo(this.getParent());
			setDefaultCloseOperation(3);
		}
	}
	
	public static void main(String[] args) {
		JFrame f = new Fenetre("Mise en forme : SMI-S6-2015");
		f.setVisible(true);
	}
}