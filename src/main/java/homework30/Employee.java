package homework30;

import java.util.HashMap;
import java.util.Objects;

public class Employee {
    private int emloyeeId;
    private String name;
    private String position;
    private HashMap<Integer, Task> employeeTasks = new HashMap<>();

    public Employee(int emloyeeId, String name, String position) {
        this.emloyeeId = emloyeeId;
        this.name = name;
        this.position = position;
    }

    public int getEmloyeeId() {
        return emloyeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "emloyeeId=" + emloyeeId +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", employeeTasks=" + employeeTasks +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return emloyeeId == employee.emloyeeId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(emloyeeId);
    }

    public void addTask(Task task){
        employeeTasks.put(task.getTaskId(), task);
    }

    public void deleteTask (int taskId) {
        employeeTasks.remove(taskId);
    }
    public void displayEmployee(){
        System.out.println(toString());
    }
}
