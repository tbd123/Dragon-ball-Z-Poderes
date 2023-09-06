/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nivelespoderapp;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author Camilo
 */
public class NivelesPoderApp extends JFrame {
    private JComboBox<String> saiyajinComboBox;
    private JLabel nivelLabel;

    //  nombre del Saiyajin y su nivel de poder
    private String[] saiyajins = {"Goku", "Vegeta", "Gohan", "Trunks"};
    private int[] nivelesPoder = {10000, 8500, 6000, 7500};

    public NivelesPoderApp() {
        setTitle("Selector de Niveles de Poder de Saiyajin");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 150);

        saiyajinComboBox = new JComboBox<>(saiyajins);
        nivelLabel = new JLabel("Nivel de poder:");

        saiyajinComboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = saiyajinComboBox.getSelectedIndex();
                if (selectedIndex >= 0) {
                    int nivel = nivelesPoder[selectedIndex];
                    nivelLabel.setText("Nivel de poder: " + nivel);
                }
            }
        });

        JPanel panel = new JPanel(new GridLayout(2, 1));
        panel.add(saiyajinComboBox);
        panel.add(nivelLabel);

        add(panel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            NivelesPoderApp app = new NivelesPoderApp();
            app.setVisible(true);
        });
    }
}
