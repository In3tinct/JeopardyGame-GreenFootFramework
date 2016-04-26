import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
public class OpenCard273  extends QuestionCardLeaf273 implements ICardState {
    
    @Override
    public ICardComponent displayQCard(MyWorld world,ICardState state,ICardComponent card) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void timeOutCard(MyWorld world,ICardComponent card) {
        world.removeObjects(world.getObjects(Question.class));
        world.removeObjects(world.getObjects(TextField.class));
        world.removeObjects(world.getObjects(QuestionScreen.class));
        world.removeObjects(world.getObjects(ExplanationText.class));
        world.removeObjects(world.getObjects(ResultScreen273.class));
       ((QuestionCardLeaf273)card).setCardState(new DisabledCard273());
        
    }

    @Override
    public void resetCard() {
        System.out.println("Reset Open Card");
        setCardState(new ClosedCard273());
    }

}
