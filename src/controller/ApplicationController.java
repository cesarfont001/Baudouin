/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.Set;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

/**
 *
 * @author cesar
 */
public class ApplicationController implements Initializable{
    @FXML
    private TableView tvCarton;
    
    @FXML
    private ListView lvCompte;
    private Set<String> stringSet;
    ObservableList olList = FXCollections.observableArrayList();
    
    
    
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        olList.add("Alain");
        olList.add("César");
        lvCompte.getItems().addAll(olList);
        
        
    }
    
}
