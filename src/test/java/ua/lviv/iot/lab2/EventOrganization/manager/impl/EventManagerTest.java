package ua.lviv.iot.lab2.EventOrganization.manager.impl;

import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.lviv.iot.lab2.EventOrganization.model.*;


class EventManagerTest {
	
	private List<Event> events;
	private EventManager eventManager;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		events = new LinkedList<>();
		events.add(new CinemaEvent("Multiplex Movie", EventTypes.CINEMA, 500, true, 5, 1.5f, "Spiderman"));
		events.add(new BubbleEvent("Big Bubbles", EventTypes.BUBBLE, 850, true, 5, 1, true, true));
		events.add(new AnimatorEvent("Superhero Animators", EventTypes.ANIMATOR, 2500, true, 8, 4, 2));
		events.add(new TrampolineEvent("Regular Trampoline", EventTypes.TRAMPOLINE, 3000, false, 4, 1, 25));
		events.add(new CinemaEvent("PlanetaKino Movie", EventTypes.CINEMA, 160, true, 2, 1.8f, "Interstellar"));
		eventManager = new EventManager();
		eventManager.addEvents(events);
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	
	 @Test
	  void testGetGoodsSortedByPriceAsc() {
	    eventManager.sortEventsByPrice(events, false);
	    Assertions.assertEquals(5, events.size());
	    Assertions.assertEquals(160, events.get(0).getPrice());
	    Assertions.assertEquals("PlanetaKino Movie", events.get(0).getName());
	    Assertions.assertEquals(500, events.get(1).getPrice());
	    Assertions.assertEquals("Multiplex Movie", events.get(1).getName());
	    Assertions.assertEquals(850, events.get(2).getPrice());
	    Assertions.assertEquals("Big Bubbles", events.get(2).getName());
	    Assertions.assertEquals(2500, events.get(3).getPrice());
	    Assertions.assertEquals("Superhero Animators", events.get(3).getName());
	    Assertions.assertEquals(3000, events.get(4).getPrice());
	    Assertions.assertEquals("Regular Trampoline", events.get(4).getName());
	  }
	  
	  @Test
	  void testGetGoodsSortedByPriceDesc() {
		  eventManager.sortEventsByPrice(events, true);
		  Assertions.assertEquals(5, events.size());
		  Assertions.assertEquals(3000, events.get(0).getPrice());
		  Assertions.assertEquals("Regular Trampoline", events.get(0).getName());
		  Assertions.assertEquals(2500, events.get(1).getPrice());
		  Assertions.assertEquals("Superhero Animators", events.get(1).getName());
		  Assertions.assertEquals(850, events.get(2).getPrice());
		  Assertions.assertEquals("Big Bubbles", events.get(2).getName());
		  Assertions.assertEquals(500, events.get(3).getPrice());
		  Assertions.assertEquals("Multiplex Movie", events.get(3).getName());
		  Assertions.assertEquals(160, events.get(4).getPrice());
		  Assertions.assertEquals("PlanetaKino Movie", events.get(4).getName());
	  }
	  
	  @Test
	  void testBookEvent() {
		  Assertions.assertEquals(5, events.size());
		  Assertions.assertNull(eventManager.findEventsByName("Mutiplex Movie"));
		  Assertions.assertDoesNotThrow(()->eventManager.bookEvent("Multiplex Movie", events));
		  Assertions.assertEquals(4, events.size());
		  Assertions.assertNull(eventManager.findEventsByName("Mutiplex Movie"));
	  }
	@Test
	void testEmptyManagerReturnNull() {
		nullResultTest(new EventManager());
	}
	
	void testManagerReturnNull() {
		nullResultTest(eventManager);
	}

	void nullResultTest(EventManager eventManager) {
		var results = eventManager.findEventsByName("Multiplex Movie");
		Assertions.assertNull(results);
	}
	
	@Test
	void testFindEventsByName() {
		var results = eventManager.findEventsByName("Multiplex Movie");
		Assertions.assertEquals(1, results.size());
		Assertions.assertEquals("Multiplex Movie", results.get(0).getName());
	}

}
