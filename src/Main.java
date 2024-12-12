import javax.swing.*;
import java.awt.*; //Para que funcione lo de new Dimension

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Calculadora basica"); //Titulo para la ventana
        frame.setContentPane(new Calculadora().calculadora); //Esto es para hacer referencia a tu panel (interfaz grafica que creaste)
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Accion que realizara cuando se cierre
        frame.setSize(500, 300); //Tamaño de la ventana
        frame.setPreferredSize(new Dimension(500, 300)); //Tamaño de la ventana preferido en caso de tener distintas resoluciones
        frame.setLocationRelativeTo(null); // Centra la ventana en pantalla
        frame.pack(); //Ajusta el tamaño de la ventana para que pueda tener dentro todos los componentes (asi ninguno sale recortado)
        frame.setVisible(true); //Para que se vea la ventana
    }
}