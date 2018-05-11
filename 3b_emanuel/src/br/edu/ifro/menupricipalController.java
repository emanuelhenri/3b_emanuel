/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;

/**
 *
 * @author 04163917292
 */
public class menupricipalController implements Initializable {
    
    @FXML
    private TextField txtNumero1,txtNumero2, txtResultado;
    
     @FXML
    
     private Button bntSoma;
    @FXML
    private void soma (ActionEvent event) {
        double num1 = Double.parseDouble(txtNumero1.getText());
        double num2 = Double.parseDouble(txtNumero2.getText());
        double resultado = num1 +num2 ;
        
        txtResultado.setText(resultado.toString());
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
