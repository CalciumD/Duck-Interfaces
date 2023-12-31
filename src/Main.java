import java.util.Collection;
import java.util.ArrayList;

public class Main{

	private Collection<Duck> myDucks = new ArrayList<Duck>();

	public void makeSomeDucks()
	{
		// Make some different ducks
		Duck mallardDuck = new MallardDuck();
		Duck redDuck = new RedheadDuck();
		Duck rubberDuck = new RubberDuck();
		Duck decoy = new DecoyDuck();

		myDucks.add(mallardDuck);
		myDucks.add(rubberDuck);
		myDucks.add(redDuck);
		myDucks.add(decoy);
		
		for(Duck d : myDucks)
		{
			d.display();
			d.performFly();
			d.performQuack();
			d.setFlyBehaviour(new FlyRocketPowered());
		}

	}

	// --------------- Ignore below this ----------------
	public static void main(String[] args)
	{
		Main main = new Main();
		main.makeSomeDucks();
		// dale 
		DaleFatz df =  new DaleFatz();
		df.Redbull();
	}
}
