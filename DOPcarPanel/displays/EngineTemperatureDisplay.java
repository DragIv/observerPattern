package DOPcarPanel.displays;


import DOPcarPanel.Panel;
import DOPcarPanel.interfaces.DisplayElement;
import DOPcarPanel.interfaces.Observer;

public class EngineTemperatureDisplay implements Observer, DisplayElement {

	private int currentEngineTemperature = 90;
	private int lastEngineTemperature;
	private int currentPetrol = 40;
	private int lastPetrol;

	private Panel panel;


	public EngineTemperatureDisplay(Panel panel) {
		this.panel = panel;
		panel.registerObserver(this);
	}

	public void update(int petrol, int speed, int engineTemperature) {
		lastEngineTemperature = currentEngineTemperature;
		currentEngineTemperature = engineTemperature;

		lastPetrol = currentPetrol;
		currentPetrol = petrol;
		display();
	}


	public void display() {
		System.out.print("Temperature: ");
		if (currentEngineTemperature >= lastEngineTemperature) {
			System.out.println("Engine temperature increased by " + (currentEngineTemperature - lastEngineTemperature) +"C");
		}
		else {
			System.out.println("Engine temperature decreased by "+ (lastEngineTemperature - currentEngineTemperature) +"C");
		}

		System.out.print("Speed: ");
		if (currentPetrol >= lastPetrol) {
			System.out.println(" increased by: " + (currentPetrol - lastPetrol) +"km/h");
		}
		else {
			System.out.println(" decreased by: "+ (lastPetrol - currentPetrol) +"km/h");
		}
	}
}
