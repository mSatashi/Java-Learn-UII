/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alhamdulillah;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.Interpolator;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.util.Duration;

/**
 *
 * @author hp
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private TextField tfNamaPem;

    @FXML
    private TextField tfNamaTan;

    @FXML
    private ChoiceBox chPil;

    @FXML
    private TextField tfJum;
    
    @FXML
    private TextArea taShow;
    
    @FXML
    private Button button;
    
    @FXML
    private StackPane Parentcontainer;
    
    @FXML
    private AnchorPane anchorPane;
    
    Petani petani = new Petani();
    @FXML
    private void handleButtonAction(ActionEvent event) {
         
        if("".equals(tfNamaPem.getText()) || "".equals(tfNamaTan.getText()) || chPil.getValue() == null){
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setContentText("Wajib diisi!!");
            alert.showAndWait();
        }else{
            petani.setNama(tfNamaPem.getText());
            petani.setNamaTanaman(tfNamaTan.getText());
            petani.setHasil(Integer.parseInt(tfJum.getText()));
            petani.setJenis(chPil.getValue().toString());
            taShow.setText(petani.toString());
        }
    }
    @FXML
    private void handleButtonChange(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("Secondscen.fxml"));
        Scene sc = button.getScene();
        root.translateYProperty().set(sc.getHeight());
        
        Parentcontainer.getChildren().add(root);
        Timeline tl = new Timeline();
        KeyValue kv = new KeyValue(root.translateYProperty(),0,Interpolator.EASE_IN);
        KeyFrame kf = new KeyFrame(Duration.seconds(1), kv);
        tl.getKeyFrames().add(kf);
        tl.setOnFinished((ActionEvent event1) -> {
            Parentcontainer.getChildren().remove(anchorPane);
        });
        tl.play();
    } 
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        chPil.getItems().addAll("Umbi-Umbian","Sayuran","Buah","Herb");
       
    }    
    
}
