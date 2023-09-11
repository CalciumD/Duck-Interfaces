public class RubberDuck extends Duck{

	
	public RubberDuck() {
		flybehaviour = new FlyNoWay();
		quackbehaviour = new MuteQuack();
	}
	
//	@Override
//	public void quack()
//	{
//		System.out.println("Quack: Squeeeeek");
//	}
//
//	@Override
//	public void fly()
//	{
//		System.out.println("Fly: I CANNOT FLY");
//	}
	
	public void display()
	{
		System.out.println("Display: I look like a majestic yellow plastic duck.");
	}
}
