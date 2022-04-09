package ua.lviv.iot.lab2.EventOrganization.model;

public class PassiveEvent extends Event {

	public PassiveEvent(float price, boolean isIndoors, int maxNumberOfKidsInvolved, float durationInHours) {
		super(price, isIndoors, maxNumberOfKidsInvolved, durationInHours);
	}
}
