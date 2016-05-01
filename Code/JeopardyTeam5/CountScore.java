import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * Write a description of class ObserveSubject here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CountScore extends Actor implements Observer
{
    // instance variables - replace the example below with your own
   int presentScore=0;
   MyWorld w;
   public CountScore(MyWorld world ){
       //System.out.println(world.getScore());
       w=world;
       presentScore=(world.getScore());
    }

   
        
    public void printScore(int score){
       w.removeObjects(w.getObjects(PrintScore.class));
       w.addObject(new PrintScore(score),268,444); 
    }
    
    public void update(int point){
        presentScore=presentScore+point;
        w.setScore(presentScore);
        printScore(presentScore);
    }
    
}
