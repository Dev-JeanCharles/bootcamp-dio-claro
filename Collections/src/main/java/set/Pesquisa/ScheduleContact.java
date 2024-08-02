package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ScheduleContact {
    private Set<Contact> contactSet;

    public ScheduleContact() {
        this.contactSet = new HashSet<>();
    }

    public void createContact(String name, int number) {
        contactSet.add(new Contact(name, number));
    }

    public void showContacts() {
        System.out.println(contactSet);
    }

    public Set<Contact> searchByName(String name) {
        Set<Contact> contactsByName = new HashSet<>();

        for (Contact c : contactSet) {
            if (c.getName().startsWith(name)) {
                contactsByName.add(c);
            }
        }
        return contactsByName;
    }

    public Contact updateNumberContract(String name, int newNumber) {
        Contact contactUpdated = null;

        for (Contact c : contactSet) {
            if (c.getName().equalsIgnoreCase(name)) {
                c.setNumber(newNumber);
                contactUpdated = c;
                break;
            }
        }
        return contactUpdated;
    }

    public static void main(String[] args) {
        ScheduleContact contact = new ScheduleContact();

        contact.showContacts();

        contact.createContact("Jean", 123456);
        contact.createContact("Vitor", 9812340);
        contact.createContact("Jean", 05673145);
        contact.createContact("Jean Santos", 95001);
        contact.createContact("Jean Charles", 95001);

        contact.showContacts();

        System.out.println(contact.searchByName("Jean"));

        System.out.println("Contato atualizado: " + contact.updateNumberContract("Jean Santos", 88888));

        contact.showContacts();
    }
}
