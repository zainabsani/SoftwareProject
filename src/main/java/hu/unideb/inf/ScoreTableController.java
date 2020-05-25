package hu.unideb.inf;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class ScoreTableController {

    @FXML
    public void restart() throws IOException {
        App.setRoot("primary");
    }

}
