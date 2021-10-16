package pacman;


import pacman.startgame;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
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
public class highscore extends Pane {
static int score;

    public highscore(int score,Stage p) {
        this.score=score;
        TextField txt=new TextField("your highest score in this session is "+this.score);
        txt.setLayoutX(0);
        txt.setLayoutY(0);
        txt.setMinSize(300, 300);
        txt.setEditable(false);
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
        
        Scene scene = new Scene(start,600,600);
        
       
        
        p.setTitle("Pacman");
        p.setScene(scene);
        p.show();
             }
    });
    }
    
    
}
