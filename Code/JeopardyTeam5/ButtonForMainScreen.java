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
            getWorld().addObject(new GameScreen(),300,225);
            getWorld().addObject(new QuestionCardLeaf("100"), 66, 127);
        getWorld().addObject(new QuestionCardLeaf("100"), 158, 127);
        getWorld().addObject(new QuestionCardLeaf("100"), 256, 127);
        getWorld().addObject(new QuestionCardLeaf("100"), 349, 127);
        getWorld().addObject(new QuestionCardLeaf("100"), 443, 127);
        getWorld().addObject(new QuestionCardLeaf("100"), 537, 127);
        getWorld().addObject(new QuestionCardLeaf("200"), 66, 198);
        getWorld().addObject(new QuestionCardLeaf("200"), 158, 198);
        getWorld().addObject(new QuestionCardLeaf("200"), 256, 198);
        getWorld().addObject(new QuestionCardLeaf("200"), 349, 198);
        getWorld().addObject(new QuestionCardLeaf("200"), 443, 198);
        getWorld().addObject(new QuestionCardLeaf("200"), 537, 198);
        getWorld().addObject(new QuestionCardLeaf("300"), 66, 269);
        getWorld().addObject(new QuestionCardLeaf("300"), 158, 269);
        getWorld().addObject(new QuestionCardLeaf("300"), 256, 269);
        getWorld().addObject(new QuestionCardLeaf("300"), 349, 269);
        getWorld().addObject(new QuestionCardLeaf("300"), 443, 269);
        getWorld().addObject(new QuestionCardLeaf("300"), 537, 269);
        getWorld().addObject(new QuestionCardLeaf("400"), 66, 340);
        getWorld().addObject(new QuestionCardLeaf("400"), 158, 340);
        getWorld().addObject(new QuestionCardLeaf("400"), 256, 340);
        getWorld().addObject(new QuestionCardLeaf("400"), 349, 340);
        getWorld().addObject(new QuestionCardLeaf("400"), 443, 340);
        getWorld().addObject(new QuestionCardLeaf("400"), 537, 340);
       getWorld().addObject(new Score("Score: "),230,446);
            //Removing the first screen object

            getWorld().removeObjects(getWorld().getObjects(MainScreen.class));
        }
        // Add your action code here.
    }    
}
