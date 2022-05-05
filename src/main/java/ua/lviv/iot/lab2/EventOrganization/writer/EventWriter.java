package ua.lviv.iot.lab2.EventOrganization.writer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import ua.lviv.iot.lab2.EventOrganization.model.Event;

public class EventWriter {
	public static void writeCSV(List<Event> events) throws IOException{
		try(FileWriter writer = new FileWriter(new File("src/test/resources/result.csv"));) {
			String previousClassName = "";
			for(Event event: events) {
				if(!event.getClass().getSimpleName().equals(previousClassName)) {
					writer.write(event.getHeaders() + "\r\n");
					previousClassName = event.getClass().getSimpleName();
				}
			writer.write(event.toCSV() + "\r\n");
			}
		}
	}
}
