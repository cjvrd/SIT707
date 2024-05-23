package web.service;

public class MathQuestionService {

	/**
	 * Calculate Q1 result.
	 * 
	 * @param number1
	 * @param number2
	 * @return
	 */
	public static Double q1Addition(String number1, String number2) {
		// try to parse double, if it fails return null, then handle null in
		// RoutingServlet
		try {
			Double.parseDouble(number1);
			Double.parseDouble(number2);
		} catch (Exception e) {
			return null;
		}
		double result = Double.valueOf(number1) + Double.valueOf(number2);
		return result;
	}

	/**
	 * Calculate Q2 result.
	 * 
	 * @param number1
	 * @param number2
	 * @return
	 */
	public static Double q2Subtraction(String number1, String number2) {
		// try to parse double, if it fails return null, then handle null in
		// RoutingServlet
		try {
			Double.parseDouble(number1);
			Double.parseDouble(number2);
		} catch (Exception e) {
			return null;
		}
		double result = Double.valueOf(number1) - Double.valueOf(number2);
		return result;
	}

	/**
	 * Calculate Q3 result.
	 * 
	 * @param number1
	 * @param number2
	 * @return
	 */
	public static Double q3Multiplication(String number1, String number2) {
		// try to parse double, if it fails return null, then handle null in
		// RoutingServlet
		try {
			Double.parseDouble(number1);
			Double.parseDouble(number2);
		} catch (Exception e) {
			return null;
		}
		Double result = Double.valueOf(number1) * Double.valueOf(number2);
		return result;
	}
}
