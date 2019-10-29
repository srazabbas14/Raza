import static org.junit.Assert.*;

import org.junit.Test;

public class Quiz_DisplayTest {

	@Test
	public void test() {
		questions obj = new questions();
		assertNotNull(obj.getAnswer()); //checks if the file reads the answer from file
		
	}

}
