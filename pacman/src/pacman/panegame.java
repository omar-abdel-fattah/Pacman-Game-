package pacman;


import pacman.startgame;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Background;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Work pc
 */
public class panegame extends Pane{
    int winer=0;
    int timer =180;
    int lives=100;
    int eats=0;
    int Score = 2;
    int key=0;
    int keyyy=0;
    food Foodarr [][] = new food[60][26];
    
    Text tf = new Text("your score is   "+Score);
     Text tflives = new Text("lives remaining   "+lives);
    Rectangle Rec[] = new Rectangle[5];
    Stage Primarystage;
    enemyver enemyv[]=new enemyver[11];
 enemyhor enemyh[]=new enemyhor[5];
   // Textfield text = new Textfield()
    
    public panegame(Stage primaryStage) {
        
              tf.setLayoutX(800);
       tf.setLayoutY(1000);
       tf.setFill(Color.WHITE);
       tf.setFont(Font.font(50));
       
       
         tflives.setLayoutX(1300);
       tflives.setLayoutY(1000);
       tflives.setFill(Color.WHITE);
       tflives.setFont(Font.font(50));
       this.getChildren().add(tflives);
        this.Primarystage = primaryStage;
       eater Eater =new eater(0,0,0);
        
        Rec[0] = new Rectangle(300,20);
        Rec[0].setFill(Color.GREY);
        Rec[0].setX(0);
        Rec[0].setY(860);
        Rec[0].setWidth(10000);
        Rec[0].setHeight(30);
        
         enemyv[0]=new enemyver(490,20);
         enemyv[1]=new enemyver(585,200);
         enemyv[2]=new enemyver(1560,200);
        enemyv[3]=new enemyver(180,20);
        enemyv[4]=new enemyver(300,20);
        enemyv[5]=new enemyver(780,20);
        enemyv[6]=new enemyver(930,20);
        enemyv[7]=new enemyver(1080,20);
        enemyv[8]=new enemyver(1230,20);
        enemyv[9]=new enemyver(1840,20);
        enemyv[10]=new enemyver(1380,200);
        
         enemyh[0]=new enemyhor(25,160);//3
         enemyh[1]=new enemyhor(25,320);//7
         enemyh[2]=new enemyhor(25,480);//11
         enemyh[3]=new enemyhor(25,720);//17
         enemyh[4]=new enemyhor(25,840);//20
        
    
     
     
     this.getChildren().addAll(tf,Rec[0],Eater,enemyv[0],enemyv[1],enemyh[0],enemyh[1],enemyh[2],enemyh[3],enemyh[4]);
        
    Timeline timeline = new Timeline(
   
    
    
    new KeyFrame(Duration.millis(50), e -> {
       
        
       
          
        for (int k = 0 ; k < 60 ; k++)
        {
            if(k==15 ||k==16||k==18||k==19||k==51|| k==9 || k==5 ||k==25 ||k==30||k==35||k==40||k==45)
                continue;
            for(int j = 0 ; j < 21 ; j++)
            {  
                 if(j==3 ||j==7||j==11||j==20||j==17)
                continue;
      if(Foodarr[k][j].IsEaten(Eater))
      {
          Score+=2;
          eats++;
          Foodarr[k][j].SetRadius();
          tf.setText("your score is   "+Score);
    
      }
            }
        
    }  
    }
    ));
    timeline.setCycleCount(Animation.INDEFINITE);
    timeline.play();
    
     Text timertext=new Text("Time remaining is  "+timer);
        timertext.setLayoutX(200);
       timertext.setLayoutY(1000);
       timertext.setFill(Color.WHITE);
      
       timertext.setFont(Font.font(50));
       this.getChildren().add(timertext);
    
     Timeline timerr = new Timeline(
   
    
    
    new KeyFrame(Duration.millis(1000), e -> {
      keyyy=0;
        timer --;
       timertext.setText("Time remaining is   "+timer);
       
       //winn condition768
        
           
    }
    ));
    timerr.setCycleCount(Animation.INDEFINITE);
    timerr.play();
    
    
     Timeline winn = new Timeline(
   
    
    
    new KeyFrame(Duration.millis(10), e -> {
     
  
       
       //winn condition768
        
            if (timer>0 && eats==768&&winer==0)
            {
                winer=1;
              win start = new win(primaryStage);
        
        Scene scene = new Scene(start,728,546);
        
       
        
        primaryStage.setTitle("you won ");
        primaryStage.setScene(scene);
        primaryStage.show();
            }
       
       //lose condition
       if ((timer<=0 || lives<=0) && winer==0)
       {
           winer=1;
             lose start = new lose(primaryStage);
        
        Scene scene = new Scene(start,300,300);
        
       
        
        primaryStage.setTitle("you lost ");
        primaryStage.setScene(scene);
        primaryStage.show();
       }
    }
    ));
    winn.setCycleCount(Animation.INDEFINITE);
    winn.play();
    
    
    
    
    
    
    
     Timeline time  = new Timeline(
   
    
    
    new KeyFrame(Duration.millis(50), e -> {
       for(int i=0;i<11;i++)
       {
         if(enemyv[i].collided(Eater))
        {
             Score-=4;
          
          tf.setText("your score is   "+Score);
          lives--;
          tflives.setText("lives remaining   "+lives); 
        }
       }
          
       
     
            }
    ));
    time.setCycleCount(Animation.INDEFINITE);
    time.play(); 
    
    
    
      Timeline timeh = new Timeline(
   
    
    
    new KeyFrame(Duration.millis(50), e -> {
       for(int i=0;i<5;i++)
       {
         if(enemyh[i].collided(Eater))
        {
             Score-=2;
          
          tf.setText("your score is   "+Score);
           lives--;
          tflives.setText("lives remaining   "+lives); 
        }
       }
          
       
     
            }
    ));
    timeh.setCycleCount(Animation.INDEFINITE);
    timeh.play(); 
    
    
    Timeline tim = new Timeline(
   
    
    
    new KeyFrame(Duration.millis(5), e -> {
        
//           enemyv[0].movedown(20);
//      
//            enemyv[0].moveup(20);
        
        
            
        enemyv[0].movedown(20);
        if(enemyv[0].getCenterY()==840)
            enemyv[0].setCenterY(20);
        enemyv[8].movedown(20);
        if(enemyv[8].getCenterY()==840)
            enemyv[8].setCenterY(20);
         enemyv[9].movedown(20);
        if(enemyv[9].getCenterY()==840)
            enemyv[9].setCenterY(20);
        enemyv[10].movedown(20);
          if(enemyv[10].getCenterY()==840)
            enemyv[10].setCenterY(20);
       
     
            }
    ));
    tim.setCycleCount(Animation.INDEFINITE);
    tim.play(); 

    
    
    
     Timeline timh = new Timeline(
   
    
    
    new KeyFrame(Duration.millis(5), e -> {
        
//           enemyv[0].movedown(20);
//      
//            enemyv[0].moveup(20);
        
        
            
        enemyh[0].moveleft(10);
        if(enemyh[0].getCenterX()==1825)
            enemyh[0].setCenterX(25);
          enemyh[2].moveleft(10);
        if(enemyh[2].getCenterX()==1825)
            enemyh[2].setCenterX(25);
          enemyh[4].moveleft(10);
        if(enemyh[4].getCenterX()==1825)
            enemyh[4].setCenterX(25);
       
       
     
            }
    ));
    timh.setCycleCount(Animation.INDEFINITE);
    timh.play(); 
    
    
    
    
    
      Timeline timh2 = new Timeline(
   
    
    
    new KeyFrame(Duration.millis(25), e -> {
        
//           enemyv[0].movedown(20);
//      
//            enemyv[0].moveup(20);
        
        
            
        enemyh[3].moveleft(10);
        if(enemyh[3].getCenterX()==1825)
            enemyh[3].setCenterX(25);
          enemyh[1].moveleft(10);
        if(enemyh[1].getCenterX()==1825)
            enemyh[1].setCenterX(25);
       
       
       
     
            }
    ));
    timh2.setCycleCount(Animation.INDEFINITE);
    timh2.play(); 
    
    
    
    
    
    
    
    
    
    
    
   
     Timeline tim2 = new Timeline(
   
    
    
    new KeyFrame(Duration.millis(150), e -> {
        
//           enemyv[0].movedown(20);
//      
//            enemyv[0].moveup(20);
        
        
            
        enemyv[1].movedown(20);
        if(enemyv[1].getCenterY()==840)
            enemyv[1].setCenterY(20);
        
           enemyv[4].movedown(20);
        if(enemyv[4].getCenterY()==840)
            enemyv[4].setCenterY(20);
         enemyv[6].movedown(20);
        if(enemyv[6].getCenterY()==840)
            enemyv[6].setCenterY(20);
       
     
            }
    ));
    tim2.setCycleCount(Animation.INDEFINITE);
    tim2.play(); 

    
    
     Timeline tim3 = new Timeline(
   
    
    
    new KeyFrame(Duration.millis(10), e -> {
        
//           enemyv[0].movedown(20);
//      
//            enemyv[0].moveup(20);
        
        
            
        enemyv[2].movedown(20);
        if(enemyv[2].getCenterY()==840)
            enemyv[2].setCenterY(20);
        
           enemyv[3].movedown(20);
        if(enemyv[3].getCenterY()==840)
            enemyv[3].setCenterY(20);
         enemyv[5].movedown(20);
        if(enemyv[5].getCenterY()==840)
            enemyv[5].setCenterY(20);
         enemyv[7].movedown(20);
        if(enemyv[7].getCenterY()==840)
            enemyv[7].setCenterY(20);
       
     
            }
    ));
    tim3.setCycleCount(Animation.INDEFINITE);
    tim3.play(); 

   Timeline timshow = new Timeline(
   
    
    
    new KeyFrame(Duration.millis(0.5), e -> {
        
//           enemyv[0].movedown(20);
//      
//            enemyv[0].moveup(20);
        
        
            
       
        if(Score==8 && key==0)
        { this.getChildren().add(enemyv[2]);
        key++;
        }
           if(Score==16 && key==1)
        { this.getChildren().add(enemyv[3]);
        key++;
        }
            if(Score==22 && key==2)
        { this.getChildren().add(enemyv[4]);
        key++;
        }
             if(Score==26 && key==3)
        { this.getChildren().add(enemyv[5]);
        key++;
        }
              if(Score==30 && key==4)
        { this.getChildren().add(enemyv[6]);
        this.getChildren().add(enemyv[7]);
        key++;
        }
        if(Score==36 && key==5)
        { this.getChildren().add(enemyv[8]);
        this.getChildren().add(enemyv[9]);
        key++;
        }
         if(Score==38 && key==6)
        { this.getChildren().add(enemyv[10]);
       
        key++;
        }
        
     
            }
    ));
    timshow.setCycleCount(Animation.INDEFINITE);
    timshow.play(); 

    
        
        
        
       //setHeight(1000);
       //setWidth(1000);
        
       
       int z=10;
       for(int i = 0 ; i < 60 ; i++ )
       {
           if(i==15 || i==16||i==18||i==19||i==51 || i==9 || i==5 ||i==25 ||i==30||i==35||i==40||i==45)
               continue;
       for(int j=0; j<21 ; j++)
           
       {
           if(j==3 ||j==7||j==11||j==20||j==17)
               continue;
           Foodarr[i][j] =new food((i+1)*30,(j+1)*40,Eater);
            if(Shape.intersect(Rec[0], Foodarr[i][j]).getLayoutBounds().isEmpty()==true)
            {
          
         z+=50;
         getChildren().add(Foodarr[i][j]);
            }
       }
       }
       
        
       this.setOnKeyPressed(
               
       
       e->{
           
           if(e.getCode() == KeyCode.ESCAPE )
             {
                  primaryStage.close();
             }
           if(e.getCode() == KeyCode.BACK_SPACE )
             {
                   startgame start = new startgame(primaryStage);
        
        Scene scene = new Scene(start,400,600);
        
       
        
        primaryStage.setTitle("Pacman");
        primaryStage.setScene(scene);
        primaryStage.show();
             }
           
              
             if(Shape.intersect(Rec[0], Eater).getLayoutBounds().isEmpty()==false)
             {  
               if(Eater.getCenterX() - Rec[0].getX() <= 5 )
                     Eater.setCenterX(Eater.getCenterX()-15);
               
               else if(Eater.getCenterX() >= Rec[0].getWidth()-20 && Eater.getCenterX() <= Rec[0].getWidth())
                     Eater.setCenterX(Eater.getCenterX()+15);
               
                 
               else if(Eater.getCenterY() - Rec[0].getY() <= 20 && Eater.getCenterX() - Rec[0].getX() <= Rec[0].getWidth() )
                     Eater.setCenterY(Eater.getCenterY()-15);
                 
                else if(Eater.getCenterY() - Rec[0].getY() <= Rec[0].getHeight()+20 )
                     Eater.setCenterY(Eater.getCenterY()+15);
                 
             }   
                 
             
       
              if(e.getCode() == KeyCode.DOWN && Eater.getCenterY() < 1000 )
             {
                  Eater.setCenterY(Eater.getCenterY()+10 );
             }
              if (e.getCode() == KeyCode.UP && Eater.getCenterY() > 22 )
             {
                  Eater.setCenterY(Eater.getCenterY()-10);
             }
             if(e.getCode() == KeyCode.LEFT)
             {
                  Eater.setCenterX(Eater.getCenterX()-10);
             }
             if(e.getCode() == KeyCode.RIGHT)
             {
                  Eater.setCenterX(Eater.getCenterX()+10);
             }
//           }
       }
       
       );
    
    }
    
}
