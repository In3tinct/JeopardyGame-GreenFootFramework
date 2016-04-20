interface ICardComponent
{
    public void addQCard(ICardComponent ques);
    public void removeQCard(ICardComponent ques);
    public void displayQCard();
    public ICardComponent getQCard(int pos);
};