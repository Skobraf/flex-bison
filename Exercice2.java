import javax.swing.*;
import java.awt.*;

public class Exercice2 {
    private JFrame frame;
    private JPanel contentPane;
    private JPanel northPanel;
    private JPanel labels, texts;
    private JButton modifier;
    private JLabel loginLabel, oldPassLabel, newPassLabel, confNewPassLabel;
    private JTextField loginText;
    private JPasswordField oldPassText, newPassText, confNewPassText;

    Exercice2() {
        frame = new JFrame();
        contentPane = new JPanel(new BorderLayout());
        northPanel = new JPanel(new BorderLayout());
        labels = new JPanel(new GridLayout(0, 1));
        texts = new JPanel(new GridLayout(0, 1));
        modifier = new JButton("Modifier");
        loginLabel = new JLabel("Login:");
        oldPassLabel = new JLabel("Mot de passe:");
        newPassLabel = new JLabel("Nouveau mot de passe:");
        confNewPassLabel = new JLabel("Retapez le nouveau mot de passe:");
        loginText = new JTextField(15);
        oldPassText = new JPasswordField(15);
        newPassText = new JPasswordField(15);
        confNewPassText = new JPasswordField(15);

        labels.add(loginLabel);
        labels.add(oldPassLabel);
        labels.add(newPassLabel);
        labels.add(confNewPassLabel);

        texts.add(loginText);
        texts.add(oldPassText);
        texts.add(newPassText);
        texts.add(confNewPassText);

        northPanel.add(labels, "West");
        northPanel.add(texts, "Center");

        contentPane.add(northPanel, "North");
        contentPane.add(modifier, "South");

        modifier.addActionListener(e -> {
            if (!newPassText.getText().trim().equals(confNewPassText.getText().trim())) {
                JOptionPane.showMessageDialog(contentPane, "Tapez le meme mot de passe", "Erreur", JOptionPane.ERROR_MESSAGE);
            }
        });

        frame.setContentPane(contentPane);
        frame.setDefaultCloseOperation(3);
        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Exercice2();
    }
}
