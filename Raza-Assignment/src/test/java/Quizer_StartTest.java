import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

public class Quizer_StartTest {

	@Test
	public void test() throws IOException {
		ReadUsers user=new ReadUsers();
		for (int x=0; x<user.users.size(); x++)
		{
			assertNotNull(user.users.get(x).getName()); 
			//checks when on log in page, user name is taken from file
		}
	}

}
