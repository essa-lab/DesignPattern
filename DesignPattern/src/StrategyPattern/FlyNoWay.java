package StrategyPattern;

public class FlyNoWay implements FlyBehavior{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		// Toys Ducks cant fly
		System.out.println("I can't Fly");
	}

}
