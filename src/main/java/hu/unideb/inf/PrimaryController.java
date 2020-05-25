package hu.unideb.inf;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import lombok.extern.slf4j.Slf4j;


import java.io.IOException;


public class PrimaryController {
    @FXML
    private Label title;

    @FXML
    private Label play1;
    @FXML
    private TextField player1;
    @FXML
    private Button save1;

    @FXML
    private Label play2;
    @FXML
    private TextField player2;
    @FXML
    private Button save2;


    @FXML
    private void switchToSecondary() throws IOException {

        if (player1.getText().trim().isEmpty() || player2.getText().trim().isEmpty()) {
            Alert a = new Alert(Alert.AlertType.ERROR,"Players Nmvn iame Can't be empty");
            a.show();

        }
        else if(player2.getText().trim().equals(player1.getText().trim())){
            Alert a = new Alert(Alert.AlertType.ERROR,"Players Name Can't be same");
            a.show();
        }
        else{
        App.setRoot("secondary");
        //log.info("Game started...")
        }
    }

    }
