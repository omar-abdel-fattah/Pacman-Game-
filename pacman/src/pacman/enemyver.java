package pacman;


import pacman.food;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Work pc
 */
public class enemyver extends  Circle{
eater Eater;
food Foodarr[][];

    public enemyver(double centerX, double centerY) {
        super(centerX, centerY,25);
        setFill(Color.RED);
    }
    
    public Boolean collided (eater Eater)
    {
         if(Shape.intersect(this, Eater).getLayoutBounds().isEmpty()==false)
       return true; 
       else
       return false;
    }
//    public void moveup(int x)
//    {
//        for(int i=0;i<21;i++)
//        {
//            this.setCenterY(this.getCenterY()-x);
//            System.out.println("ggggg");
//        if(this.getCenterY()==20)
//            break;
//        }
//        
//    }
     public void movedown(int x)
    {
        
            this.setCenterY(this.getCenterY()+x);
           
        
    }
}
