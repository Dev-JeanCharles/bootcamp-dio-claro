package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class JoinGuests {
    private Set<Guest> guestSet;

    public JoinGuests() {
        this.guestSet = new HashSet<>();
    }

    public void createGuest(String name, int codeInvite) {
        guestSet.add(new Guest(name, codeInvite));
    }

    public void removeGuestByCodeInvite(int codeInvite) {
        Guest guestForRemove = null;

        for (Guest g : guestSet) {
            if (g.getCodeInvite() == codeInvite) {
                guestForRemove = g;
                break;
            }
        }
        guestSet.remove(guestForRemove);
    }

    public int countGuests() {
        return guestSet.size();
    }

    public void showGuests() {
        System.out.println(guestSet);
    }

    public static void main(String[] args) {
        JoinGuests joinGuests = new JoinGuests();

        System.out.println("Existem: " + joinGuests.countGuests() + "\nconvidado(s) dentro do Set de convidados");

        joinGuests.createGuest("Convidado 1", 1234);
        joinGuests.createGuest("Convidado 2", 1235);
        joinGuests.createGuest("Convidado 3", 1235);
        joinGuests.createGuest("Convidado 4", 1237);

        joinGuests.showGuests();

        System.out.println("Existem: " + joinGuests.countGuests() + "\nconvidados(s) dentro do Set de convidados");

        joinGuests.removeGuestByCodeInvite(1237);
        System.out.println("Existem: " + joinGuests.countGuests() + "\nconvidados(s) dentro do Set de convidados");

        joinGuests.showGuests();


    }
}
