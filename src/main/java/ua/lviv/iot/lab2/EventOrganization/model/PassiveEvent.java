package ua.lviv.iot.lab2.EventOrganization.model;

public class PassiveEvent extends Event {

	public PassiveEvent(String name, EventTypes eventType, float price, boolean isIndoors, int maxNumberOfKidsInvolved, float durationInHours) {
		super(name, eventType, price, isIndoors, maxNumberOfKidsInvolved, durationInHours);
	}
}
