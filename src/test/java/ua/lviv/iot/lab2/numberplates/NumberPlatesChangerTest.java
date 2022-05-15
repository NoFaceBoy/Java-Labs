package ua.lviv.iot.lab2.numberplates;	

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class NumberPlatesChangerTest {
	
	private NumberPlatesChanger changer;
	
	@BeforeEach
    void setUp() {
        changer = new NumberPlatesChanger();
    }
	
	@Test
	void testNumberPlatesChange() {
		final String text = "Lorem ipsum dolor sit amet BC5595AT. Turpis egestas integer eget 574-13 HA. Tincidunt augue interdum velit AA 3943 HB euismod in pellentesque.";
		final String expected = "Lorem ipsum dolor sit amet CAR_NUMBER. Turpis egestas integer eget CAR_NUMBER. Tincidunt augue interdum velit CAR_NUMBER euismod in pellentesque.";
		Assertions.assertEquals(expected, changer.replaceNumberPlates(text));
	}
}
