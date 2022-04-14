package ua.lviv.iot.lab2.EventOrganization.model;

public class TrampolineEvent extends ActiveEvent {

	protected int minutesSpentPerKid;

	public TrampolineEvent(String name, EventTypes eventType, float price, boolean isIndoors, int maxNumberOfKidsInvolved, float durationInHours,
			int minutesSpentPerKid) {
		super(name, eventType, price, isIndoors, maxNumberOfKidsInvolved, durationInHours);
		this.minutesSpentPerKid = minutesSpentPerKid;
	}

}
