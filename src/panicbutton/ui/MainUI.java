package panicbutton.ui;

import panicbutton.core.*;
import javax.swing.*;
import java.awt.*;

// IMPORT NECESSÁRIO para acessar a tela de configurações
import panicbutton.ui.ConfigUI;

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
        // AÇÃO: abrir tela de configurações
        configButton.addActionListener(e -> ConfigUI.exibirConfiguracoes(frame));
        panel.add(configButton);

        JButton exitButton = new JButton("Sair");
        exitButton.addActionListener(e -> System.exit(0));
        panel.add(exitButton);

        // AÇÃO: Clique no botão de pânico
        panicButton.addActionListener(e -> {
            // Cria um alerta básico do tipo notificação local
            Alert alerta = new BasicAlert();

            // Decora com mensagem e localização
            alerta = new MessageDecorator(alerta, "Ajuda urgente!");
            alerta = new LocationDecorator(alerta, "-7.1356, -34.8761"); // Simula João Pessoa - PB

            // Encapsula no comando
            AlertCommand comando = new AlertCommand(alerta::enviar);

            // Executa o comando
            comando.executar();

            // Mensagem de confirmação
            JOptionPane.showMessageDialog(frame, "Alerta de pânico enviado com sucesso!");
        });

        frame.getContentPane().add(panel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
