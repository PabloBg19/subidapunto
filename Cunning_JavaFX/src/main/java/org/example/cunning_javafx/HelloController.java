package org.example.cunning_javafx;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import java.io.IOException;
import java.util.Optional;

public class HelloController {

    @FXML private Button btnAcceder;
    @FXML private Label lblInfo;
    @FXML private TextField txtUsuario;
    @FXML private VBox comunidadesContainer;
    @FXML private Label lblUsuarioMain;

    public static String usuarioActual = "";

    @FXML
    public void initialize() {
        if (lblUsuarioMain != null) {
            lblUsuarioMain.setText("Usuario: " + usuarioActual);
        }
        if (btnAcceder != null) {
            btnAcceder.setOnMouseEntered(e -> lblInfo.setText("Estado: Listo para conectar"));
            btnAcceder.setOnMouseExited(e -> lblInfo.setText(""));
        }
    }

    @FXML
    protected void onAccederClick() {
        try {
            usuarioActual = txtUsuario.getText();
            SceneManager.loadScene("main-view.fxml", "Cunning - Dashboard");
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    @FXML
    protected void onVolverClick() throws IOException {
        SceneManager.loadScene("login-view.fxml", "Cunning - Login");
    }

    @FXML
    protected void onAddCommunityClick() {
        TextInputDialog dialog = new TextInputDialog("Nueva Comunidad");
        dialog.setTitle("Añadir Comunidad");
        dialog.setHeaderText("Nombre de la nueva comunidad");
        Optional<String> result = dialog.showAndWait();

        result.ifPresent(name -> {
            if (comunidadesContainer != null) {
                Label nueva = new Label("Comunidad: " + name);
                nueva.setStyle("-fx-text-fill: white; -fx-font-size: 14px;");
                comunidadesContainer.getChildren().add(nueva);
            }
        });
    }

    @FXML
    protected void onInteractClick() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("Abriendo chat de la comunidad...");
        alert.show();
    }
}
