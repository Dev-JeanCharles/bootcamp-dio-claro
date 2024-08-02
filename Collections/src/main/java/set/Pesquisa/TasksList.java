package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class TasksList {
    private Set<Task> taskSet;

    public TasksList() {
        this.taskSet = new HashSet<>();
    }

    public void addTask(String description) {
        taskSet.add(new Task(description));
    }

    public void removeTask(String description) {
        taskSet.removeIf(task -> task.getDescription().equals(description));
    }

    public void showTasks() {
        System.out.println(taskSet);
    }

    public void countTasks() {
        System.out.println("O número totoal de tarefas é de: " + taskSet.size() + " tarefa(s)");
    }

    public Set<Task> getTasksFinished() {
        Set<Task> taskFinished = new HashSet<>();

        if (!taskSet.isEmpty()) {
            for (Task t : taskSet) {
                if (t.isCompleted()) {
                    taskFinished.add(t);
                }
            }
        }
        return taskFinished;
    }

    public Set<Task> getTasksPendent() {
        Set<Task> taskPendent = new HashSet<>();

        if (!taskSet.isEmpty()) {
            for (Task t : taskSet) {
                if (!t.isCompleted()) {
                    taskPendent.add(t);
                }
            }
        }
        return taskPendent;
    }

    public void markTaskFinished(String description) {
        for (Task t : taskSet) {
            if (t.getDescription().equalsIgnoreCase(description)) {
                t.setCompleted(true);
                break;
            }
        }
    }

    public void markTaskPendent(String description) {
        for (Task t : taskSet) {
            if (t.getDescription().equalsIgnoreCase(description)) {
                t.setCompleted(false);
                break;
            }
        }
    }

    public void removeTaskList() {
        taskSet.clear();
    }

    public static void main(String[] args) {
        TasksList tasksList = new TasksList();

        tasksList.addTask("Tarefa 1");
        tasksList.addTask("Tarefa 2");
        tasksList.addTask("Tarefa 3");
        tasksList.addTask("Tarefa 4");

        tasksList.showTasks();

        tasksList.removeTask("Tarefa 1");

        tasksList.showTasks();

        tasksList.countTasks();

        tasksList.markTaskFinished("Tarefa 2");

        tasksList.showTasks();

        System.out.println("As tarefas concluídas são: " + tasksList.getTasksFinished());

        System.out.println("As tarefas pendentes são: " + tasksList.getTasksPendent());

        tasksList.removeTaskList();

        tasksList.showTasks();
    }
}
