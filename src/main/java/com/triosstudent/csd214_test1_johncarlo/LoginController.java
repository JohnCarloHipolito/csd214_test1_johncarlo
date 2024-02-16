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

    private static final String USERNAME = "JOHN_CARLO";
    private static final String PASSWORD = "P@ssW0rd123!";

    private static final String EMPTY_FIELDS_MESSAGE = "Please Provide Username or Password.";
    private static final String SUCCESS_LOGIN_MESSAGE = "Success!!!";
    private static final String INVALID_LOGIN_MESSAGE = "Sorry, Invalid Username or Password.";

    @FXML
    protected void onLoginButtonClick() {
        String username = usernameField.getText();
        String password = passwordField.getText();

        if (username.isEmpty() || password.isEmpty()) {
            loginMessage.setTextFill(Color.RED);
            loginMessage.setText(EMPTY_FIELDS_MESSAGE);
        } else if (USERNAME.equals(username) && PASSWORD.equals(password)) {
            loginMessage.setTextFill(Color.GREEN);
            loginMessage.setText(SUCCESS_LOGIN_MESSAGE);
        } else {
            loginMessage.setTextFill(Color.RED);
            loginMessage.setText(INVALID_LOGIN_MESSAGE);
        }
    }
}