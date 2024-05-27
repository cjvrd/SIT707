package sit707_week10;

import org.junit.Test;

import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;

public class onTrackUnitTest {

    @Test
    public void testUnitClassInstance() {
        String unitTitle = "Software Quality and Testing";
        String unitCode = "SIT707";
        String unitTrimester = "T1, 2024";
        List<Task> taskList = new ArrayList<Task>();

        Unit unit = new Unit(unitTitle, unitCode, unitTrimester, taskList);

        Assert.assertNotNull(unit);
        fail();
    }
    
    @Test
    public void testUnitInformation() {
        String unitTitle = "Software Quality and Testing";
        String unitCode = "SIT707";
        String unitTrimester = "T1, 2024";
        List<Task> taskList = new ArrayList<Task>();

        Unit unit = new Unit(unitTitle, unitCode, unitTrimester, taskList);

        unitTitle = unit.getTitle();
        unitCode = unit.getCode();
        unitTrimester = unit.getTrimester();

        Assert.assertEquals("Software Quality and Testing", unitTitle);
        Assert.assertEquals("SIT707", unitCode);
        Assert.assertEquals("T1, 2024", unitTrimester);

        fail();
    }

    @Test
    public void testUnitTasks() {
        String unitTitle = "Software Quality and Testing";
        String unitCode = "SIT707";
        String unitTrimester = "T1, 2024";

        List<Task> taskList = new ArrayList<Task>();

        String taskTitle = "1.1";
        String taskGrade = "P";
        String taskDueDate = "28/05/2024";
        Task task = new Task(taskTitle, taskGrade, taskDueDate);

        taskList.add(task);

        Unit unit = new Unit(unitTitle, unitCode, unitTrimester, taskList);

        List<Task> testTaskList = unit.getTasks();

        Assert.assertEquals(taskList, testTaskList);

        fail();
    }
}
