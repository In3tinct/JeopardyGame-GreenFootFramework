 import greenfoot.*;  

public interface ICardState {
    	public ICardComponent displayQCard(MyWorld world,ICardState state,ICardComponent card);
    	public void timeOutCard(MyWorld world,ICardComponent card);
    	public void resetCard();
}
