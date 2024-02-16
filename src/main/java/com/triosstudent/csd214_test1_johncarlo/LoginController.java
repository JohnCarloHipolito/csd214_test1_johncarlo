package com.triosstudent.csd214_test1_johncarlo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

import java.util.HashMap;
import java.util.Map;

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
    private static final String ACCOUNT_LOCKED_MESSAGE = "Sorry, Your Account is Locked!!!";
    private static final String NO_OF_ATTEMPTS_MESSAGE = " %d of 5 attempts.";

    private final Map<String, Integer> userLoginAttemptMap = new HashMap<>();

    @FXML
    protected void onLoginButtonClick() {
        String username = usernameField.getText();
        String password = passwordField.getText();

        if (userLoginAttemptMap.containsKey(username) && userLoginAttemptMap.get(username) == 5) {
            loginMessage.setTextFill(Color.RED);
            loginMessage.setText(ACCOUNT_LOCKED_MESSAGE);
        } else {
            if (username.isEmpty() || password.isEmpty()) {
                loginMessage.setTextFill(Color.RED);
                loginMessage.setText(EMPTY_FIELDS_MESSAGE);
            } else if (USERNAME.equals(username) && PASSWORD.equals(password)) {
                loginMessage.setTextFill(Color.GREEN);
                loginMessage.setText(SUCCESS_LOGIN_MESSAGE);
                userLoginAttemptMap.remove(username);
            } else {
                userLoginAttemptMap.put(username, userLoginAttemptMap.getOrDefault(username, 0) + 1);
                loginMessage.setTextFill(Color.RED);
                loginMessage.setText(INVALID_LOGIN_MESSAGE
                        + String.format(NO_OF_ATTEMPTS_MESSAGE, userLoginAttemptMap.get(username)));
            }
        }

    }
}