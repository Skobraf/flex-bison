package ma.fsr.smi.tp3;

import java.awt.CardLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CardLayoutDemo {
	static class Fenetre extends JFrame implements ActionListener {
		private JButton bouton1, bouton2, bouton3, bouton4, bouton5;
		private JButton pre, suiv, prem, der;
		private JPanel panneau1, panneau2;
		private CardLayout pile;

		public Fenetre(String titre) {
			setTitle(titre);
			setSize(400, 300);
			Container c = getContentPane();
			panneau1 = new JPanel();
			c.add(panneau1);
			panneau2 = new JPanel();
			c.add(panneau2, "North");
			pile = new CardLayout(15, 15);
			panneau1.setLayout(pile);
			bouton1 = new JButton("BOUTON1");
			panneau1.add(bouton1, "1");
			bouton2 = new JButton("BOUTON2");
			panneau1.add(bouton2, "2");
			bouton3 = new JButton("BOUTON3");
			panneau1.add(bouton3, "3");
			bouton4 = new JButton("BOUTON4");
			panneau1.add(bouton4, "4");
			bouton5 = new JButton("BOUTON5");
			panneau1.add(bouton5, "5");
			pre = new JButton("precedent");
			panneau2.add(pre);
			pre.addActionListener(this);
			suiv = new JButton("suivant");
			panneau2.add(suiv);
			suiv.addActionListener(this);
			prem = new JButton("premier");
			panneau2.add(prem);
			prem.addActionListener(this);
			der = new JButton("dernier");
			panneau2.add(der);
			der.addActionListener(this);
			setDefaultCloseOperation(3);
		}

		public void actionPerformed(ActionEvent a) {
			JButton source = (JButton) a.getSource();
			if (source == pre)
				pile.previous(panneau1);
			if (source == suiv)
				pile.next(panneau1);
			if (source == prem)
				pile.first(panneau1);
			if (source == der)
				pile.last(panneau1);

		}
	}

	public static void main(String[] args) {
		JFrame f = new Fenetre("Mise en forme : SMI-S6-2015");
		f.setVisible(true);
	}
}