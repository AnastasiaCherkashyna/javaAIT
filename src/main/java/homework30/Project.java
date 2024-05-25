package homework30;

import java.util.HashMap;

public class Project {
    private int projectId;
    private String projectName;
    private HashMap<Integer, Task> projectTasks = new HashMap<>();
    private HashMap<Integer, Employee> projectEmployee = new HashMap<>();

    public Project(int projectId, String projectName, HashMap<Integer, Task> projectTasks, HashMap<Integer, Employee> projectEmployee) {
        this.projectId = projectId;
        this.projectName = projectName;
        this.projectTasks = projectTasks;
        this.projectEmployee = projectEmployee;
    }

    public Project(int projectId, String bankingApp) {

    }

    @Override
    public String toString() {
        return "Project{" +
                "projectId=" + projectId +
                ", projectName='" + projectName + '\'' +
                ", projectTasks=" + projectTasks +
                ", projectEmployee=" + projectEmployee +
                '}';
    }
}
