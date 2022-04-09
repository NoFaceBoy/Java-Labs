package ua.lviv.iot.lab2.EventOrganization.model;

public class ActiveEvent extends Event {

	public ActiveEvent(float price, boolean isIndoors, int maxNumberOfKidsInvolved, float durationInHours) {
			super(price, isIndoors, maxNumberOfKidsInvolved, durationInHours);
	}
}
