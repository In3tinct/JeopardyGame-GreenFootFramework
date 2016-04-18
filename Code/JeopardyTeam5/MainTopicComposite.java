import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;

/**
 * Write a description of class MainTopicComposite here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainTopicComposite extends Actor implements ICardComponent
{
   
    int xcoords[] = {66,158,256,349,443,537};
    int ycoords[] = {127,198,269,340,411};
    String score[] = {"100","200","300","400","500"};
    
    ArrayList<ICardComponent> questionCards = new ArrayList<>();
    
    /**
     * Act - do whatever the MainTopicComposite wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
          
            if(Greenfoot.mouseClicked(this)){
                getWorld().addObject(new GameScreen(),300,225);
                createAllQCards();
                addAllQCardsToWorld();
       
       getWorld().addObject(new Score("Score: "),230,446);
            //Removing the first screen object

            getWorld().removeObjects(getWorld().getObjects(MainScreen.class));
        }
        // Add your action code here.
    }  
    
    void createAllQCards() 
    {
        for(int y=0, sc=0;y<ycoords.length;y++, sc++) {

            for(int x=0;x<xcoords.length;x++) {
                ICardComponent ques = new QuestionCardLeaf(score[sc]); 
                addQCard(ques);
            }
        }
    }
    
    void addAllQCardsToWorld()
    {
        int pos = 0;
        for(int y=0, sc=0;y<ycoords.length;y++, sc++) {

            for(int x=0;x<xcoords.length;x++) {
                
                ICardComponent ques = getQCard(pos); 
                addQCardToWorld(ques, x, y);
                pos++;
            }
        }
    }
    
    void addQCardToWorld(ICardComponent ques, int x, int y)
    {
        Actor q = (Actor)ques;
        getWorld().addObject(q, xcoords[x], ycoords[y]);
    }
    
    public void addQCard(ICardComponent ques)
    {
        questionCards.add(ques);
    }
    
    public void removeQCard(ICardComponent ques)
    {
        questionCards.remove(ques);
    }
    
    public void displayQCard()
    {            
    }
    
    public ICardComponent getQCard(int pos)
    {
        return questionCards.get(pos);
    }
}
