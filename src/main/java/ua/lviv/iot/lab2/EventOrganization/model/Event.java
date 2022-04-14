package ua.lviv.iot.lab2.EventOrganization.model;

public abstract class Event {
	
	private String name;
	private EventTypes eventType;
	private float price;
	private boolean isIndoors;
	private int maxNumberOfKidsInvolved;
	private float durationInHours;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public EventTypes getEventType() {
		return eventType;
	}
	public void setEventType(EventTypes eventType) {
		this.eventType = eventType;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public boolean isIndoors() {
		return isIndoors;
	}
	public void setIndoors(boolean isIndoors) {
		this.isIndoors = isIndoors;
	}
	public int getMaxNumberOfKidsInvolved() {
		return maxNumberOfKidsInvolved;
	}
	public void setMaxNumberOfKidsInvolved(int maxNumberOfKidsInvolved) {
		this.maxNumberOfKidsInvolved = maxNumberOfKidsInvolved;
	}
	public float getDurationInHours() {
		return durationInHours;
	}
	public void setDurationInHours(float durationInHours) {
		this.durationInHours = durationInHours;
	}
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
