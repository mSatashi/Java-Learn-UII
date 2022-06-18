/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trychoicebox;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

/**
 *
 * @author hp
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private ChoiceBox chTry;
    @FXML
    private void handleButtonAction(ActionEvent event) {
        label.setText(chTry.getValue().toString());
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        label.setText("");
        chTry.getItems().addAll("Aku","Kamu","Dia");    
    }    
    
}
