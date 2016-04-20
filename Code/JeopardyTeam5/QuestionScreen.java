import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class QuestionScreen here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class QuestionScreen extends Actor
{
    /**
     * Act - do whatever the QuestionScreen wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act(){
        if(Greenfoot.mouseClicked(this)){
            if((getWorld().getObjects(ExplanationText.class).toArray()).length > 0)
            {   System.out.println("Entered" + getWorld().getObjects(ExplanationText.class));
                getWorld().removeObjects(getWorld().getObjects(ExplanationText.class));
                getWorld().removeObjects(getWorld().getObjects(TextField.class));
                getWorld().removeObjects(getWorld().getObjects(Question.class));
                getWorld().removeObjects(getWorld().getObjects(QuestionScreen.class));
                
            }
        }    
        
    }    
}
