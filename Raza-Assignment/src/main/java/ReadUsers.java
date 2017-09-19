import java.util.ArrayList;
import java.io.*;
public class ReadUsers {
	public ArrayList<user_check> users =new ArrayList<user_check>();
	private String fileName;
	
	ReadUsers() throws IOException{
		fileName = "users.txt";
		 BufferedReader br = new BufferedReader(new FileReader(fileName));
		 try {
		        String line ="" ;

		        while (line != null) {
		        	String name = br.readLine() ;
		        	String password = br.readLine();
		        	boolean role = Boolean.parseBoolean(br.readLine());
		        	String score = br.readLine();
		        	user_check temp  = new user_check();
		        	temp.setFromFile(name, password, role, score);
		        	line = br.readLine();
		        	
		        	users.add(temp);
		        	temp.print();
		        	
		        }
		    } finally {
		        br.close();
		    }
	}
	
}
