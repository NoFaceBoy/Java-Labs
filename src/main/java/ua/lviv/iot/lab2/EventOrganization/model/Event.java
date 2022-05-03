package ua.lviv.iot.lab2.EventOrganization.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Event {
	
	private String name;
	private EventTypes eventType;
	private float price;
	private boolean isIndoors;
	private int maxNumberOfKidsInvolved;
	private float durationInHours;
	
	public Event(String name, EventTypes eventType, float price, boolean isIndoors, int maxNumberOfKidsInvolved, float durationInHours) {
		this.name = name;
		this.eventType = eventType;
		this.price = price;
		this.isIndoors = isIndoors;
		this.maxNumberOfKidsInvolved = maxNumberOfKidsInvolved;
		this.durationInHours = durationInHours;
	}
	@Override
	public String toString()
    {
        return "\n|Name: " + name
        		+ "  Event type:" + eventType
        		+ "  Price: " + price
        		+ "  Is indoors: " + isIndoors 
        		+ "  Max number of kids involved: " + maxNumberOfKidsInvolved 
        		+ "  Duration in hours: " + durationInHours + "|";
    }
}
