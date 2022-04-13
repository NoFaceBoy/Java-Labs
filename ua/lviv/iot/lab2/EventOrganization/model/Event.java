package ua.lviv.iot.lab2.EventOrganization.model;

public class Event {

	protected float price;
	protected boolean isIndoors;
	protected int maxNumberOfKidsInvolved;
	protected float durationInHours;
	
	public Event(float price, boolean isIndoors, int maxNumberOfKidsInvolved, float durationInHours) {
		this.price = price;
		this.isIndoors = isIndoors;
		this.maxNumberOfKidsInvolved = maxNumberOfKidsInvolved;
		this.durationInHours = durationInHours;
	}
}
