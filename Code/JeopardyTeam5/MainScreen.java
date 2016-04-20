import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;

/**
 * Write a description of class MainScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainScreen extends Actor
{
    /**
     * Act - do whatever the MainScreen wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
            MainTopicComposite topic202 = new MainTopicComposite();
            
            getWorld().removeObjects(getWorld().getObjects(TextFieldForMainScreen.class));
            getWorld().addObject(new TextFieldForMainScreen("Please select category to proceed",Color.BLACK),300,70);
            getWorld().addObject(new MainTopicComposite(),100,130);
            getWorld().addObject(new MainTopicComposite(),500,130);
            getWorld().addObject(new MainTopicComposite(),100,400);
            getWorld().addObject(new MainTopicComposite(),500,400);
        }
    }    
}
