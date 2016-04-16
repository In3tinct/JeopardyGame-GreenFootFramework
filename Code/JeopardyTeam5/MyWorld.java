import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    //private Timer timer = 0;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x454 cells with a cell size of 1x1 pixels.
        super(600,454,1);
        addObject(new QuestionCardLeaf("100"), 66, 127);
        addObject(new QuestionCardLeaf("100"), 158, 127);
        addObject(new QuestionCardLeaf("100"), 256, 127);
        addObject(new QuestionCardLeaf("100"), 349, 127);
        addObject(new QuestionCardLeaf("100"), 443, 127);
        addObject(new QuestionCardLeaf("100"), 537, 127);
        addObject(new QuestionCardLeaf("200"), 66, 198);
        addObject(new QuestionCardLeaf("200"), 158, 198);
        addObject(new QuestionCardLeaf("200"), 256, 198);
        addObject(new QuestionCardLeaf("200"), 349, 198);
        addObject(new QuestionCardLeaf("200"), 443, 198);
        addObject(new QuestionCardLeaf("200"), 537, 198);
        addObject(new QuestionCardLeaf("300"), 66, 269);
        addObject(new QuestionCardLeaf("300"), 158, 269);
        addObject(new QuestionCardLeaf("300"), 256, 269);
        addObject(new QuestionCardLeaf("300"), 349, 269);
        addObject(new QuestionCardLeaf("300"), 443, 269);
        addObject(new QuestionCardLeaf("300"), 537, 269);
        addObject(new QuestionCardLeaf("400"), 66, 340);
        addObject(new QuestionCardLeaf("400"), 158, 340);
        addObject(new QuestionCardLeaf("400"), 256, 340);
        addObject(new QuestionCardLeaf("400"), 349, 340);
        addObject(new QuestionCardLeaf("400"), 443, 340);
        addObject(new QuestionCardLeaf("400"), 537, 340);
       addObject(new Score("Score: "),230,446); //Score counter
        
    }
}
