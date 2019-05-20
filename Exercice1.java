import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Exercice1 {
	/*
	 * 1 - Le composant primaire : JFrame
	 *     Deux étiquetes : JLabel 
	 *     Deux champs de texte : JTextField
	 *     Un boutton : JButton
	 * 
	 * 2 - On peut subdiviser l'interface en trois lignes et deux colonnes.
	 * 
	 * 3 - Le cadre global JFrame avec gestionnaire de placement BordeLayout
	 *     Un panneau interne avec gestionnaire de placement GridLayout
	 *     Un boutton
	 */
	static class Convertisseur1 extends JPanel {

		JLabel eDhs, eEuros;
		JTextField tDhs, tEuros;
		JButton bConversion;
		JPanel panneau;

		public Convertisseur1() {

			eDhs = new JLabel("Valeur en Dhs");
			eEuros = new JLabel("Valeur en Euros");

			tDhs = new JTextField(15);
			tEuros = new JTextField(15);

			bConversion = new JButton("Convertir");

			panneau = new JPanel(new GridLayout(2, 2));

			panneau.add(eDhs);
			panneau.add(tDhs);
			panneau.add(eEuros);
			panneau.add(tEuros);

			setLayout(new BorderLayout());

			add(panneau, BorderLayout.NORTH);
			add(bConversion, BorderLayout.SOUTH);
		}
	}

	static class Convertisseur2 extends JFrame {

		public Convertisseur2() {
			JPanel p1 = new JPanel(new BorderLayout());
			p1.add(new JLabel("Euros:"), BorderLayout.WEST);
			p1.add(new JTextField(7), BorderLayout.EAST);

			JPanel p2 = new JPanel(new BorderLayout());
			p2.add(new JButton("Euro -> Dh"), BorderLayout.WEST);
			p2.add(new JButton("Dh -> Euro"), BorderLayout.EAST);

			JPanel p3 = new JPanel(new BorderLayout());
			p3.add(new JLabel("Dhs:"), BorderLayout.WEST);
			p3.add(new JTextField(7), BorderLayout.EAST);

			JPanel p = new JPanel();
			p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));

			p.add(p3);
			p.add(p2);
			p.add(p1);

			setContentPane(p);

			setTitle("Convertisseur de device");
			setVisible(true);
			pack();
			setDefaultCloseOperation(3);
			setLocationRelativeTo(null);
		}
	}

	public static void main(String[] args) {

		JFrame f = new JFrame("Conversion de devise");

		f.add(new Convertisseur1());

		f.setTitle("Convertisseur de device");
		f.setVisible(true);
		f.pack();
		f.setDefaultCloseOperation(3);
		f.setLocationRelativeTo(null);

		new Convertisseur2();
	}

}
