import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class QuestionCardLeaf207 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class QuestionCardLeaf207 extends Actor implements ICardComponent
{
    public QuestionCardLeaf207(String text){
        GreenfootImage g = new GreenfootImage(text, 30, Color.YELLOW , null);
        setImage(g);   
    }
    /**
     * Act - do whatever the Button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act(){   
        if(Greenfoot.mouseClicked(this)){
            displayQCard();
        }
    } 
       
    public void displayQCard(){
        getWorld().addObject(new QuestionScreen(),100,100);
        getWorld().addObject(new Question("Barack Obama is president of which country? 207"),305,60);
        getWorld().addObject(new TextField("a. India"),91,191);
        getWorld().addObject(new TextField("b. US"),81,247);
        getWorld().addObject(new TextField("c. UK"),82,302);
        getWorld().addObject(new TextField("d. Australia"),118,356);
        getWorld().removeObject(this);
    }
    
    public ICardComponent getQCard(int pos){ return null;}
    public void addQCard(ICardComponent ques){}
    public void removeQCard(ICardComponent ques){}
    
    
}


