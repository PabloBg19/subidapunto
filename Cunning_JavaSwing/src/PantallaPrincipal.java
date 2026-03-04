import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PantallaPrincipal {
    private JPanel PantallaPrincipal;
    private JButton cerrarSesiónButton;

    public PantallaPrincipal() {

        cerrarSesiónButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int opcion = JOptionPane.showConfirmDialog(
                        PantallaPrincipal,
                        "¿Seguro que quieres cerrar sesión?",
                        "Confirmar cierre de sesión",
                        JOptionPane.YES_NO_OPTION
                );

                if (opcion == JOptionPane.YES_OPTION) {

                    // Crear ventana de inicio de sesión
                    JFrame frame = new JFrame("Cunning");

                    PantallaInicioSesion inicio = new PantallaInicioSesion();
                    frame.setContentPane(inicio.getPantalla());

                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.pack();
                    frame.setLocationRelativeTo(null);
                    frame.setVisible(true);

                    // Cerrar ventana actual
                    JFrame ventanaActual = (JFrame) SwingUtilities.getWindowAncestor(PantallaPrincipal);
                    ventanaActual.dispose();
                }
            }
        });
    }

    public JPanel getPantallaPrincipal() {
        return PantallaPrincipal;
    }
}