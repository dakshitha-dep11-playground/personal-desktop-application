package lk.ijse.dep11;

import javafx.animation.RotateTransition;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;


import java.io.IOException;

public class AppInitializer extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        AnchorPane root = FXMLLoader.load(getClass().getResource("/view/HTML5Editor.fxml"));
        Scene mainScene = new Scene(root);

        primaryStage.setScene(mainScene);
        primaryStage.setTitle("Splash Screen");

//        primaryStage.initStyle(StageStyle.TRANSPARENT);
//        root.setBackground(Background.fill(Color.TRANSPARENT));
//        mainScene.setFill(Color.TRANSPARENT);

        primaryStage.centerOnScreen();
        primaryStage.setResizable(false);
        primaryStage.show();

        //primaryStage.close();


    }
}
