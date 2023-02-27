package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class Controller {

    @FXML
    private ImageView leader;
    Image myImage1 = new Image(getClass().getResourceAsStream("matekane.png"));
    Image myImage2 = new Image(getClass().getResourceAsStream("Vahagn_Khachaturyan armriana.jpg"));
    Image myImage3 = new Image(getClass().getResourceAsStream("Maada Bio siarra.png"));
    Image myImage4 = new Image(getClass().getResourceAsStream("Gabon.jpg"));
    Image myImage5 = new Image(getClass().getResourceAsStream("Austia.jpg"));
    Image myImage6 = new Image(getClass().getResourceAsStream("Alar_Karis_December Estonia.jpg"));



    @FXML
    AnchorPane one, two, three;

    public void lesotho() {
        one.setStyle("-fx-background-color: blue");
        two.setStyle("-fx-background-color: white");
        three.setStyle("-fx-background-color: green");

        leader.setImage(myImage1);
    }

    public void armenia() {
        one.setStyle("-fx-background-color: maroon");
        two.setStyle("-fx-background-color: darkblue");
        three.setStyle("-fx-background-color: gold");
        leader.setImage(myImage2);
    }

    public void austria() {
        one.setStyle("-fx-background-color: tomato");
        two.setStyle("-fx-background-color: white");
        three.setStyle("-fx-background-color: tomato");
        leader.setImage(myImage5);
    }

    public void estonia() {
        one.setStyle("-fx-background-color: darkblue");
        two.setStyle("-fx-background-color: black");
        three.setStyle("-fx-background-color: white");
        leader.setImage(myImage6);
    }

    public void gabon() {
        one.setStyle("-fx-background-color: green");
        two.setStyle("-fx-background-color: yellow");
        three.setStyle("-fx-background-color: darkblue");
        leader.setImage(myImage4);
    }

    public void seirra(){
        one.setStyle("-fx-background-color: green");
        two.setStyle("-fx-background-color: white");
        three.setStyle("-fx-background-color: #0072c6");
        leader.setImage(myImage3);
    }

    public void cancel(){
        one.setStyle("-fx-background-color: lightblue");
        two.setStyle("-fx-background-color: white");
        three.setStyle("-fx-background-color: lightgreen");
        leader.setImage(null);
        System.gc();
    }


    @FXML
    private void exit(ActionEvent event) {
        System.exit(0);
        Platform.exit();
    }
}