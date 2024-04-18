package wk4activelearning;

import org.junit.Assert;
import org.junit.Test;

public class SimpleLoginFormTest {
    
    @Test
    public void testInvalidUser() {
        String result = SimpleLoginForm.login("wronguser", "doesntmatter");
        Assert.assertEquals(result, "username mismatch");
    }
    
    @Test
    public void testValidUserInvalidPass() {
        String result = SimpleLoginForm.login("testuser", "wrongpass");
        Assert.assertEquals(result, "password mismatch");
    }

    @Test
    public void testValidUserValidPass() {
        String result = SimpleLoginForm.login("testuser", "testpass");
        Assert.assertEquals(result, "success");
    }
}
