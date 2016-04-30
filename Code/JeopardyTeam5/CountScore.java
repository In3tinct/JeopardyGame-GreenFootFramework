import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * Write a description of class ObserveSubject here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CountScore extends Actor implements Subject
{
    // instance variables - replace the example below with your own
   int score;
         int finalscore=0; 
   String value;
   public ArrayList<Observer> observers = new ArrayList<Observer>(); 
   //Observer obj;
   public CountScore(String scored){
    score= Integer.parseInt(scored);
    value=printScore(score);
    }
   public void act(){
       
    }
   public void attach(Observer obj)
   {
       //if(obj==null)throw new NullPointerException("Null Observer");
       observers.add(obj);
    }
    public String check(){
      
        return value;
    }
    public String analyze(){
    String ans = printScore(score);
    return ans;
    }
    public void detach(Observer obj)
   {
       observers.remove(obj);
    }
    public void notifyObservers()
    {
    for(Observer obj: observers)
    obj.update();
    }
    public String calculate(){

      
      finalscore+=score;
        return String.valueOf(finalscore);
    }    
    public String printScore(int score){
        String count=calculate();
       value=count;
        return count;
       //getWorld().addObject(new PrintScore(count),268,444); 
    }
    
}
