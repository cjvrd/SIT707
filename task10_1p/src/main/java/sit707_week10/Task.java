package sit707_week10;

public class Task {
    private String taskTitle, taskGrade, taskDueDate;

    public Task(String taskTitle, String taskGrade, String taskDueDate) {
        this.taskTitle = taskTitle;
        this.taskGrade = taskGrade;
        this.taskDueDate = taskDueDate;
    }

    public String getTaskTitle() {
        return taskTitle;
    }

    public String getTaskGrade() {
        return taskGrade;
    }

    public String getTaskDueDate() {
        return taskDueDate;
    }   
}