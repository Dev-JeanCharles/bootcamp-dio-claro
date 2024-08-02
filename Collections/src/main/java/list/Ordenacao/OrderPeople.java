package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrderPeople {
    private List<People> peopleList;

    public OrderPeople() {
        this.peopleList = new ArrayList<>();
    }

    public void createPeople(String name, int age, double height) {
        peopleList.add(new People(name, age, height));
    }

    public List<People> orderByAge() {
        List<People> peopleByAge = new ArrayList<>(peopleList);
        Collections.sort(peopleByAge);
        return peopleByAge;
    }

    public List<People> orderByHeight() {
        List<People> peopleByHeight = new ArrayList<>(peopleList);
        Collections.sort(peopleByHeight, new ComparatorByHeight());
        return peopleByHeight;
    }

    public static void main(String[] args) {
        OrderPeople orderPeople = new OrderPeople();

        orderPeople.createPeople("Nome 1", 20, 1.81);
        orderPeople.createPeople("Nome 2", 15, 1.54);
        orderPeople.createPeople("Nome 3", 19, 1.90);
        orderPeople.createPeople("Nome 4", 32, 1.78);
        orderPeople.createPeople("Nome 5", 18, 1.61);

        System.out.println(orderPeople.orderByAge());
        System.out.println(orderPeople.orderByHeight());
    }
}
