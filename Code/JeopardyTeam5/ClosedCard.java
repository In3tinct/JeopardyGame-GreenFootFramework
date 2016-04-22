import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

public class ClosedCard extends QuestionCardLeaf273 implements ICardState {
    
    public ICardState displayQCard(MyWorld world,ICardState state) {
        world.addObject(new QuestionScreen(),100,100);
        world.addObject(new Question("Barack Obama is president of which country? 273"),305,60);
        world.addObject(new TextField("a. India"),91,191);
        world.addObject(new TextField("b. US"),81,247);
        world.addObject(new TextField("c. UK"),82,302);
        world.addObject(new TextField("d. Australia"),118,356);
        //super.setState(new OpenCard());
        return new OpenCard();
    }

    @Override
    public void timeOutCard(MyWorld world) {
        // TODO Auto-generated method stub

    }

    @Override
    public void resetCard() {
        System.out.println("Reset closed Card");
        setCardState(new ClosedCard());

    }

}
