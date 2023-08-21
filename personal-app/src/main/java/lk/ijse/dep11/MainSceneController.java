package lk.ijse.dep11;

import javafx.animation.FadeTransition;
import javafx.animation.RotateTransition;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;


public class MainSceneController {
    public ImageView imgvSplashScreen;
    public Label lblWelcome;
    public AnchorPane root;


    public void initialize(){
        RotateTransition rotate = new RotateTransition(Duration.millis(2000), imgvSplashScreen);
        rotate.setFromAngle(0);
        rotate.setToAngle(30);
        rotate.playFromStart();

        FadeTransition fade = new FadeTransition(Duration.millis(1500),lblWelcome);
        fade.setFromValue(0);
        fade.setToValue(1);
        fade.playFromStart();




    }


}
