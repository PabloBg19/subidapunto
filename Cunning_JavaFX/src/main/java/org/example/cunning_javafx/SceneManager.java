package org.example.cunning_javafx;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class SceneManager {
    private static Stage primaryStage;

    // Configura el Stage al inicio de la aplicación
    public static void setStage(Stage stage) {
        primaryStage = stage;
    }

    /**
     * Carga una nueva escena y actualiza el título.
     * @param fxml El nombre del archivo .fxml (ej: "main-view.fxml")
     * @param title El título de la ventana
     */
    public static void loadScene(String fxml, String title) throws IOException {
        if (primaryStage == null) {
            System.err.println("Error: Stage no inicializado en SceneManager.");
            return;
        }

        FXMLLoader fxmlLoader = new FXMLLoader(SceneManager.class.getResource(fxml));
        Scene scene = new Scene(fxmlLoader.load());

        // Carga los estilos CSS globales si existen
        String css = SceneManager.class.getResource("style.css").toExternalForm();
        if (css != null) {
            scene.getStylesheets().add(css);
        }

        primaryStage.setTitle(title);
        primaryStage.setScene(scene);

        // Importante: No llamamos a stage.show() aquí porque ya se llamó
        // en HelloApplication al arrancar.
    }
}
