public class MallardDuck extends Duck{

	public MallardDuck() {
		flybehaviour = new FlyNoWay();
		quackbehaviour = new Quack();
	}
	
	public void display()
	{
		System.out.println("Display: I look like a lovely Mallard Duck");
	}
	
	
}
