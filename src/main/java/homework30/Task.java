package homework30;

import java.util.Objects;

public class Task {
    private int taskId;
    private  String description;
    private  TaskStatus taskStatus;
    private String deadline;

    public Task(int taskId, String description, TaskStatus taskStatus, String deadline) {
        this.taskId = taskId;
        this.description = description;
        this.taskStatus = taskStatus;
        this.deadline = deadline;
    }


    public int getTaskId() {
        return taskId;
    }
    // setter ID  - delete!!!

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TaskStatus getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(TaskStatus taskStatus) {
        this.taskStatus = taskStatus;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    @Override
    public String toString() {
        return "Task{" +
                "taskId=" + taskId +
                ", description='" + description + '\'' +
                ", taskStatus=" + taskStatus +
                ", deadline='" + deadline + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return taskId == task.taskId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskId);
    }
}
