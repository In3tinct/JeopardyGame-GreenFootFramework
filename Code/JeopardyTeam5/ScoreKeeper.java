import greenfoot.*;
/**
 * Write a description of class ScoreKeeper here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScoreKeeper 
{
    // instance variables - replace the example below with your own
    String score;
    CountScore c;
    /**
     * Constructor for objects of class ScoreKeeper
     */
    public ScoreKeeper(String score){
        
        this.score=score;
        
    }
    public String check1()
    {
        c=new CountScore(score);
        score=c.check();
        return score;
    }
}
