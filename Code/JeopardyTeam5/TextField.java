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
public class TextField extends Actor
{
    GreenfootImage g;
    String ans = "";
    
    public TextField(String text) {
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
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if(mouse == null){
            return;
        }
        if(mouse.getActor() == this)
        {
            System.out.println("Entered");
            
            g = new GreenfootImage(ans, 30, Color.RED , null);
            setImage(g);
        }
        else
        {
            g = new GreenfootImage(ans, 30, Color.YELLOW , null);
            setImage(g);
        }
        
        
        if(Greenfoot.mouseClicked(this)){
            
            getWorld().addObject(new ResultScreen(),100,100);
            getWorld().addObject(new ExplanationText("Correct Answer"),100,100);
            getWorld().addObject(new Score("Score: "),500,430);
            getWorld().removeObjects(getWorld().getObjects(QuestionScreen.class));
            getWorld().removeObject(this);
            
        }
    }
    
}


