package sit707_week7;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class BodyTemperatureMonitorTest {

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
	public void testReadTemperatureNegative() {
		BodyTemperatureMonitor bodyTemperatureMonitor = Mockito.mock(BodyTemperatureMonitor.class);
		Mockito.when(bodyTemperatureMonitor.readTemperature()).thenReturn(-1.0);
		double temp = bodyTemperatureMonitor.readTemperature();
		System.out.println("temp: " + temp);
		Assert.assertEquals(-1.0, temp, 0.1);
	}

	@Test
	public void testReadTemperatureZero() {
		BodyTemperatureMonitor bodyTemperatureMonitor = Mockito.mock(BodyTemperatureMonitor.class);
		Mockito.when(bodyTemperatureMonitor.readTemperature()).thenReturn(0.0);
		double temp = bodyTemperatureMonitor.readTemperature();
		System.out.println("temp: " + temp);
		Assert.assertEquals(0.0, temp, 0.1);
	}

	@Test
	public void testReadTemperatureNormal() {
		BodyTemperatureMonitor bodyTemperatureMonitor = Mockito.mock(BodyTemperatureMonitor.class);
		Mockito.when(bodyTemperatureMonitor.readTemperature()).thenReturn(36.5);
		double temp = bodyTemperatureMonitor.readTemperature();
		System.out.println("temp: " + temp);
		Assert.assertEquals(36.5, temp, 0.1);
	}

	@Test
	public void testReadTemperatureAbnormallyHigh() {
		BodyTemperatureMonitor bodyTemperatureMonitor = Mockito.mock(BodyTemperatureMonitor.class);
		Mockito.when(bodyTemperatureMonitor.readTemperature()).thenReturn(40.0);
		double temp = bodyTemperatureMonitor.readTemperature();
		System.out.println("temp: " + temp);
		Assert.assertEquals(40.0, temp, 0.1);
	}

	@Test
	public void testReportTemperatureReadingToCloud() {
		// mock dependencies
		TemperatureSensor temperatureSensor = Mockito.mock(TemperatureSensor.class);
		NotificationSender notificationSender = Mockito.mock(NotificationSender.class);
		CloudService cloudService = Mockito.mock(CloudService.class);

		// create instance with mocked dependencies
		BodyTemperatureMonitor bodyTemperatureMonitor = new BodyTemperatureMonitor(temperatureSensor, cloudService,
				notificationSender);

		// create instance of temp reading to pass in to functions
		TemperatureReading tempReading = new TemperatureReading();

		// call function
		bodyTemperatureMonitor.reportTemperatureReadingToCloud(tempReading);

		// verify that function is being called once from previous function
		Mockito.verify(cloudService).sendTemperatureToCloud(tempReading);
	}

	@Test
	public void testInquireBodyStatusNormalNotification() {
		// mock dependencies
		TemperatureSensor temperatureSensor = Mockito.mock(TemperatureSensor.class);
		NotificationSender notificationSender = Mockito.mock(NotificationSender.class);
		CloudService cloudService = Mockito.mock(CloudService.class);

		// create instance with mocked dependencies
		BodyTemperatureMonitor bodyTemperatureMonitor = new BodyTemperatureMonitor(temperatureSensor, cloudService,
				notificationSender);

		// get customer and doctor
		Customer customer = bodyTemperatureMonitor.getFixedCustomer();
		FamilyDoctor doctor = bodyTemperatureMonitor.getFamilyDoctor();

		// stub return of function as normal
		Mockito.when(cloudService.queryCustomerBodyStatus(customer)).thenReturn("NORMAL");

		// call function
		bodyTemperatureMonitor.inquireBodyStatus();

		// verify notification sent
		Mockito.verify(notificationSender).sendEmailNotification(customer, "Thumbs Up!");
	}

	@Test
	public void testInquireBodyStatusAbnormalNotification() {
		// mock dependencies
		TemperatureSensor temperatureSensor = Mockito.mock(TemperatureSensor.class);
		NotificationSender notificationSender = Mockito.mock(NotificationSender.class);
		CloudService cloudService = Mockito.mock(CloudService.class);

		// create instance with mocked dependencies
		BodyTemperatureMonitor bodyTemperatureMonitor = new BodyTemperatureMonitor(temperatureSensor, cloudService,
				notificationSender);

		// get customer and doctor
		Customer customer = bodyTemperatureMonitor.getFixedCustomer();
		FamilyDoctor doctor = bodyTemperatureMonitor.getFamilyDoctor();

		// stub return of function as normal
		Mockito.when(cloudService.queryCustomerBodyStatus(customer)).thenReturn("BAD");

		// call function
		bodyTemperatureMonitor.inquireBodyStatus();

		// verify notification sent
		Mockito.verify(notificationSender).sendEmailNotification(doctor, "Emergency!");
	}
}