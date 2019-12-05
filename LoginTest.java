package GUI;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class LoginTest {
	@Test
	public void UsernameTest() {
		String user = "Nicholas";
		String databaseuser = "Nicholas";
		assertEquals(databaseuser,user);
	}
	
	@Test
	public void WrongUsernameTest() {
		String user = "Asraf";
		String databaseuser = "Nicholas";
		assertEquals(databaseuser,user);
	}
	
	
	@Test
	public void PasswordTest() {
		int password = 1234;
		int databasepassword = 1234;
		assertEquals(databasepassword,password);
	}
	
	@Test
	public void WrongPasswordTest() {
		int password = 1111;
		int databasepassword = 1234;
		assertEquals(databasepassword,password);
	}
	
}
