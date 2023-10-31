import org.testng.Assert;
import org.testng.annotations.Test;

public class UserValidatorTest {
    @Test
    public void testValidUser() {
    	Assert.assertTrue(UserValidator.validate("mayank", "password"));
    }
    @Test
    public void testInvalidUser() {
    	Assert.assertFalse(UserValidator.validate("wronguser", "wrongpassword"));
    }
}
