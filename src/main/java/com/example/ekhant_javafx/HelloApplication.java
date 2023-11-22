package com.example.ekhant_javafx;

import javafx.application.Application;
import javafx.event.*;
import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;

public class HelloApplication extends Application {
    Stage window;
    Scene scene1, scene2;
    @Override
    public void start(Stage stage){
        window = stage;
        window.setTitle("Edward's First JavaFX Application");
        window.setMinWidth(500);
        window.setMinHeight(500);

        Label scene1Label = new Label("This is Scene 1");
        Button scene1Button = new Button("Go to Scene 2");
        scene1Button.setOnAction(e -> window.setScene(scene2));


        VBox scene1Layout = new VBox(20);
        scene1Layout.getChildren().addAll(scene1Label,scene1Button);
        scene1Layout.setAlignment(Pos.CENTER);

        scene1 = new Scene(scene1Layout);

        Label scene2Label = new Label("This is Scene 2");
        Button scene2Button = new Button("Go to Scene 1");
        scene2Button.setOnAction(e -> PopUpBox.display("You Got Tricked! Boo!","You thought you were going to Scene 1, but you got tricked!"));

        VBox scene2Layout = new VBox(20);
        scene2Layout.getChildren().addAll(scene2Label,scene2Button);
        scene2Layout.setAlignment(Pos.CENTER);

        scene2 = new Scene(scene2Layout);

        window.setScene(scene1);
        window.show();
    }

    public static void main(String[] args){
        launch(args);
    }
}