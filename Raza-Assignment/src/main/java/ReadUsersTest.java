import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

public class ReadUsersTest {

	@Test
	public void test() throws IOException {
		user_check user=new user_check();
			user.setFromFile("abc", "123", false, "0"); 
			//checks if this function is able to read Name,Role and Score from file
		    assertNotNull(user.getName());
		    assertNotNull(user.getRole()); 
		    assertNotNull(user.getScore());
	}
}
