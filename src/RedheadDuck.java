public class RedheadDuck extends Duck{

	
	public RedheadDuck() {
		flybehaviour = new FlyWithWings();
		quackbehaviour = new Squeak();
	}
	
	public void display()
	{
		System.out.println("Display: I look like a Duck with a nice red head.");
	}
}
