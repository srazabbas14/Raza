import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import java.io.BufferedWriter;


//comment123
public class make_quiz {
private static String title;


public make_quiz(String title)
{
	this.title=title;
}

	make_quiz(String title, String desc)
	{
		this.title=title;
		try {
			File file = new File("Quiz\\" + title + ".txt");
			FileWriter fileWriter = new FileWriter(file);
			fileWriter.write(title);
			fileWriter.write("\r\n");
			fileWriter.write(desc);
			
			fileWriter.flush();
			fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	public void make_quiz_function(String question, String option1,String option2,String option3,String option4,String answer,String marks)
	{
	
			 String FILENAME = "Quiz\\" + title + ".txt";
            System.out.println(FILENAME);
			
			BufferedWriter bw = null;
			FileWriter fw = null;
			{

			try {

				String data =question +"\r\n" +option1+"\r\n"+option2+"\r\n"+option3+"\r\n"+option4+"\r\n"+answer+"\r\n"+marks+"\r\n";
               System.out.println(option1);
				File file = new File(FILENAME);

				// if file doesnt exists, then create it
				if (!file.exists()) {
					file.createNewFile();
				}

				// true = append file
				fw = new FileWriter(file.getAbsoluteFile(), true);
				bw = new BufferedWriter(fw);
				bw.write("\r\n");
				bw.write(data);
				

				System.out.println("Done");

			} catch (IOException e) {

				e.printStackTrace();

			} finally {

				try {

					if (bw != null)
						bw.close();

					if (fw != null)
						fw.close();

				} catch (IOException ex) {

					ex.printStackTrace();

				}
			}

			}
	}

			
}
			
	
	
	
	

