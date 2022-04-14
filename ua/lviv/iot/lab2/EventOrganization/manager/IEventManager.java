package ua.lviv.iot.lab2.EventOrganization.manager;

import java.util.List;

import ua.lviv.iot.lab2.EventOrganization.model.Event;

public interface IEventManager {
	void addEvents(List<Event> events);
	
	public void bookEvent(String name, List<Event> events);
	
	List<Event> findEventsByName(String name);
	
	void sortEventsByPrice(List<Event> events, boolean isReversed);
}
