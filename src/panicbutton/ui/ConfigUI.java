package panicbutton.ui;

import panicbutton.core.SettingsManager;

import javax.swing.*;
import java.awt.*;

public class ConfigUI {

    public static void exibirConfiguracoes(JFrame parentFrame) {
        JDialog dialog = new JDialog(parentFrame, "Configurações", true);
        dialog.setSize(400, 250);
        dialog.setLayout(new BorderLayout());
        dialog.setLocationRelativeTo(parentFrame);

        JPanel inputPanel = new JPanel(new GridLayout(4, 1, 10, 10));
        inputPanel.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));

        JTextField msgField = new JTextField(SettingsManager.getInstance().getMensagem());
        JTextField localField = new JTextField(SettingsManager.getInstance().getLocalizacao());

        inputPanel.add(new JLabel("Mensagem personalizada:"));
        inputPanel.add(msgField);
        inputPanel.add(new JLabel("Localização simulada:"));
        inputPanel.add(localField);

        JPanel buttonPanel = new JPanel();
        JButton salvar = new JButton("Salvar");
        salvar.addActionListener(e -> {
            SettingsManager.getInstance().setMensagem(msgField.getText());
            SettingsManager.getInstance().setLocalizacao(localField.getText());
            JOptionPane.showMessageDialog(dialog, "Configurações salvas com sucesso!");
            dialog.dispose();
        });
        buttonPanel.add(salvar);

        dialog.add(inputPanel, BorderLayout.CENTER);
        dialog.add(buttonPanel, BorderLayout.SOUTH);

        dialog.setVisible(true);
    }
}
