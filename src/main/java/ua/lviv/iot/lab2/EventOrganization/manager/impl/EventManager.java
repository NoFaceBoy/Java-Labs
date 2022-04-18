package ua.lviv.iot.lab2.EventOrganization.manager.impl;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

import ua.lviv.iot.lab2.EventOrganization.manager.IEventManager;
import ua.lviv.iot.lab2.EventOrganization.model.Event;

public class EventManager implements IEventManager {

	private Map<String, List<Event>> eventsMap = new HashMap<>();
	
	@Override
	public void addEvents(List<Event> events) {
		events.forEach(event -> {
			String name = event.getName();
			var existingEvents = eventsMap.get(name);
			if(existingEvents == null) {
				existingEvents = new LinkedList<Event>();
				eventsMap.put(name, existingEvents);
			}
			existingEvents.add(event);
		});
	}

	@Override
	public List<Event> findEventsByName(String name) {
		return eventsMap.get(name);
	}

	@Override
	public void sortEventsByPrice(List<Event> events, boolean isReversed) {
		if(isReversed) {
			events.sort(Collections.reverseOrder(Comparator.comparing(Event::getPrice)));
		}
		else {
			events.sort(Comparator.comparing(Event::getPrice));
		}
	}

	@Override
	public void bookEvent(String name, List<Event> events) {
		var bookedEvent = eventsMap.get(name);
		System.out.println("Booked:" + bookedEvent + "\n");
		ListIterator<Event> iter = events.listIterator();
		while(iter.hasNext()){
		    if(iter.next().getName().equals(name)){
		        iter.remove();
		    }
		}
	}
}
