import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

public class Quizer_Check_Password {

	@Test
	public void test() throws IOException {
		ReadUsers user=new ReadUsers();
		for (int x=0; x<user.users.size(); x++)
		{
			assertNotNull(user.users.get(x).checkPassword("1223"));
			//checks if password is returned
		}
	}

}
