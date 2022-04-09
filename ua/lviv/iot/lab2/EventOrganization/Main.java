package ua.lviv.iot.lab2.EventOrganization;

import ua.lviv.iot.lab2.EventOrganization.model.*;

public class Main {
	public static void main(String[] args) {
		
		AnimatorEvent superhero = new AnimatorEvent(2500, true, 8, 4, 2);
		TrampolineEvent regular = new TrampolineEvent(1000, false, 4, 1, 25);
		CinemaEvent cinema = new CinemaEvent(500, true, 5, 1.5f, "Spiderman");
		
	}
}