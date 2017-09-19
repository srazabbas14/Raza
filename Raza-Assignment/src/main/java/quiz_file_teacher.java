import java.io.File;
public class quiz_file_teacher {
public String[] paths; 
 quiz_file_teacher()
		{
			File file = null;
		

		    try {      
		       // create new file object
		       file = new File("Quiz");

		       // array of files and directory
		       paths = file.list();

		       // for each name in the path array
		       for(String path:paths) {
		          // prints filename and directory name
		          System.out.println(path);
		       }
		       
		    }catch(Exception e) {
		       // if any error occurs
		       e.printStackTrace();
		    }
		 }
	}
	
	
	

