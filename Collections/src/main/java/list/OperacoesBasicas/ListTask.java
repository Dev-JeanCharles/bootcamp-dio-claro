package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListTask {

    private List<Task> taskList;

    public ListTask() {
        this.taskList = new ArrayList<>();
    }

    public void addTask(String descricao) {
        taskList.add(new Task(descricao));
    }

    public void removeTask(String descricao) {
        List<Task> tasksRemove = new ArrayList<>();

        for (Task t : taskList) {
            if (t.getDescription().equalsIgnoreCase(descricao)) {
                tasksRemove.add(t);
            }
        }
        taskList.removeAll(tasksRemove);
    }

    public int getNumberTotalTasks() {
        return taskList.size();
    }

    public void getDescriptionTasks() {
        System.out.println(taskList);
    }

    public static void main(String[] args) {
        ListTask listTask = new ListTask();
        System.out.println("O número total de elementos na lista é: " + listTask.getNumberTotalTasks());

        listTask.addTask("Tarefa 1");
        System.out.println("O número total de elementos na lista é: " + listTask.getNumberTotalTasks());

        listTask.addTask("Tarefa 2");
        System.out.println("O número total de elementos na lista é: " + listTask.getNumberTotalTasks());

        listTask.addTask("Tarefa 3");
        System.out.println("O número total de elementos na lista é: " + listTask.getNumberTotalTasks());

        listTask.addTask("Tarefa 3");
        System.out.println("O número total de elementos na lista é: " + listTask.getNumberTotalTasks());

        listTask.removeTask("Tarefa 3");
        System.out.println("O número total de elementos na lista é: " + listTask.getNumberTotalTasks());

        listTask.getDescriptionTasks();
    }
}
