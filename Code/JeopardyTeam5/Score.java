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
public class Score extends Actor
{
    // instance variables - replace the example below with your own
    int x=0;
    /**
     * Constructor for objects of class Player
     */
    public Score(String text)
    {
         GreenfootImage g = new GreenfootImage(text, 18, Color.WHITE , null);
       setImage(g);
    }
    public void act()
    {
              //observer      
            if(Greenfoot.mouseClicked(this)){
        getWorld().removeObject(this);
        
    }
}}
