package ua.lviv.iot.lab2.numberplates;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NumberPlatesChanger {
	
	String text = "";
	
	static final String textChangePlatesTo = "CAR_NUMBER";

	public NumberPlatesChanger(String text) {
		this.text = text;
	}
}