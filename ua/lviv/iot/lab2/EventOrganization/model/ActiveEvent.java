package ua.lviv.iot.lab2.EventOrganization.model;

public class ActiveEvent extends Event {

	public ActiveEvent(String name, EventTypes eventType, float price, boolean isIndoors, int maxNumberOfKidsInvolved, float durationInHours) {
		super(name, eventType, price, isIndoors, maxNumberOfKidsInvolved, durationInHours);
	}
}
