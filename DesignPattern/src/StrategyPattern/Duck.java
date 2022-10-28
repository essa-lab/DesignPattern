package StrategyPattern;
/*
 * The Strategy Pattern defines a family of algorithms,
encapsulates each one, and makes them interchangeable.
Strategy lets the algorithm vary independently from
clients that use it.

 */

public abstract class Duck {
	//Design Principle : Favor COMPOSITION over INHERATINCE
	protected FlyBehavior flyBehavior;
	protected QuackBehavior quackBehavior;
	public Duck() {
		
	}
	public abstract void Display();
	public void performQuack() {
		quackBehavior.quack();
	}
	public void performFly() {
		flyBehavior.fly();
	}
	public void swim() {
		System.out.println("all Ducks SWIM!");
	}

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}
	
	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
}
