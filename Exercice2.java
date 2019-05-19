package ma.fsr.smi.tp3;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Exercice2 {

	@SuppressWarnings("serial")
	static class Echeque extends JFrame {
		Echeque() {
			JPanel p = new JPanel(new GridLayout(8, 8));
			
			for (int i = 0; i < 8; i++) {
				for (int j = 0; j < 8; j++) {
					JButton b = new JButton();
					b.setBackground((i + j) % 2 == 0 ? Color.white : Color.GRAY);
					p.add(b);
				}
			}
			
			setTitle("Echeque");
			setContentPane(p);
			setVisible(true);
			setSize(400, 400);
			setLocationRelativeTo(null);
			setDefaultCloseOperation(3);
		}
	}

	public static void main(String[] args) {
		new Echeque();
	}

}
