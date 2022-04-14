package ua.lviv.iot.lab2.EventOrganization.model;

public class BubbleEvent extends ActiveEvent {

	protected boolean floorProtectionNeeded;
	protected boolean kidsInvolved;

	public BubbleEvent(String name, EventTypes eventType, float price, boolean isIndoors, int maxNumberOfKidsInvolved, float durationInHours,
			boolean floorProtectionNeeded, boolean kidsInvolved) {
		super(name, eventType, price, isIndoors, maxNumberOfKidsInvolved, durationInHours);
		this.floorProtectionNeeded = floorProtectionNeeded;
		this.kidsInvolved = kidsInvolved;
	}

}
