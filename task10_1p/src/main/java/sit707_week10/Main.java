package sit707_week10;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String unitTitle = "Software Quality and Testing";
        String unitCode = "SIT707";
        String unitTrimester = "T1, 2024";

        List<Task> taskList = new ArrayList<Task>();
        Task task = new Task("1.1", "P", "28/05/2024");
        taskList.add(task);

        Unit unit = new Unit(unitTitle, unitCode, unitTrimester, taskList);

        System.out.println(unit.getTitle());
        System.out.println(unit.getCode());
        System.out.println(unit.getTrimester());

        System.out.println(unit.getTasks());
    }
}