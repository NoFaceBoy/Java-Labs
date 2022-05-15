package ua.lviv.iot.lab2.numberplates;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NumberPlatesChanger {

	String text = null;

	public String replaceNumberPlates(String text) {
		final String regex = "([A-Z]{2}[0-9]{4}[A-Z]{2})|([A-Z]{2}\\s[0-9]{4}\\s[A-Z]{2})|([0-9]{3}-[0-9]{2}\\s[A-Z]{2})";
		final String textChangePlatesTo = "CAR_NUMBER";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(text);
		while (matcher.find()) {
			System.out.println(matcher.group());
		}
		String replacedText = matcher.replaceAll(textChangePlatesTo);
		System.out.println(replacedText);
		return replacedText;
	}
}
