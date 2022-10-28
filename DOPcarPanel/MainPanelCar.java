package DOPcarPanel;

import DOPcarPanel.displays.*;

public class MainPanelCar {
	public static void main(String[] args) {
		Panel panel = new Panel();

		EngineTemperatureDisplay engineTemperatureDisplay= new EngineTemperatureDisplay(panel);
		AutoStatusDisplay autoStatusDisplay = new AutoStatusDisplay(panel);


		panel.setMeasurements(40, 65, 100);
		System.out.println();
		panel.setMeasurements(36, 70, 89);
	}
}
