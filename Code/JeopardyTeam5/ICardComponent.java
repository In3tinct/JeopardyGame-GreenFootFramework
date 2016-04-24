interface ICardComponent
{
    public void addQCard(ICardComponent card);
    public void removeQCard(ICardComponent card);
    public void displayQCard(ICardComponent card);
    public ICardComponent getQCard(int pos);
    public void setCardState(ICardState state);
    public ICardState getCardState();
};