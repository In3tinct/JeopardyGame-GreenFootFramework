import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ButtonForMainScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ButtonForMainScreen extends Actor
{
    /**
     * Act - do whatever the ButtonForMainScreen wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
            if(Greenfoot.mouseClicked(this)){
            //getWorld().addObject(new GameScreen(),300,225);
            //Removing the first screen object
            //getWorld().removeObjects(getWorld().getObjects(MainScreen.class));
        }
        // Add your action code here.
    }    
}
