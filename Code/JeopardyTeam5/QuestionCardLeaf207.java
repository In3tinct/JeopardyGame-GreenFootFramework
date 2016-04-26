import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class Button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class QuestionCardLeaf207 extends Actor implements ICardComponent
{
    ICardState cardOpen ;
    ICardState cardDisabled;
    ICardState cardClosed;
    ICardState cardState;
    //int cardValue = 0;
       
    public QuestionCardLeaf207(){
       }
    public QuestionCardLeaf207(String text){
        //this.cardValue= parseInt(text);
        GreenfootImage g = new GreenfootImage(text, 30, Color.YELLOW , null);
        setImage(g);
        cardClosed = new ClosedCard207();
        this.cardState=cardClosed;
    }
    
    public void setCardState(ICardState state)   {
      this.cardState=state;

    }

    public ICardState getCardState() {
        return this.cardState;
    }
    
    public void displayQCard(ICardComponent card){
        ICardComponent ic=this.cardState.displayQCard((MyWorld)getWorld(),this.cardState,card);
        
    }
    public void timeOutCard(MyWorld world,ICardComponent card){
       this.cardState.timeOutCard(world,card);
    }
    
     /**
     * Act - do whatever the Button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act(){   
        if(Greenfoot.mouseClicked(this)){
            displayQCard(this);
            getWorld().removeObject(this);
        }
    } 
       
     
    public ICardComponent getQCard(int pos){ return null;}
    public void addQCard(ICardComponent ques){}
    public void removeQCard(ICardComponent ques){}
    
    
}
