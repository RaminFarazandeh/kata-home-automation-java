package home.automation;

/**
 * Created by Ferdinand.Szekeresch on 20.04.2017.
 */
public class BigOldMasterSwitch {

	private boolean isOn = false;

	private Shutter shutter = new Shutter();

	private AirConditioning airConditioning = new AirConditioning();

	private Lights lights = new Lights();

	private Stereo stereo = new Stereo();

	private CoffeeMaker coffeeMaker = new CoffeeMaker();

	private ResultExporter resultExporter;
	
	public void press() {
		if (!isOn) {
			System.out.println("BIG OLD SWITCH PRESSED.\n\n");
			shutter.close();
			airConditioning.setTemperatureInCelsius(20);
			lights.dimPercent(50);
			stereo.play("Bob Marley");
			coffeeMaker.brew(CoffeeMaker.Type.DECAF);
			isOn = true;


			System.out.println(resultExporter.successful());
			
		} else if (isOn) {
			shutter.open();
			airConditioning.turnOff();
			lights.turnOff();
			stereo.rememberPosition();
			stereo.turnOff();
			if (coffeeMaker.isOn()) {
				coffeeMaker.doClean();
				coffeeMaker.turnOff();
			}
		}
	}


}
