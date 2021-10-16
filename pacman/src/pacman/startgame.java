package pacman;




import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
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
public class startgame extends Pane{
Stage primaryStage;
int score;
panegame x;

    public startgame(Stage primaryStage) {
                    Image xr = new Image("pacman/69434552_2310188225976638_8349611805781262336_n.jpg");

BackgroundSize size = new BackgroundSize(BackgroundSize.AUTO, 
        BackgroundSize.AUTO, 
        false, 
        false, 
        true, 
        false);

Background background = new Background(new BackgroundImage(xr,
        BackgroundRepeat.NO_REPEAT,
        BackgroundRepeat.NO_REPEAT,
        BackgroundPosition.CENTER, size));

this.setBackground(background);
    
        this.primaryStage=primaryStage;
        Button b = new Button("Start");
        b.setLayoutX(100);
        b.setLayoutY(300);
        b.setMinSize(200, 50);
        
          
           b.setOnAction(
        
        e->{
            
             panegame r = new panegame(primaryStage);
             x=r;
            Scene scene2 = new Scene(r);
            Image image = new Image("pacman/69421552_418417612353753_2788867826029428736_n.jpg");

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

r.setBackground(background1);
            primaryStage.setScene(scene2);
            primaryStage.setTitle("Pacman");
        
        primaryStage.setFullScreen(true);
        r.requestFocus();
        }
        
        
        );
           
//            Button hscore = new Button("high score");
//        hscore.setLayoutX(100);
//        hscore.setLayoutY(200);
//        hscore.setMinSize(400, 50);
//          hscore.setOnAction(
//        
//        e->{
//            highscore root = new highscore(x.Score,primaryStage);
//            Scene scene2 = new Scene(root);
//            
//            primaryStage.setScene(scene2);
//            primaryStage.setTitle("Highscores");
//        
//        
//        root.requestFocus();
//        }
//        
//        
//        );
          
           Button help = new Button("help");
        help.setLayoutX(100);
        help.setLayoutY(400);
        help.setMinSize(200, 50);
          help.setOnAction(
        
        e->{
            help root = new help(primaryStage);
            Scene scene2 = new Scene(root);
            
            primaryStage.setScene(scene2);
            primaryStage.setTitle("Help");
        
        

        root.requestFocus();
        }
        
        
        );
          
           Button quit= new Button("quit");
        quit.setLayoutX(100);
        quit.setLayoutY(500);
        quit.setMinSize(200, 50);
          quit.setOnAction(
        
        e->{
            primaryStage.close();
        }
        
        
        );
          
        this.getChildren().addAll(quit,help,b);
          
    }

    

    
    
    
}
