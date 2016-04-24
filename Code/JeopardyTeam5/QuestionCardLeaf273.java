import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class Button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class QuestionCardLeaf273 extends Actor implements ICardComponent
{
    ICardState cardOpen ;
    ICardState cardDisabled;
    ICardState cardClosed;
    ICardState cardState;
    Command openQuestion;  
    String typeOfTopic;
    String score;
       
    public QuestionCardLeaf273(){
       }
    public QuestionCardLeaf273(String text){
        GreenfootImage g = new GreenfootImage(text, 30, Color.YELLOW , null);
        setImage(g);
        cardClosed = new ClosedCard();
        this.cardState=cardClosed;
        this.typeOfTopic = typeOfTopic;
        this.score = text;
        openQuestion = new Command(this);
    }
    
    public void setCardState(ICardState state)   {
       this.cardState=state;
    }

    public ICardState getCardState() {
        return this.cardState;
    }
    
    public void displayQCard(ICardComponent card){
        openQuestion.execute((MyWorld)getWorld(),this.cardState,typeOfTopic,score,this.getX());
    }
    public void timeOutCard(ICardComponent card){
        (((QuestionCardLeaf273)card).getCardState()).timeOutCard((MyWorld)getWorld());
    }
    public void resetCard(ICardComponent card){
        cardState.resetCard();
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
