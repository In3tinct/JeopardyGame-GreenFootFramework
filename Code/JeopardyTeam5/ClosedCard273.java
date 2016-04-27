import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

public class ClosedCard273 extends QuestionCardLeaf273 implements ICardState {
    String cats="";
    public ICardComponent displayQCard(MyWorld world,ICardState state, ICardComponent card,String typeOfTopic,String score, int x) {
        world.setCurrentCard(card);
        ChallengeQuestion[] q=world.getQuestions();
        world.addObject(new QuestionScreen(),100,100);
        if(x==66)
        {
          cats="GREENFOOT: THE CLASS";
        }
        else if(x==158)
        {
            cats="RAW DATA";
        }
        for(int i=0;i<q.length;i++)
        {
			if(cats.equalsIgnoreCase(q[i].cat) && (Integer.parseInt(score))==q[i].value)
			{
			world.addObject(new Question(q[i].que,card),305,60);
			world.addObject(new TextField(q[i].answers.get(0).ans,card,q[i].answers.get(0).isCorrect),91,191);
			world.addObject(new TextField(q[i].answers.get(1).ans,card,q[i].answers.get(1).isCorrect),81,247);
			world.addObject(new TextField(q[i].answers.get(2).ans,card,q[i].answers.get(2).isCorrect),82,302);
			world.addObject(new TextField(q[i].answers.get(3).ans,card,q[i].answers.get(3).isCorrect),118,356);
			world.answerClicked=false;
			world.startTimer();
		   ((QuestionCardLeaf273)card).setCardState(new OpenCard273());
			
		   }
		}
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
