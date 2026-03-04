import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Dimension;

public class PantallaInicioSesion {
    private JPanel Pantalla;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JButton iniciarSesiónButton;
    private JButton continuarConGoogleButton;

    public PantallaInicioSesion() {
        Pantalla.setPreferredSize(new Dimension(350, 600));
        iniciarSesiónButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Crear nueva ventana
                JFrame frame = new JFrame("Cunning");
                PantallaPrincipal principal = new PantallaPrincipal();

                frame.setContentPane(principal.getPantallaPrincipal());
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setSize(350, 450);
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);

                // Cerrar ventana actual
                JFrame ventanaActual = (JFrame) SwingUtilities.getWindowAncestor(Pantalla);
                ventanaActual.dispose();
            }
        });
    }

    public JPanel getPantalla() {
        return Pantalla;
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Cunning");
        frame.setContentPane(new PantallaInicioSesion().Pantalla);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(350, 600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }


}