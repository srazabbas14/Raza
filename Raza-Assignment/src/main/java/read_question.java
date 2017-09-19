import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class read_question {

	public ArrayList<questions> question =new ArrayList<questions>();
	private String fileName;
	read_question(String Filename) throws IOException{
		this.fileName = Filename;
		System.out.println("this comes after \r\n"+this.fileName);
		 BufferedReader br = new BufferedReader(new FileReader("Quiz\\" + this.fileName ));
		 try {
		        String line ="" ;
                br.readLine();
                br.readLine();
		        while (line != null) {
		          
		        	questions temp  = new questions();
		        			     
		        	temp.setStatement(br.readLine());
		        	if(temp.getStatement() == null)
		        	{
		        		break;
		        	}
		        	temp.setOp1(br.readLine());
		        	temp.setOp2(br.readLine());
		        	temp.setOp3(br.readLine());
		        	temp.setOp4(br.readLine());
		        	temp.setAnswer(br.readLine());
		        	temp.setScore(br.readLine());
		        	question.add(temp);
		        	line = br.readLine();
		        	
		        }
		    } finally {
		        br.close();
		    }
		 System.out.println("File read complete");
	}
}
