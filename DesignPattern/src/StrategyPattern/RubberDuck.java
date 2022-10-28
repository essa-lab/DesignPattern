package StrategyPattern;

public class RubberDuck extends Duck{
	
	public RubberDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new SQuack();
	}
	@Override
	public void Display() {
		// TODO Auto-generated method stub
		System.out.println("Looks like Rubber DUCK");
	}

}
