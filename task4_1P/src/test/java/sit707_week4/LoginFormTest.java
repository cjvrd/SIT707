package sit707_week4;

import org.junit.Assert;
import org.junit.Test;

/**
 * Tests functions in LoginForm.
 * @author Ahsan Habib
 */
public class LoginFormTest 
{

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
    public void testFailEmptyUsernameAndEmptyPasswordAndDontCareValCode()
    {
		LoginStatus status = LoginForm.login(null, null);
		Assert.assertTrue(status.isLoginSuccess() == false); //why not assert false?
		//why not assert error message also?
    }
	
	/*
	 * Write more test functions below.
	 */

	@Test
	public void testEmptyUsername() {
		LoginStatus status = LoginForm.login("", "dontcare");
		Assert.assertFalse(status.isLoginSuccess());
		Assert.assertEquals("Empty Username", status.getErrorMsg());
	}

	@Test
	public void testInvalidUsername() {
		LoginStatus status = LoginForm.login("invalid", "dontcare");
		Assert.assertFalse(status.isLoginSuccess());
		Assert.assertEquals("Credential mismatch", status.getErrorMsg());
	}

	@Test
	public void testValidUsernameEmptyPassword() {
		LoginStatus status = LoginForm.login("ahsan", "");
		Assert.assertFalse(status.isLoginSuccess());
		Assert.assertEquals("Empty Password", status.getErrorMsg());
	}

	@Test
	public void testValidUsernameInvalidPassword() {
		LoginStatus status = LoginForm.login("ahsan", "invalid");
		Assert.assertFalse(status.isLoginSuccess());
		Assert.assertEquals("Credential mismatch", status.getErrorMsg());
	}

	@Test
	public void testValidUsernameValidPasswordEmptyCode() {
		LoginStatus status = LoginForm.login("ahsan", "ahsan_pass");
		Boolean emptycode = LoginForm.validateCode("");
		Assert.assertTrue(status.isLoginSuccess());
		Assert.assertFalse(emptycode);
	}

	@Test
	public void testValidUsernameValidPasswordInvalidCode() {
		LoginStatus status = LoginForm.login("ahsan", "ahsan_pass");
		Boolean invalidcode = LoginForm.validateCode("invalid");
		Assert.assertTrue(status.isLoginSuccess());
		Assert.assertFalse(invalidcode);
	}

	@Test
	public void testValidUsernameValidPasswordValidCode() {
		LoginStatus status = LoginForm.login("ahsan", "ahsan_pass");
		Boolean validcode = LoginForm.validateCode("123456");
		Assert.assertTrue(status.isLoginSuccess());
		Assert.assertTrue(validcode);
	}
}
