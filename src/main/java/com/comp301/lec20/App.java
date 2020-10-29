package com.comp301.lec20;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage stage) throws Exception {
    Parent root = FXMLLoader.load(getClass().getResource("/login.fxml"));

    stage.setTitle("FXML Welcome");
    stage.setScene(new Scene(root, 300, 275));
    stage.show();
  }
}