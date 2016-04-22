import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

public class DisabledCard extends QuestionCardLeaf273 implements ICardState {
	@Override
	public ICardState displayQCard(MyWorld world,ICardState state) {
		return null;

	}

	@Override
	public void timeOutCard(MyWorld world) {
		// TODO Auto-generated method stub

	}

	@Override
	public void resetCard() {
		System.out.println("Reset disabled card");
		setCardState(new ClosedCard());
	}

}
