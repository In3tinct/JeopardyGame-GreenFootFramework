import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

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
        addObject(new Button(), 66, 127);
        addObject(new Button(), 158, 127);
        addObject(new Button(), 256, 127);
        addObject(new Button(), 349, 129);
        addObject(new Button(), 443, 127);
        addObject(new Button(), 66, 198);
        addObject(new Button(), 158, 198);
        addObject(new Button(), 256, 198);
        addObject(new Button(), 349, 198);
        addObject(new Button(), 443, 198);
       addObject(new Score("Score: "),230,446); //Score counter
        
    }
}
