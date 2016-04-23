import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

/**
 * Write a description of class TextFieldForMainScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RoundOverText extends Actor
{
    
    GreenfootImage g;
    String ans = "";
    
    public RoundOverText(String text,Color color) {
        if(color==null){
        ans = text;
        g = new GreenfootImage(text, 30, Color.YELLOW , null);
        setImage(g);
    }else{
        GreenfootImage g = new GreenfootImage(text, 30, color , null);
       setImage(g);
    }
        
    }
    
    
    /**
     * Act - do whatever the TextFieldForMainScreen wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
            getWorld().removeObjects(getWorld().getObjects(GameScreen.class));
             getWorld().removeObjects(getWorld().getObjects(RoundOverText.class));
        }
    }    
}
