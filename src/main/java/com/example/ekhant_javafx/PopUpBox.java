package com.example.ekhant_javafx;

import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.geometry.*;

public class PopUpBox {
    public static void display(String title, String message){
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);                    //set the pop-up window's modality so that it must be taken care of before re-entering the main window
        window.setTitle(title);                                             //set the title of the pop-up window
        window.setMinWidth(500);                                            //set the dimensions of the pop-up window
        window.setMinHeight(200);

        Label popUpMessage = new Label("Pop-up window");     //add and configure a label
        Button closeButton = new Button("Close this window");           //add and configure a button and its action
        closeButton.setOnAction(e -> window.close());

        VBox layout = new VBox(20);                                     //add and configure a layout with the label and button above
        layout.getChildren().addAll(popUpMessage,closeButton);
        layout.setAlignment(Pos.CENTER);

        Scene scene = new Scene(layout);                                    //add and configure a scene with the layout above
        window.setScene(scene);                                             //configure the window with the scene above
        window.showAndWait();                                               //configure the window to wait for the user to end this window before returnign to the main window
    }
}
