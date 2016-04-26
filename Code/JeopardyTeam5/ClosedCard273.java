import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

public class ClosedCard273 extends QuestionCardLeaf273 implements ICardState {
    
    public ICardComponent displayQCard(MyWorld world,ICardState state, ICardComponent card) {
        world.setCurrentCard(card);
        world.addObject(new QuestionScreen(),100,100);
        world.addObject(new Question("Barack Obama is president of which country? 273",card),305,60);
        world.addObject(new TextField("a. India",card),91,191);
        world.addObject(new TextField("b. US",card),81,247);
        world.addObject(new TextField("c. UK",card),82,302);
        world.addObject(new TextField("d. Australia",card),118,356);
        world.answerClicked=false;
        world.startTimer();
       ((QuestionCardLeaf273)card).setCardState(new OpenCard273());
        return card;
    }

    @Override
    public void timeOutCard(MyWorld world,ICardComponent card) {
        ((QuestionCardLeaf273)card).setCardState(new DisabledCard273());

    }

    @Override
    public void resetCard() {
        System.out.println("Reset closed Card");
        setCardState(new ClosedCard273());

    }

}
