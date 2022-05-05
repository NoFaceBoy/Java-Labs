package ua.lviv.iot.lab2.EventOrganization;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.lviv.iot.lab2.EventOrganization.manager.impl.EventManager;
import ua.lviv.iot.lab2.EventOrganization.model.AnimatorEvent;
import ua.lviv.iot.lab2.EventOrganization.model.BubbleEvent;
import ua.lviv.iot.lab2.EventOrganization.model.CinemaEvent;
import ua.lviv.iot.lab2.EventOrganization.model.Event;
import ua.lviv.iot.lab2.EventOrganization.model.EventTypes;
import ua.lviv.iot.lab2.EventOrganization.model.TrampolineEvent;
import ua.lviv.iot.lab2.EventOrganization.writer.EventWriter;

class EventWriterTest {

	List<Event> events;
	EventManager eventManager = new EventManager();

	@BeforeEach
	void setUp() throws Exception {
		events = new LinkedList<Event>();
		events.add(new CinemaEvent("Multiplex Movie", EventTypes.CINEMA, 500, true, 5, 1.5f, "Spiderman"));
		events.add(new CinemaEvent("PlanetaKino Movie", EventTypes.CINEMA, 160, true, 2, 1.8f, "Interstellar"));
		events.add(new BubbleEvent("Big Bubbles", EventTypes.BUBBLE, 850, true, 5, 1, true, true));
		events.add(new AnimatorEvent("Superhero Animators", EventTypes.ANIMATOR, 2500, true, 8, 4, 2));
		events.add(new TrampolineEvent("Regular Trampoline", EventTypes.TRAMPOLINE, 3000, false, 4, 1, 25));
		eventManager = new EventManager();
		eventManager.addEvents(events);
		EventWriter.writeCSV(new LinkedList<>());
		EventWriter.writeCSV(events);
	}

	@Test
	void writeGeneralCSVTest() throws IOException {
	    try (
	        FileReader expectedReader = new FileReader(new File("src/test/resources/expected.csv"));
	        BufferedReader expectedBR = new BufferedReader(expectedReader);
	        FileReader actualReader = new FileReader(new File("src/test/resources/result.csv"));
	        BufferedReader actualBR = new BufferedReader(actualReader)) {
	      String expectedLine = "";
	      while ((expectedLine = expectedBR.readLine()) != null) {
	        Assertions.assertEquals(expectedLine, actualBR.readLine());
	      }
	    }
	  }
	
	@Test
	  void writeOneClassCSVTest() throws IOException {
	    try (
	        FileReader expectedReader = new FileReader(new File("src/test/resources/expectedOneClass.csv"));
	        BufferedReader expectedBR = new BufferedReader(expectedReader);
	        FileReader actualReader = new FileReader(new File("src/test/resources/result.csv"));
	        BufferedReader actualBR = new BufferedReader(actualReader)) {
	      String line = "";
	      while ((line = expectedBR.readLine()) != null) {
	        Assertions.assertEquals(line, actualBR.readLine());
	      }
	    }
	  }
	
	@Test
    void writeEmptyCSVTest() throws IOException {
		try (FileReader expectedReader = new FileReader(new File("src/test/resources/expectedEmpty.csv"));
                BufferedReader expectedBR = new BufferedReader(expectedReader)) {
			Assertions.assertNull(expectedBR.readLine());
        }
    }

}
