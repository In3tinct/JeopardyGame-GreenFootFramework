import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
import java.awt.Color;
import java.util.*;
import java.io.*;
import java.awt.Font;
import java.awt.Color;
import java.awt.Dimension;
import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import javax.swing.*;
/**
 * Write a description of class MainTopicComposite here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainTopicComposite extends Actor implements ICardComponent
{
   int cnt=0;
    int xcoords[] = {66,158,256,349,443,537};
    int ycoords[] = {127,198,269,340,411};
    String score[] = {"100","200","300","400","500"};
    private String categoryName;
    ArrayList<ICardComponent> questionCards = new ArrayList<>();
    QuestionCardFactory factory = new QuestionCardFactory();
    private String filename; 
    private String[] categories;
    private ChallengeQuestion[] questions;
     private String[] answerOrder;
    private int numQuestions;
    private static final int MAX_QUESTS=30;
    private static final int MAX_CATS = 6;
    
    public MainTopicComposite(String text){
        if(text=="202"){
            setImage("202.JPG");
        }else if(text=="272"){
            setImage("272.JPG");
        }else if(text=="273"){
            setImage("273.JPG");
        }else if(text=="207"){
            setImage("207.JPG");
        }
        
    }
    /**
     * Act - do whatever the MainTopicComposite wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act(){
        
        if(Greenfoot.mouseClicked(this)){
            categories = new String[MAX_CATS];
            questions=new ChallengeQuestion[MAX_QUESTS];
            //Removing the first screen object
            //getWorld().removeObjects(getWorld().getObjects(MainScreen.class));
            getWorld().addObject(new GameScreen(),300,225);
            try{
               if(this.getName()=="273"){
                   filename="273.txt";
                }
            ArrayList<String> lines=loadFile(filename);
            System.out.println(lines);
            convertUnicode(lines);
            readCategories(lines);
            readQuestions(lines);
            readAnswers(lines);
            for(int i=0;i<questions.length;i++)
            {
                System.out.println(questions.length);
                
            System.out.println(i+questions[i].cat);
        }//System.out.println(questions[29]);
            //System.out.println(answerOrder[1]);
            ((MyWorld)getWorld()).setQuestions(questions);
            createAllQCards(this.getName());
            addAllQCardsToWorld();
            getWorld().addObject(new Score("Score: "),230,446);
        }catch(IOException ioe){
            }
        }
        if(checkIfAllCardsDisabled(this.questionCards) && cnt==0){
            getWorld().addObject(new RoundOverText("Game Over",Color.RED),279,232);
            getWorld().removeObject(this);
            cnt++;
            
        }
   }  
   
   private boolean checkIfAllCardsDisabled(ArrayList<ICardComponent> questionCards){
      Iterator<ICardComponent> itr = questionCards.iterator();
       if(questionCards.size()>0){
        while (itr.hasNext()) {
		    ICardComponent card=itr.next();
			if(card instanceof QuestionCardLeaf273){
			    ICardState state = ((QuestionCardLeaf273)card).getCardState();
			    if(!(state instanceof DisabledCard273))
			     return false;
            }else if(card instanceof QuestionCardLeaf272){
			    ICardState state = ((QuestionCardLeaf272)card).getCardState();
			    if(!(state instanceof DisabledCard272))
			     return false;
            }else if(card instanceof QuestionCardLeaf202){
			    ICardState state = ((QuestionCardLeaf202)card).getCardState();
			    if(!(state instanceof DisabledCard202))
			     return false;
            }else if(card instanceof QuestionCardLeaf207){
			    ICardState state = ((QuestionCardLeaf207)card).getCardState();
			    if(!(state instanceof DisabledCard207))
			     return false;
            }
           }
        }
          else{
           return false;
        }
       
		return true;
    
    }
   
    void createAllQCards(String categoryType){
       
        for(int y=0, sc=0;y<ycoords.length;y++, sc++) {
           for(int x=0;x<xcoords.length;x++) {
                ICardComponent ques = factory.generateQCard(categoryType,score[sc]);
                addQCard(ques);
           }
        }
    }
    
    void addAllQCardsToWorld(){
        int pos = 0;
        for(int y=0, sc=0;y<ycoords.length;y++, sc++) {

            for(int x=0;x<xcoords.length;x++) {
                ICardComponent ques = getQCard(pos); 
                addQCardToWorld(ques, x, y);
                pos++;
            }
        }
    }
    
    void addQCardToWorld(ICardComponent ques, int x, int y){
        Actor q = (Actor)ques;
        getWorld().addObject(q, xcoords[x], ycoords[y]);
    }
    
    public void addQCard(ICardComponent ques){
        questionCards.add(ques);
    }
    
    public void removeQCard(ICardComponent ques){
        questionCards.remove(ques);
    }
    
    public void displayQCard(ICardComponent ques){}
    
    public ICardComponent getQCard(int pos){
        return questionCards.get(pos);
    }
    
    public void setName(String name){
        categoryName=name;
    }
    public String getName(){
        return categoryName;
    }
}
