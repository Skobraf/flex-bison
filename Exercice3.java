package TP5;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Exercice3 {
    private JFrame f;
    private JPanel contentPane;

    public Exercice3() {
        f = new JFrame();
        contentPane = new JPanel();

        contentPane.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println(e.getClickCount());
            }
        });

        f.setContentPane(contentPane);
        f.setDefaultCloseOperation(3);
        f.setLocationRelativeTo(null);
        f.setSize(300, 150);
        f.setVisible(true);
    }
}
