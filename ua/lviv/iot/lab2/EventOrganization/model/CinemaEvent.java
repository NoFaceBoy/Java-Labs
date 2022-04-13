package ua.lviv.iot.lab2.EventOrganization.model;

public class CinemaEvent extends PassiveEvent {

	public String filmName;
	
	public CinemaEvent(float price, boolean isIndoors, int maxNumberOfKidsInvolved, float durationInHours, String filmName) {
		super(price, isIndoors, maxNumberOfKidsInvolved, durationInHours);
		this.filmName = filmName;
	}
}
