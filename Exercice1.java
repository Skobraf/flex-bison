package ma.fsr.smi.tp3;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Exercice1 {

	@SuppressWarnings("serial")
	static class Calculatrice extends JPanel {

		private JPanel pCenter, pEast;
		private String bCenter[] = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", ".", "=" };
		private String bEast[] = { "+", "-", "*", "/" };

		Calculatrice() {

			pCenter = new JPanel(new GridLayout(4, 0));
			for (String s : bCenter) {
				pCenter.add(new JButton(s));
			}

			pEast = new JPanel(new GridLayout(4, 0));
			for (String s : bEast) {
				pEast.add(new JButton(s));
			}

			setLayout(new BorderLayout(5, 5));

			add(pCenter, "Center");
			add(new JTextField(), "North");
			add(pEast, "East");
		}
	}

	@SuppressWarnings("serial")
	static class Calculatrice2 extends JFrame {

		private JPanel pPrinc, pCenter, pEast;
		GridBagConstraints gc = new GridBagConstraints();

		Calculatrice2() {

			pPrinc = new JPanel(new BorderLayout(2, 2));
			pCenter = new JPanel(new GridBagLayout());
			pEast = new JPanel(new GridBagLayout());

			gc.fill = GridBagConstraints.BOTH;
			gc.insets = new Insets(0, 0, 0, 0);
			gc.ipady = gc.anchor = GridBagConstraints.CENTER;
			
			gc.weightx = 3;
			gc.weighty = 4;

			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					gc.gridx = i;
					gc.gridy = j;
					pCenter.add(new JButton(String.valueOf(i * 3 + (j + 1))), gc);
				}
			}

			gc.gridx = 0;
			gc.gridy = 3;
			pCenter.add(new JButton("0"), gc);

			gc.gridwidth = 2;
			gc.gridx = 1;
			gc.gridy = 3;
			pCenter.add(new JButton("="), gc);
			
			gc.weightx = 2;
			
			gc.gridwidth = 2;
			gc.gridx = 0;
			gc.gridy = 0;
			pEast.add(new JButton("AC"), gc);

			gc.gridwidth = 1;

			String tabS[] = { "+", "*", "-", "/", "(", ")" };

			for (int i = 1, k = 0; i <= 3; i++) {
				for (int j = 0; j < 2; j++) {
					gc.gridx = j;
					gc.gridy = i;
					pEast.add(new JButton(tabS[k++]), gc);
				}
			}

			pPrinc.add(pCenter, "Center");
			pPrinc.add(pEast, "East");
			pPrinc.add(new JTextField(), "North");

			setContentPane(pPrinc);
			setVisible(true);
			pack();
			setLocationRelativeTo(null);
			setDefaultCloseOperation(3);
		}
	}

	public static void main(String[] args) {

		// JFrame f = new JFrame("Calculatrice");
		//
		// f.setContentPane(new Calculatrice());
		//
		// f.setVisible(true);
		// f.setLocationRelativeTo(null);
		// f.setSize(250, 200);
		// f.setDefaultCloseOperation(3);

		new Calculatrice2();
	}

}
