package sit707_week5;

import java.util.ArrayList;
import java.util.List;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class WeatherControllerTest {

	//initialize variables used in before class
	static WeatherController wController;
	static int nHours;
	static List<Double> tempList;

	//before class now creates weather controller instance before running tests
	//before class now gets all temps using the getTemperatureForHour method and saves results to a list, which can then be used by the test methods
	@BeforeClass
	public static void initOnceBefore() {
		wController = WeatherController.getInstance();
		nHours = wController.getTotalHours();
		tempList = new ArrayList<>();
		for (int i=0; i<nHours; i++) {
			tempList.add(wController.getTemperatureForHour(i+1));
		}
	}

	//now closes weather controller once tests are all complete
	@AfterClass
	public static void initOnceAfter() {
		wController.close();
	}

	@Test
	public void testStudentIdentity() {
		String studentId = "215100352";
		Assert.assertNotNull("Student ID is null", studentId);
	}

	@Test
	public void testStudentName() {
		String studentName = "Christian Virdo";
		Assert.assertNotNull("Student name is null", studentName);
	}

	@Test
	public void testTemperatureMin() {
		System.out.println("+++ testTemperatureMin +++");
		
		//no longer needs to initialise the controller or get hours
		double minTemperature = 1000;

		for (int i=0; i<tempList.size(); i++) {
			// no longer needs to call getTemperatureForHour method each time, just iterates over previously created list
			if (minTemperature > tempList.get(i)) {
				minTemperature = tempList.get(i);
			}
		}
		
		// Should be equal to the min value that is cached in the controller.
		Assert.assertTrue(wController.getTemperatureMinFromCache() == minTemperature);
		
		//no longer needs to close weather controller
	}
	
	@Test
	public void testTemperatureMax() {
		System.out.println("+++ testTemperatureMax +++");
		
		//no longer needs to initialise the controller or get hours
		double maxTemperature = -1;

		for (int i=0; i<tempList.size(); i++) {
			// no longer needs to call getTemperatureForHour method each time, just iterates over previously created list
			if (maxTemperature < tempList.get(i)) {
				maxTemperature = tempList.get(i);
			}
		}
		
		// Should be equal to the min value that is cached in the controller.
		Assert.assertTrue(wController.getTemperatureMaxFromCache() == maxTemperature);
		
		//no longer needs to close weather controller
	}

	@Test
	public void testTemperatureAverage() {
		System.out.println("+++ testTemperatureAverage +++");
		
		//no longer needs to initialise the controller or get hours
		double sumTemp = 0;
		for (int i=0; i<tempList.size(); i++) {
			// no longer needs to call getTemperatureForHour method each time, just iterates over previously created list
			sumTemp += tempList.get(i);
		}
		double averageTemp = sumTemp / nHours;
		
		// Should be equal to the min value that is cached in the controller.
		Assert.assertTrue(wController.getTemperatureAverageFromCache() == averageTemp);

		//no longer needs to close weather controller
	}
	
	@Test
	public void testTemperaturePersist() {
		/*
		 * Remove below comments ONLY for 5.3C task.
		 */
//		System.out.println("+++ testTemperaturePersist +++");
//		
//		// Initialise controller
//		WeatherController wController = WeatherController.getInstance();
//		
//		String persistTime = wController.persistTemperature(10, 19.5);
//		String now = new SimpleDateFormat("H:m:s").format(new Date());
//		System.out.println("Persist time: " + persistTime + ", now: " + now);
//		
//		Assert.assertTrue(persistTime.equals(now));
//		
//		wController.close();
	}
}
