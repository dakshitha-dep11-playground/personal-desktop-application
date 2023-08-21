package lk.ijse.dep11;

import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

import java.io.IOException;
import java.util.Objects;

public class HTML5EditorController {

    public MenuItem menuItemExit;
    public MenuItem menuItemNew;
    public MenuItem menuItemUserGuide;
    public MenuItem menuItemAboutUs;
    public AnchorPane HTroot;

    public void initialize() throws InterruptedException, IOException {
        //Thread.sleep(1995);

//        AnchorPane rootHTMLEditor = FXMLLoader.load(getClass().getResource("/view/HTML5Editor.fxml"));
//        Scene sceneHTMLEditor = new Scene(rootHTMLEditor);
//
//        Stage primaryStage = new Stage();
//        primaryStage.setScene(sceneHTMLEditor);
//        primaryStage.setTitle("Personal App");
//        primaryStage.setMaximized(true);
//        primaryStage.alwaysOnTopProperty();
//        primaryStage.centerOnScreen();
//        primaryStage.show();

        //Stage stage = new Stage();

    }

    public void menuItemSitOnAction(ActionEvent actionEvent) {
        System.exit(0);
    }

    public void menuItemNewSetOnAction(ActionEvent actionEvent) throws IOException {
        AnchorPane HTMLroot = FXMLLoader.load(getClass().getResource("/view/HTML5Editor.fxml"));
        Scene htmlScene = new Scene(HTMLroot);

        Stage primaryStage = (Stage) HTroot.getScene().getWindow();
        primaryStage.setScene(htmlScene);
        primaryStage.setTitle("Text Editor");
        primaryStage.setMaximized(true);
        primaryStage.setResizable(true);
        primaryStage.centerOnScreen();
        primaryStage.alwaysOnTopProperty();
        primaryStage.show();
    }

    public void menuItemAboutUsSetOnAction(ActionEvent actionEvent) throws IOException {
        AnchorPane aboutUsRoot = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/view/AboutUs.fxml")));
        Scene aboutUsScene = new Scene(aboutUsRoot);

        Stage primaryStage = new Stage();
        primaryStage.setScene(aboutUsScene);
        //primaryStage.setTitle("Text Editor");
        //primaryStage.setMaximized(true);

        primaryStage.initStyle(StageStyle.TRANSPARENT);
        aboutUsRoot.setBackground(Background.fill(Color.TRANSPARENT));
        aboutUsScene.setFill(Color.TRANSPARENT);

        FadeTransition fade = new FadeTransition(Duration.millis(2000),aboutUsRoot);
        fade.setFromValue(0);
        fade.setToValue(1);
        fade.playFromStart();

        primaryStage.setResizable(false);
        primaryStage.centerOnScreen();
        primaryStage.alwaysOnTopProperty();
        primaryStage.sizeToScene();
        primaryStage.show();


    }

    public void menuItemUserGuideSetOnAction(ActionEvent actionEvent) throws IOException {
        


    }
}
