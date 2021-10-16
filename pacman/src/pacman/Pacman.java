package pacman;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import pacman.startgame;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Work pc
 */
public class Pacman extends Application {
    
    @Override
    public void start(Stage primaryStage) {
       
           primaryStage.requestFocus();
    
           
           startgame start = new startgame(primaryStage);
        
        Scene scene = new Scene(start,400,600);
        
       
        
        primaryStage.setTitle("Pacman");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        
         
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
        
    }
    
}
