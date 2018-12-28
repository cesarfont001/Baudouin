/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author Fontaine César
 */
public class LoginController {

    @FXML
    private Label lab;
    
    @FXML
    private Label lab1;

    @FXML
    private TextField tfPseudo;

    @FXML
    private TextField tfPassword;

    public void Login(ActionEvent e) throws IOException {
        if (tfPseudo.getText().equals("Cafett") && tfPassword.getText().equals("Bo1951")) {
            lab1.setText("Authentification réussie");
            Stage ps = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("/view/Application.fxml"));
            Scene scene = new Scene(root, 800, 600);
            ps.setScene(scene);
            ps.setResizable(false);
            ps.show();
        } else {

            lab.setText("Putain Bo' ! Réfléchis ...");
        }
    }
}
