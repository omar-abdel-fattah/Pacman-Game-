package pacman;


import java.util.logging.Logger;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Shape;
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
public class food extends Circle{

    eater Eater;
    
    public food(double centerX, double centerY,eater eater) {
        super(centerX, centerY, 5, Color.GREENYELLOW);
        Eater=eater;
        
        
    }
    
   boolean IsEaten (eater Eater)
   {
       
       if(Shape.intersect(this, Eater).getLayoutBounds().isEmpty()==false)
       return true; 
       else
       return false;
       
   }
 

void SetRadius ()
{
this.setRadius(0);
}
}

//    boolean IncreaseScore()
//    {
//        
//    }
    

   
    
    

