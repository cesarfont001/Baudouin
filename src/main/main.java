/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Fontaine César
 */
public class main extends Application {

    @Override
    public void start(Stage ps) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/view/Login.fxml"));
        Scene scene = new Scene(root, 600, 400);
        ps.setScene(scene);
        ps.setResizable(false);
        ps.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

   

}
