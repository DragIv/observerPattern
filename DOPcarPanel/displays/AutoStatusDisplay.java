package DOPcarPanel.displays;


import DOPcarPanel.Panel;
import DOPcarPanel.interfaces.DisplayElement;
import DOPcarPanel.interfaces.Observer;

public class AutoStatusDisplay implements Observer, DisplayElement {
	private int petrol;
	private int speed;
	private int engineTemperature;

	public AutoStatusDisplay(Panel panel) {
		panel.registerObserver(this);
	}
	
	public void update(int petrol, int speed, int engineTemperature) {
		this.petrol = petrol;
		this.speed = speed;
		this.engineTemperature = engineTemperature;
		display();
	}
	
	public void display() {
		System.out.println("Fuel quantity: " + petrol +
				" liters and the current speed is " + speed +
				" and the engine temperature is equal to "+ engineTemperature);
	}
}
