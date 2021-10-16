/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacman;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 *
 * @author Work pc
 */
public class lose extends Pane{

    public lose(Stage primarystage) {
          Image image = new Image("pacman/222.jpg");

BackgroundSize size1 = new BackgroundSize(BackgroundSize.AUTO, 
        BackgroundSize.AUTO, 
        false, 
        false, 
        true, 
        false);

Background background1 = new Background(new BackgroundImage(image,
        BackgroundRepeat.NO_REPEAT,
        BackgroundRepeat.NO_REPEAT,
        BackgroundPosition.CENTER, size1));

this.setBackground(background1);

Button ret=new Button("Again");
Button esc =new Button("quit");
ret.setLayoutX(100);
ret.setLayoutY(200);
ret.setMinSize(60,50);

esc.setLayoutX(180);
esc.setLayoutY(200);
esc.setMinSize(60,50);
ret.setOnAction(
               
       
       e->{
           
           
                   startgame start = new startgame(primarystage);
        
        Scene scene = new Scene(start,400,600);
        
       
        
        primarystage.setTitle("Pacman");
        primarystage.setScene(scene);
        primarystage.show();
             }
    );
 esc.setOnAction(
        
        e->{
            primarystage.close();
        }
        
        
        );
          
        this.getChildren().addAll(ret,esc);

    }
    
    
}
