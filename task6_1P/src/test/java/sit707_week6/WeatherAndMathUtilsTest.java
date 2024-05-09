package sit707_week6;

import org.junit.Assert;
import org.junit.Test;

public class WeatherAndMathUtilsTest {
	
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
	public void testFalseNumberIsEven() {
		int a = 1;
		Assert.assertFalse(WeatherAndMathUtils.isEven(a));
	}
	
	@Test
	public void testTrueNumberIsEven() {
		int a = 2;
		Assert.assertTrue(WeatherAndMathUtils.isEven(a));
	}

	@Test
	public void testFalseNumberIsPrime() {
		int a = 4;
		Assert.assertFalse(WeatherAndMathUtils.isPrime(a));
	}

	@Test
	public void testTrueNumberIsPrime() {
		int a = 2;
		Assert.assertTrue(WeatherAndMathUtils.isPrime(a));
	}
	
    @Test
    public void testCancelWeatherAdvice() {
    	Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(70.1, 0.0));
    }

	@Test
	public void testWarnWeatherAdvice() {
		Assert.assertEquals("WARN", WeatherAndMathUtils.weatherAdvice(45.1, 0));
	}

	@Test
	public void testAllClearWeatherAdvice() {
		Assert.assertEquals("ALL CLEAR", WeatherAndMathUtils.weatherAdvice(0, 0));
	}

	@Test (expected = IllegalArgumentException.class)
	public void testIllegalArgumentException() {
		WeatherAndMathUtils.weatherAdvice(-1, -1);
	}
}