/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacman;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
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
public class win extends Pane{

    public win(Stage primarystage) {
          Image image = new Image("pacman/111.jpg");

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
ret.setLayoutX(200);
ret.setLayoutY(400);
ret.setMinSize(100,50);

esc.setLayoutX(350);
esc.setLayoutY(400);
esc.setMinSize(100,50);
ret.setOnAction(
               
       
       e->{
           
           
                   startgame start = new startgame(primarystage);
        
        Scene scene1 = new Scene(start,400,600);
        
       
        
        primarystage.setTitle("Pacman");
        primarystage.setScene(scene1);
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
