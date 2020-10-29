package com.comp301.lec20;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;

public class LoginController {
  @FXML private Text actiontarget;
  @FXML private ResourceBundle resources;

  @FXML
  protected void handleSubmitButtonAction(ActionEvent event) {
    actiontarget.setText("Sign in button pressed");
  }
}
