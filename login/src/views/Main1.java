package views;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main1 extends Application {

    public static Stage mainStage;
    @Override
    public void start(Stage primaryStage) throws Exception {
        mainStage = primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("/views/login.fxml"));
        primaryStage.setScene(new Scene(root, 1135, 480));
        primaryStage.setTitle("T2210A JavaFX Demo");
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
