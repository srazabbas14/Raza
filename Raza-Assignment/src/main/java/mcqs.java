import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class mcqs {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JLabel lblOption;
	private JLabel lblOption_1;
	private JLabel lblOption_2;
	private JLabel lblOption_3;
	private JLabel lblCorrectAnswer;
	private JTextField textField_5;
	private JLabel lblMaxMarks;
	private JButton btnNewQuestion;
   static String File_name;
	/**
	 * Launch the application.
	 */
	
	public static void Write_mcqs() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mcqs window = new mcqs(File_name);
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public mcqs(String name) {
		this.File_name=name;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 570, 503);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		final JTextPane textPane = new JTextPane();
		textPane.setBounds(57, 41, 448, 113);
		frame.getContentPane().add(textPane);
		
		textField = new JTextField();
		textField.setBounds(170, 165, 178, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(170, 196, 178, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(170, 227, 178, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(170, 258, 178, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(170, 289, 178, 37);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblEnterTheMcq = new JLabel("Enter the MCQ.");
		lblEnterTheMcq.setBounds(57, 16, 125, 14);
		frame.getContentPane().add(lblEnterTheMcq);
		
		lblOption = new JLabel("Option 1:");
		lblOption.setBounds(57, 168, 84, 14);
		frame.getContentPane().add(lblOption);
		
		lblOption_1 = new JLabel("Option 2:");
		lblOption_1.setBounds(57, 199, 84, 14);
		frame.getContentPane().add(lblOption_1);
		
		lblOption_2 = new JLabel("Option 3:");
		lblOption_2.setBounds(57, 230, 84, 14);
		frame.getContentPane().add(lblOption_2);
		
		lblOption_3 = new JLabel("Option 4:");
		lblOption_3.setBounds(57, 261, 84, 14);
		frame.getContentPane().add(lblOption_3);
		
		lblCorrectAnswer = new JLabel("Correct Answer:");
		lblCorrectAnswer.setBounds(57, 300, 103, 14);
		frame.getContentPane().add(lblCorrectAnswer);
		
		textField_5 = new JTextField();
		textField_5.setBounds(452, 165, 53, 20);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		lblMaxMarks = new JLabel("Max. Marks");
		lblMaxMarks.setBounds(383, 168, 89, 14);
		frame.getContentPane().add(lblMaxMarks);
		
		btnNewQuestion = new JButton("New Question");
		btnNewQuestion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				if(!textPane.getText().isEmpty() && !textField.getText().isEmpty() && !textField_1.getText().isEmpty() && !textField_2.getText().isEmpty() && !textField_3.getText().isEmpty() && !textField_4.getText().isEmpty() && !textField_5.getText().isEmpty())
				{
					make_quiz object=new make_quiz(File_name);
					
				 object.make_quiz_function(textPane.getText(),textField.getText(),textField_1.getText(),textField_2.getText(),textField_3.getText(),textField_4.getText(),textField_5.getText());
					 frame.dispose();
						QuizGenerationByTeacher obj=new QuizGenerationByTeacher(File_name);
						obj.Question_Type_Screen();
			}
				
				
			}
		});
		btnNewQuestion.setBounds(383, 362, 122, 23);
		frame.getContentPane().add(btnNewQuestion);
	}
}



