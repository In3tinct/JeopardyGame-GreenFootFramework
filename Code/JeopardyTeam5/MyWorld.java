import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    //private Timer timer = 0;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x454 cells with a cell size of 1x1 pixels.
        super(600,454,1);
       addObject(new MainScreen(),300,225);
       addObject(new TextFieldForMainScreen("Please Click on the image below to play the game",Color.BLUE),300,70);
        
        
    }
}
