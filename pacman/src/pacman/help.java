package pacman;


import pacman.startgame;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Work pc
 */
public class help extends Pane{

    public help(Stage p) {
        
        Text txt=new Text("move the yellow eater to eat the pink "+" food without hitting the black enemy "+ "take care of the time"); 
                
        txt.setLayoutX(0);
        txt.setLayoutY(30);
      
        
        this.getChildren().add(txt);
         this.setOnKeyPressed(
               
       
       e->{
           
           if(e.getCode() == KeyCode.ESCAPE )
             {
                  p.close();
             }
           if(e.getCode() == KeyCode.BACK_SPACE )
             {
                   startgame start = new startgame(p);
        
        Scene scene = new Scene(start,400,600);
        
       
        
        p.setTitle("Pacman");
        p.setScene(scene);
        p.show();
             }
    });
    
    
}
}
