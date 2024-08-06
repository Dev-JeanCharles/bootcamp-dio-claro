package main.java.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class ScheduleContact {
    private Map<String, Integer> scheduleContactMap;

    public ScheduleContact() {
        this.scheduleContactMap = new HashMap<>();
    }

    public void addContact(String name, Integer phone) {
       scheduleContactMap.put(name, phone);
    }

    public void removeContact(String name) {
        if (!scheduleContactMap.isEmpty()) {
            scheduleContactMap.remove(name);
        }
    }

    public void showContact(){
        System.out.println(scheduleContactMap);
    }

    public Integer searchByName(String name) {
        Integer numberByName = null;
        if (!scheduleContactMap.isEmpty()) {
            numberByName = scheduleContactMap.get(name);
        }
        return numberByName;
    }

    public static void main(String[] args) {
        ScheduleContact scheduleContact = new ScheduleContact();

        scheduleContact.addContact("Jean", 123456);
        scheduleContact.addContact("Jean", 5678);
        scheduleContact.addContact("Jean Charles", 8881);
        scheduleContact.addContact("Matheus Santos", 8881);
        scheduleContact.addContact("Marina", 4231);

        scheduleContact.showContact();

        scheduleContact.removeContact("Matheus Santos");
        scheduleContact.showContact();

        System.out.println("O número é: " + scheduleContact.searchByName("Jean"));
    }
}
