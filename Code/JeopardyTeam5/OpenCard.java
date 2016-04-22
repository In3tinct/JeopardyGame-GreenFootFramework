import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
public class OpenCard  extends QuestionCardLeaf273 implements ICardState {
	
	@Override
	public ICardState displayQCard(MyWorld world,ICardState state) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void timeOutCard(MyWorld world) {
		world.removeObjects(world.getObjects(ExplanationText.class));
        world.removeObjects(world.getObjects(ResultScreen.class));

	}

	@Override
	public void resetCard() {
		System.out.println("Reset Open Card");
		setCardState(new ClosedCard());
	}

}
