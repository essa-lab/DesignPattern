package StrategyPattern;

public class NormalDuck extends Duck{

	public NormalDuck() {
		flyBehavior = new FlyWithWings();
		quackBehavior = new NormalQuack();
	}
	@Override
	public void Display() {
		// TODO Auto-generated method stub
		System.out.println("I'm Normal Duck");
	}

}
