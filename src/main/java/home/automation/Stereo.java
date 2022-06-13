package home.automation;

import javafx.scene.control.DialogEvent;

/**
 * Created by Ferdinand.Szekeresch on 20.04.2017.
 */

/**
 * Starting from the next software update, it would be nice, if the source of music were selectable by the user.
 */
public class Stereo implements Device {

	public void play(String s) {
		System.out.println("Loading Spotify....");
		System.out.println("Get up, stand up... Stand up for your rights!");

	}

	public void rememberPosition() {
		System.out.println("Play will continue from 'I didn't shoot the deputy.'");
	}

	@Override
	public void turnOff() {
		System.out.println("Stereo Shutting down.");
	}

}
