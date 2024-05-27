package sit707_week10;

import java.util.List;

public class Unit {
    private String unitTitle, unitCode, unitTrimester;
    private List<Task> taskList;

    public Unit(String unitTitle, String unitCode, String unitTrimester, List<Task> taskList) {
        this.unitTitle = unitTitle;
        this.unitCode = unitCode;
        this.unitTrimester = unitTrimester;
        this.taskList = taskList;
    }

    public String getTitle() {
        return unitTitle;
    }

    public String getCode() {
        return unitCode;
    }

    public String getTrimester() {
        return unitTrimester;
    }

    public List<Task> getTasks() {
        return taskList;
    }
}
