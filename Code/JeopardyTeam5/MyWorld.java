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
        addObject(new Button("100"), 66, 127);
        addObject(new Button("100"), 158, 127);
        addObject(new Button("100"), 256, 127);
        addObject(new Button("100"), 349, 129);
        addObject(new Button("100"), 443, 127);
        addObject(new Button("100"), 537, 127);
        addObject(new Button("200"), 66, 198);
        addObject(new Button("200"), 158, 198);
        addObject(new Button("200"), 256, 198);
        addObject(new Button("200"), 349, 198);
        addObject(new Button("200"), 443, 198);
        addObject(new Button("200"), 537, 198);
       addObject(new Score("Score: "),230,446); //Score counter
        
    }
}
