package com.triosstudent.csd214_test1_johncarlo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class LoginController {
    @FXML
    private TextField usernameField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private Label loginMessage;

    private static final String EMPTY_FIELDS_MESSAGE = "Please Provide Username or Password.";

    @FXML
    protected void onLoginButtonClick() {
        String username = usernameField.getText();
        String password = passwordField.getText();

        if (username.isEmpty() || password.isEmpty()) {
            loginMessage.setTextFill(Color.RED);
            loginMessage.setText(EMPTY_FIELDS_MESSAGE);
        }
    }
}