package ua.lviv.iot.lab2.EventOrganization;

import java.util.LinkedList;
import java.util.List;

import ua.lviv.iot.lab2.EventOrganization.manager.impl.*;
import ua.lviv.iot.lab2.EventOrganization.model.*;

public class Main {
	public static void main(String[] args) {

		EventManager manager = new EventManager();
		List<Event> availableEvents = new LinkedList<Event>();

		AnimatorEvent animator = new AnimatorEvent("Superhero Animators", EventTypes.ANIMATOR, 2500, true, 8, 4, 2);
		TrampolineEvent trampoline = new TrampolineEvent("Regular Trampoline", EventTypes.TRAMPOLINE, 3000, false, 4, 1, 25);
		CinemaEvent cinema = new CinemaEvent("Multiplex Movie", EventTypes.CINEMA, 500, true, 5, 1.5f, "Spiderman");
		CinemaEvent cinema2 = new CinemaEvent("PlanetaKino Movie", EventTypes.CINEMA, 160, true, 2, 1.8f, "Interstellar");
		BubbleEvent bubble = new BubbleEvent("Big Bubbles", EventTypes.BUBBLE, 850, true, 5, 1, true, true);
		
		availableEvents.add(animator);
		availableEvents.add(trampoline);
		availableEvents.add(cinema);
		availableEvents.add(cinema2);
		availableEvents.add(bubble);

		manager.addEvents(availableEvents);
		
		System.out.println("List of available events:" + availableEvents + "\n");
		manager.sortEventsByPrice(availableEvents, true);
		System.out.println("Sorted by price:" + availableEvents + "\n");
		System.out.println("Searching for events named 'Regular Trampoline':" + manager.findEventsByName("Regular Trampoline") + "\n");
		manager.bookEvent("Multiplex Movie", availableEvents);
		System.out.println("After booking:" + availableEvents + "\n");
	}
}