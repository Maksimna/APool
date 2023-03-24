package com.example.testfx2;//package com.example.testfx2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;


public class Swing {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing and JavaFX");
        JFXPanel jfxPanel = new JFXPanel();
        frame.add(jfxPanel);
        frame.setSize(300, 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Group group = new Group();
        Scene scene = new Scene(group, Color.ALICEBLUE);
        group.getChildren().addAll(new Button("press"));
        jfxPanel.setScene(scene);
    }
}
