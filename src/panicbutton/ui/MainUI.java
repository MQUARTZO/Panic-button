package panicbutton.ui;

import javax.swing.*;
import java.awt.*;

public class MainUI {
    public static void launchUI() {
        JFrame frame = new JFrame("Panic Button");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 1, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JLabel title = new JLabel("Aplicativo de Botão de Pânico", SwingConstants.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 16));
        panel.add(title);

        JButton panicButton = new JButton("Ativar Botão de Pânico");
        panel.add(panicButton);

        JButton configButton = new JButton("Configurações");
        panel.add(configButton);

        JButton exitButton = new JButton("Sair");
        exitButton.addActionListener(e -> System.exit(0));
        panel.add(exitButton);

        frame.getContentPane().add(panel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
