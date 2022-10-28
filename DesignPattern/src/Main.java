import StrategyPattern.Duck;
import StrategyPattern.FlyWithRocket;
import StrategyPattern.ModelDuck;
import StrategyPattern.NormalDuck;
import StrategyPattern.RubberDuck;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to STRATEGY PATTERN one of the behavioral PATTERN");
		System.out.println("-----------");
		Duck JOY = new NormalDuck();
		JOY.Display();//view the duck
		JOY.performFly();//Normal Duck Fly behavior
		JOY.performQuack();//normal Duck quack behavior
		JOY.swim();//normal duck swim
		System.out.println("-----------");
		Duck MODEL = new ModelDuck();
		MODEL.Display();//model DUCK LOOKS LIKE
		MODEL.performFly();//CAN'T fly
		MODEL.setFlyBehavior(new FlyWithRocket());//change the fly behavior dynamically
		MODEL.performFly();//FLY WITH ROCKET
		MODEL.performQuack();
		System.out.println("------------");
		Duck RUBBER = new RubberDuck();
		RUBBER.Display();
		RUBBER.performFly();
		RUBBER.performQuack();
		RUBBER.swim();
	}

}
