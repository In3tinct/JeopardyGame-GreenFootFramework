import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.awt.*;
import java.awt.event.*;
/**
 * Write a description of class Player here.
 * 
 * @author Natasha 
 * @version (a version number or a date)
 */
public class Score extends Actor implements Observer
{
    // instance variables - replace the example below with your own
  //int points;
  //int finalSore;
  public CountScore subject; 
    
    public Score(String text)
    {
         GreenfootImage g = new GreenfootImage(text, 18, Color.WHITE , null);
       setImage(g);
       
    }
    public void act()
    {
              //observer pattern to be added      
            if(Greenfoot.mouseClicked(this)){
        getWorld().removeObject(this);
        
    }}
    public void update(){
    
      }
}

