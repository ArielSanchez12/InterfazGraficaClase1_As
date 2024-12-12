import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora {
    public JPanel calculadora;
    private JTextField num2;
    private JTextField num1;
    private JButton sumarButton;
    private JButton restarButton;
    private JButton multiplicarButton;
    private JButton dividirButton;
    private JLabel lblT;
    private JLabel lblN2;
    private JLabel lblN1;
    private JLabel resultado;

    public Calculadora() {
        sumarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double numero1 = Double.valueOf(num1.getText());
                Double numero2 = Double.valueOf(num2.getText());
                resultado.setText(String.valueOf(numero1 + numero2));
            }
        });
        restarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double numero1 = Double.valueOf(num1.getText());
                Double numero2 = Double.valueOf(num2.getText());
                resultado.setText(String.valueOf(numero1 - numero2));
            }
        });
        multiplicarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double numero1 = Double.valueOf(num1.getText());
                Double numero2 = Double.valueOf(num2.getText());
                resultado.setText(String.valueOf(numero1 * numero2));
            }
        });
        dividirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double numero1 = Double.valueOf(num1.getText());
                Double numero2 = Double.valueOf(num2.getText());
                resultado.setText(String.valueOf(numero1 / numero2));
            }
        });
    }
}
