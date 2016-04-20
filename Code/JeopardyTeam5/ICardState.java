 import greenfoot.*;  

public interface ICardState {
    	public ICardState displayQCard(MyWorld world,ICardState state);
    	public void timeOutCard(MyWorld world);
    	public void resetCard();
}
