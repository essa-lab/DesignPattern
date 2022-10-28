package StrategyPattern;
//Design Principle : Code to Interface , not implementation
//Design Principle : Identify the aspects of your application that vary and separate them from what stays the same.
//Here there are tow behaviors that change a lot so i separate them from what stay the same


public interface FlyBehavior {
	public void fly();
}
