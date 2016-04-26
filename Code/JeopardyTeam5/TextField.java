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
    ICardComponent card;
    
    public TextField(String text,ICardComponent card) {
        ans = text;
        g = new GreenfootImage(text, 30, Color.YELLOW , null);
        g.scale(100,100);
        setImage(g);
        this.card =card;
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
            g = new GreenfootImage(ans, 30, Color.RED , null);
            setImage(g);
        }
        else
        {
            g = new GreenfootImage(ans, 30, Color.YELLOW , null);
            setImage(g);
        }
        
        
        if(Greenfoot.mouseClicked(this)){
            ((MyWorld)getWorld()).answerClicked=true;
            ((MyWorld)getWorld()).stopTimer();
            if(this.card instanceof QuestionCardLeaf273){
                getWorld().addObject(new ResultScreen273(this.card),100,100);
            }else if(this.card instanceof QuestionCardLeaf272){
                getWorld().addObject(new ResultScreen272(this.card),100,100);
            }else if(this.card instanceof QuestionCardLeaf207){
                getWorld().addObject(new ResultScreen207(this.card),100,100);
            }else if(this.card instanceof QuestionCardLeaf202){
                getWorld().addObject(new ResultScreen202(this.card),100,100);
            }
            getWorld().addObject(new ExplanationText("Correct Answer",this.card),100,100);
            getWorld().removeObjects(getWorld().getObjects(QuestionScreen.class));
            getWorld().removeObjects(getWorld().getObjects(Question.class));
            getWorld().removeObjects(getWorld().getObjects(TextField.class));

            
        }
    }
    
}
