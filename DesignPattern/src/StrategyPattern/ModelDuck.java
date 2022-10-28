package StrategyPattern;

public class ModelDuck extends Duck{

	public ModelDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new NoQuack();
	}
	@Override
	public void Display() {
		// TODO Auto-generated method stub
		//Very AWESOME DCUK
		System.out.println("I'm Model Duck");
	}

}
