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
            getWorld().removeObjects(getWorld().getObjects(TextFieldForMainScreen.class));
            getWorld().addObject(new TextFieldForMainScreen("Please select category to proceed",Color.BLUE),300,70);
            MainTopicComposite Category202 = new MainTopicComposite();
            MainTopicComposite Category272 = new MainTopicComposite();
            MainTopicComposite Category273 = new MainTopicComposite();
            MainTopicComposite Category207 = new MainTopicComposite();
            Category272.setName("272");
            Category202.setName("202");
            Category273.setName("273");
            Category207.setName("207");
            getWorld().addObject(Category202,100,130);
            getWorld().addObject(Category272,500,130);
            getWorld().addObject(Category273,100,400);
            getWorld().addObject(Category207,500,400);
        }
    }   
    

}
