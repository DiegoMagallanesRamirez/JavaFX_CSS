package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

public class MainController {

    @FXML
    private AnchorPane panel;

    @FXML
    private Button style1;

    @FXML
    private Button style2;

    @FXML
    private Button style3;

    @FXML
    private Button reset;

    @FXML
    private Button exit;

    @FXML
    void exit(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    void reset(ActionEvent event) {
        panel.getStylesheets().clear();
    }

    @FXML
    void setStyle1(ActionEvent event) {
        panel.getStylesheets().clear();
        panel.getStylesheets().add("/styles/style1.css");
    }

    @FXML
    void setStyle2(ActionEvent event) {
        panel.getStylesheets().clear();
        panel.getStylesheets().add("/styles/style2.css");
    }

    @FXML
    void setStyle3(ActionEvent event) {
        panel.getStylesheets().clear();
        panel.getStylesheets().add("/styles/style3.css");
    }

}