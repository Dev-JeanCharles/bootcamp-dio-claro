package main.java.set.OperacoesBasicas;

import java.util.Objects;

public class Guest {

    private String name;
    private int codeInvite;

    public Guest(String name, int codeInvite) {
        this.name = name;
        this.codeInvite = codeInvite;
    }

    public String getName() {
        return name;
    }

    public int getCodeInvite() {
        return codeInvite;
    }

    @Override
    public String toString() {
        return "Convidado{" +
                "name='" + name + '\'' +
                ", codeInvite=" + codeInvite +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Guest guest = (Guest) o;
        return codeInvite == guest.codeInvite;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(codeInvite);
    }
}
