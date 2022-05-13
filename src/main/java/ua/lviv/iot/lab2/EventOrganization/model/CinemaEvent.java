package ua.lviv.iot.lab2.EventOrganization.model;

public class CinemaEvent extends PassiveEvent {

	public String filmName;

	public CinemaEvent(String name, EventTypes eventType, float price, boolean isIndoors, int maxNumberOfKidsInvolved, 
			float durationInHours, String filmName) {
		super(name, eventType, price, isIndoors, maxNumberOfKidsInvolved, durationInHours);
		this.filmName = filmName;
	}
	@Override
	  public String getHeaders() {
	    return super.getHeaders() + ",FilmName";
	  }
	
	@Override
	  public String toCSV() {
	    return super.toCSV() + "," + filmName;
	}
}
