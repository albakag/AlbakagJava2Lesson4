package sample;

import java.awt.event.KeyEvent;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextArea showMessageArea;

    @FXML
    private Button btnEnter;

    @FXML
    private Button AddContactBtn;

    @FXML
    private Button clearBtn;


    @FXML
    private TextArea showContactsArea;

    @FXML
    private TextField typeMessageField;



    @FXML
    void initialize() {

        clearBtn.setOnAction(event -> {
//            showMessageArea.clear();
            typeMessageField.clear();
        });

        btnEnter.setOnAction(event -> {
            if(typeMessageField.getText().trim().length() > 0) {
                showMessageArea.appendText("Me: " + typeMessageField.getText() + "\n");
                typeMessageField.clear();
            }
        });
    }
}
