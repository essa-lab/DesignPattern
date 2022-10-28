package ObserverPattern;

public class CurrentConditionDisplay implements Observer,Display {

	private float temp;
	private float humidity;
	private Subject weatherData;
	
	public CurrentConditionDisplay(Subject weatherData) {
		this.weatherData=weatherData;
		weatherData.registerObserver(this);
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Current Condition : " + temp + " F degree and "+ humidity+"% humidity");
	}

	@Override
	public void update(float temp, float huminadity, float pressure) {
		// TODO Auto-generated method stub
		this.temp=temp;
		this.humidity=huminadity;
		display();
		
	}

}
