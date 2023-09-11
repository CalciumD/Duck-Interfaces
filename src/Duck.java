public abstract class Duck{
	
	protected FlyBehaviour flybehaviour;
	protected QuackBehaviour quackbehaviour;
	
	// Default fly method 
//	public void fly()
//	{
//		System.out.println("Fly: Zooms through the air gracefully.");
//	}

//	public void quack()
//	{
//		System.out.println("Quack: Quack");
//	}

	public void performFly() {
		
	}
	
	public void performQuack() {
		
	}
	
	public void setFlyBehaviour(FlyBehaviour fb) {
		flybehaviour = fb;
	}
	
	public void setQuackBehaviour(QuackBehaviour qb) {
		quackbehaviour = qb;
	}
	

	public abstract void display();
}
