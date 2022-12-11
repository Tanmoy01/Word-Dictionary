package com.example.dictionary;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class HelloApplication extends Application {

    public static Group root;
    @Override
    public void start(Stage PrimaryStage) throws Exception {
        root= new Group();
        PrimaryStage.setTitle("Word Dictionary");
        DictionaryPage page= new DictionaryPage();
        root.getChildren().add(page.root);
        PrimaryStage.setScene(new Scene(root,500, 500 ));
        PrimaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}