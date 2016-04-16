import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
//import java.awt.*;
import java.awt.event.*;
/**
 * Write a description of class TextField here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Question extends Actor
{
    GreenfootImage g;
    String ans = "";
    
    public Question(String text) {
        ans = text;
        g = new GreenfootImage(text, 30, Color.YELLOW , null);
        setImage(g);
        
    }
    
    /**
     * Act - do whatever the TextField wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        
    }
    
}