import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.awt.*;
import java.awt.event.*;

public class PrintScore extends Actor 
{
   // String final_score;
   String value;
   //ScoreKeeper c;
      public PrintScore(String text)
    {
         
      /* if(text=="0")
       print(text);
       else{
           c=new ScoreKeeper(text);
           value=c.check1();
           print(value);
        }
    }
    public void print(String text){*/
         GreenfootImage g = new GreenfootImage(text, 18, Color.WHITE , null);
       setImage(g);
        
    }
    public void act()
    {
              //observer pattern to be added      
            if(Greenfoot.mouseClicked(this)){
        getWorld().removeObject(this);
        
    }}
}
