package GUI;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Test;

public class RegisterTest {
	static final int USERLIMIT = 20;
	@Test
	public void UsernameCheck() {
		String username = "Nicholas Tan";
		if (username.length() > USERLIMIT){
			fail();
		} else {
			System.out.println(username + "\nThis Username is Available\n");
		}
	}
	
	static final int WRONGUSERLIMIT = 20;
	@Test
	public void WrongUsernameCheck() {
		String username = "Nicholas Tan Zhi Yang";
		if (username.length() > WRONGUSERLIMIT){
			System.out.println(username+"\nUsername Over the Limit, The Limit is 20 Characters Include Spaces.");
			fail();
		} else {
			System.out.println(username + "\nThis Username is Available\n");
		}
	}

}
