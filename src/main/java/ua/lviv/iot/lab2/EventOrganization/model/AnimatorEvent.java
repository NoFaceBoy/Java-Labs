package ua.lviv.iot.lab2.EventOrganization.model;

public class AnimatorEvent extends ActiveEvent {

	protected int numberOfAnimators;

	public AnimatorEvent(String name, EventTypes eventType, float price, boolean isIndoors, int maxNumberOfKidsInvolved, float durationInHours,
			int numberOfAnimators) {
		super(name, eventType, price, isIndoors, maxNumberOfKidsInvolved, durationInHours);
		this.numberOfAnimators = numberOfAnimators;
	}
}
