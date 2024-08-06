package main.java.map.Ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class ShoulderEvents {
    Map<LocalDate, Event> eventMap;

    public ShoulderEvents() {
        this.eventMap = new HashMap<>();
    }

    public void addEvent(LocalDate data, String name, String attraction) {
        eventMap.put(data, new Event(name, attraction));
    }

    public void showShoulder() {
        Map<LocalDate, Event> eventTreeMap = new TreeMap<>(eventMap);
        System.out.println(eventTreeMap);
    }

    public void getProxEvent() {
        /*Set<LocalDate> dateSet = eventMap.keySet();
        Collection<Event> values = eventMap.values();*/
//      eventMap.get()

        LocalDate dateNow = LocalDate.now();
        LocalDate proxDate = null;
        Event proxEvent = null;
        Map<LocalDate, Event> eventTreeMap = new TreeMap<>(eventMap);

        for (Map.Entry<LocalDate, Event> entry : eventTreeMap.entrySet()) {
            if (entry.getKey().isEqual(dateNow) || entry.getKey().isAfter(dateNow)) {
                proxDate = entry.getKey();
                proxEvent = entry.getValue();
                System.out.println("O próximo evento: " + proxEvent + "\nacontecerá na data: " + proxDate);
                break;
            }
        }
    }

    public static void main(String[] args) {
     ShoulderEvents shoulderEvents = new ShoulderEvents();

     shoulderEvents.addEvent(LocalDate.of(2024, Month.AUGUST, 6), "Evento 1", "Atração 1");
     shoulderEvents.addEvent(LocalDate.of(2024, 7, 9), "Evento 2", "Atração 2");
     shoulderEvents.addEvent(LocalDate.of(2025, Month.JUNE, 15), "Evento 3", "Atração 3");
     shoulderEvents.addEvent(LocalDate.of(2024, Month.AUGUST, 7), "Evento 4", "Atração 4");

     shoulderEvents.showShoulder();

     shoulderEvents.getProxEvent();
    }
}
