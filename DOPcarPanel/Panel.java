package DOPcarPanel;

import DOPcarPanel.interfaces.Observer;
import DOPcarPanel.interfaces.Subject;

import java.util.ArrayList;
import java.util.List;

public class Panel implements Subject {

	private List<Observer> observers;
	private int petrol;
	private int speed;
	private int engineTemperature;
	
	public Panel() {
		observers = new ArrayList<Observer>();
	}
	
	public void registerObserver(Observer o) {
		observers.add(o);
	}
	
	public void removeObserver(Observer o) {
		observers.remove(o);
	}
	
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(petrol, speed, engineTemperature);
		}
	}
	
	public void measurementsChanged() {
		notifyObservers();
	}
	
	public void setMeasurements(int petrol, int speed, int engineTemperature) {
		this.petrol = petrol;
		this.speed = speed;
		this.engineTemperature = engineTemperature;
		measurementsChanged();
	}
}
