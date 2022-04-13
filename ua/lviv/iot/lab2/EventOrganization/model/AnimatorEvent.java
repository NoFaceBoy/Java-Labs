package ua.lviv.iot.lab2.EventOrganization.model;

public class AnimatorEvent extends ActiveEvent {

	protected int numberOfAnimators;
	
	public AnimatorEvent(float price, boolean isIndoors, int maxNumberOfKidsInvolved, float durationInHours, int numberOfAnimators) {
		super(price, isIndoors, maxNumberOfKidsInvolved, durationInHours);
		this.numberOfAnimators = numberOfAnimators;
	}
}
