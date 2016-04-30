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
    Color color;
    ICardComponent card;
    boolean isCorrect;
    /*public TextField(String text,ICardComponent card) {
        ans = text;
        g = new GreenfootImage(text, 30, Color.YELLOW , null);
        g.scale(100,100);
        setImage(g);
        this.card =card;
    }*/
    
    public TextField(String text,ICardComponent card,boolean isCorrect) {
        ans = text;
        color = Color.WHITE;
        wordWrap(ans,color);
        this.card =card;
        this.isCorrect=isCorrect;
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
          color = Color.RED;
          wordWrap(ans,color);
        }
        else
        {
          color = Color.WHITE;
          wordWrap(ans,color);
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
            if(this.isCorrect==true)
            {
            getWorld().addObject(new ExplanationText("Correct Answer",this.card),245,205);
            }
            else
            {
                getWorld().addObject(new ExplanationText("Incorrect Answer",this.card),245,205);
            }
            getWorld().removeObjects(getWorld().getObjects(QuestionScreen.class));
            getWorld().removeObjects(getWorld().getObjects(Question.class));
            getWorld().removeObjects(getWorld().getObjects(TextField.class));

            
        }
    }
    
    public void wordWrap(String printtext,Color colorvalue)
        {
         int width = 550; // maximum width of a line
         int size = 30; // font size of text
         int height = new GreenfootImage(" ", size, null, null).getHeight();
         String text = ans; 
          // building the image
         String[] lines = text.split("\n"); // get lines
         GreenfootImage image = new GreenfootImage(width, height*lines.length); // final image
          for (int i=0; i<lines.length; i++)
              { // draw each line image on final image
	          GreenfootImage line = new GreenfootImage(lines[i], size, colorvalue, null);
              image.drawImage(line, 200, i*height);    
              }
              setImage(image);        
      }
    
}
