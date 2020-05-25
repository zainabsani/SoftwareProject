package hu.unideb.inf;

import java.io.IOException;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;

public class SecondaryController {

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }

    @FXML
    private FlowPane fpLayout;
    @FXML
    private Label idTitle;
    @FXML
    private Button btnReset;
    @FXML
    private Label lvlMessage;
    @FXML
    private Label author;
    @FXML
    private Label L1;
    @FXML
    private Label L2;
    @FXML
    private Label L3;
    @FXML
    private Label L4;
    @FXML
    private Label L5;
    @FXML
    private Label L6;
    @FXML
    private Label L7;
    @FXML
    private Label L8;
    @FXML
    private Label L9;
    private boolean isX = true;

    @FXML
    public void onReset(MouseEvent event) {
        ObservableList<Node> items = this.fpLayout.getChildren();
        items.forEach(e -> {
            Label label = (Label) e;
            label.setText(" ");
            label.setTextFill(Color.RED);
            lvlMessage.setText("");
        });
    }

    @FXML
    public void XOrOSelected(MouseEvent event) {
        Label label = (Label) event.getSource();
        lvlMessage.setText("");

        if (!label.getText().equals(" ")) {

            String message = " Illegal Move, Stop it!";
            lvlMessage.setText(message);
            return;
        }

        String whichMove = isX ? "X" : "O";
        label.setText(whichMove);

        // Checking from Row 1
        if (L1.getText().equals("X") && (L2.getText().equals("X") && (L3.getText().equals("X")))) {

            String message2 = "Winner IS X !";
            lvlMessage.setText(message2);

            // SET the winner color to Red
            L1.setTextFill(Color.BLACK);
            L2.setTextFill(Color.BLACK);
            L3.setTextFill(Color.BLACK);

            return;
        }

        // Checking from Row 2
        else if (L4.getText().equals("X") && (L5.getText().equals("X") && (L6.getText().equals("X")))) {

            String message2 = "Winner IS X !";
            lvlMessage.setText(message2);

            // SET the winner color to Red
            L4.setTextFill(Color.BLACK);
            L5.setTextFill(Color.BLACK);
            L6.setTextFill(Color.BLACK);

            return;
        }

        // Checking from Row 3
        else if (L7.getText().equals("X") && (L8.getText().equals("X") && (L9.getText().equals("X")))) {

            String message2 = "Winner IS X !";
            lvlMessage.setText(message2);

            // SET the winner color to Red
            L7.setTextFill(Color.BLACK);
            L8.setTextFill(Color.BLACK);
            L9.setTextFill(Color.BLACK);
            return;
        }

        // Checking from Column 1
        else if (L1.getText().equals("X") && (L4.getText().equals("X") && (L7.getText().equals("X")))) {

            String message2 = "Winner IS X !";
            lvlMessage.setText(message2);

            // SET the winner color to Red
            L1.setTextFill(Color.BLACK);
            L4.setTextFill(Color.BLACK);
            L7.setTextFill(Color.BLACK);

            return;
        }

        // Checking from Column 2
        if (L2.getText().equals("X") && (L5.getText().equals("X") && (L8.getText().equals("X")))) {

            String message2 = "Winner IS X !";
            lvlMessage.setText(message2);

            // SET the winner color to Red
            L2.setTextFill(Color.BLACK);
            L5.setTextFill(Color.BLACK);
            L8.setTextFill(Color.BLACK);
            return;
        }

        // Checking from Column 3
        if (L3.getText().equals("X") && (L6.getText().equals("X") && (L9.getText().equals("X")))) {

            String message2 = "Winner IS X !";
            lvlMessage.setText(message2);

            // SET the winner color to Red
            L3.setTextFill(Color.BLACK);
            L6.setTextFill(Color.BLACK);
            L9.setTextFill(Color.BLACK);
            return;
        }

        // Checking from Across 1
        if (L1.getText().equals("X") && (L5.getText().equals("X") && (L9.getText().equals("X")))) {

            String message2 = "Winner IS X !";
            lvlMessage.setText(message2);

            // SET the winner color to Red
            L1.setTextFill(Color.BLACK);
            L5.setTextFill(Color.BLACK);
            L9.setTextFill(Color.BLACK);
            return;
        }

        // Checking from Across 2
        if (L3.getText().equals("X") && (L5.getText().equals("X") && (L7.getText().equals("X")))) {

            String message2 = "Winner IS X !";
            lvlMessage.setText(message2);

            // SET the winner color to Red
            L3.setTextFill(Color.BLACK);
            L5.setTextFill(Color.BLACK);
            L7.setTextFill(Color.BLACK);
            return;
        }

        // Now Checking For O

        // Checking from Row 1
        if (L1.getText().equals("O") && (L2.getText().equals("O") && (L3.getText().equals("O")))) {

            String message2 = "Winner IS O !";
            lvlMessage.setText(message2);

            // SET the winner color to Red
            L1.setTextFill(Color.BLACK);
            L2.setTextFill(Color.BLACK);
            L3.setTextFill(Color.BLACK);

            return;
        }

        // Checking from Row 2
        if (L4.getText().equals("O") && (L5.getText().equals("O") && (L6.getText().equals("O")))) {

            String message2 = "Winner IS O !";
            lvlMessage.setText(message2);

            // SET the winner color to Red
            L4.setTextFill(Color.BLACK);
            L5.setTextFill(Color.BLACK);
            L6.setTextFill(Color.BLACK);

            return;
        }

        // Checking from Row 3
        if (L7.getText().equals("O") && (L8.getText().equals("O") && (L9.getText().equals("O")))) {

            String message2 = "Winner IS O !";
            lvlMessage.setText(message2);

            // SET the winner color to Red
            L7.setTextFill(Color.BLACK);
            L8.setTextFill(Color.BLACK);
            L9.setTextFill(Color.BLACK);
            return;
        }

        // Checking from Column 1
        if (L1.getText().equals("O") && (L4.getText().equals("O") && (L7.getText().equals("O")))) {

            String message2 = "Winner IS O !";
            lvlMessage.setText(message2);

            // SET the winner color to Red
            L1.setTextFill(Color.BLACK);
            L4.setTextFill(Color.BLACK);
            L7.setTextFill(Color.BLACK);

            return;
        }

        // Checking from Column 2
        if (L2.getText().equals("O") && (L5.getText().equals("O") && (L8.getText().equals("O")))) {

            String message2 = "Winner IS O !";
            lvlMessage.setText(message2);

            // SET the winner color to Red
            L2.setTextFill(Color.BLACK);
            L5.setTextFill(Color.BLACK);
            L8.setTextFill(Color.BLACK);
            return;
        }

        // Checking from Column 3
        if (L3.getText().equals("O") && (L6.getText().equals("O") && (L9.getText().equals("O")))) {

            String message2 = "Winner IS O !";
            lvlMessage.setText(message2);

            // SET the winner color to Red
            L3.setTextFill(Color.BLACK);
            L6.setTextFill(Color.BLACK);
            L9.setTextFill(Color.BLACK);

            return;
        }

        // Checking from Across 1
        if (L1.getText().equals("O") && (L5.getText().equals("O") && (L9.getText().equals("O")))) {

            String message2 = "Winner IS O !";
            lvlMessage.setText(message2);

            // SET the winner color to Red
            L1.setTextFill(Color.BLACK);
            L5.setTextFill(Color.BLACK);
            L9.setTextFill(Color.BLACK);
            return;
        }

        // Checking from Across 2
        if (L3.getText().equals("O") && (L5.getText().equals("O") && (L7.getText().equals("O")))) {

            String message2 = "Winner IS O !";
            lvlMessage.setText(message2);

            // SET the winner color to Red
            L3.setTextFill(Color.BLACK);
            L5.setTextFill(Color.BLACK);
            L7.setTextFill(Color.RED);
            return;
        }
        isX = !isX;
    }

    @FXML
    private void scoreTable() throws IOException {
        App.setRoot("ScoreTable");
    }

}