import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class true_false {
	private static String File_name;
	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JLabel lblOption;
	private JLabel lblOption_1;
	private JLabel lblCorrectAnswer;
	private JTextField textField_3;
	private JLabel lblMaxMarks;

	/**
	 * Launch the application.
	 */
	public static void Write_true_false() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					true_false window = new true_false(File_name);
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
	public true_false(String f) {
		this.File_name = f;  
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
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(48, 29, 465, 133);
		frame.getContentPane().add(textPane);
		
		JLabel lblEnterTheMcq = new JLabel("Enter the MCQ.");
		lblEnterTheMcq.setBounds(52, 11, 92, 14);
		frame.getContentPane().add(lblEnterTheMcq);
		
		textField = new JTextField();
		textField.setBounds(181, 184, 107, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(181, 215, 107, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(181, 249, 107, 38);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		lblOption = new JLabel("Option 1:");
		lblOption.setBounds(48, 187, 66, 14);
		frame.getContentPane().add(lblOption);
		
		lblOption_1 = new JLabel("Option 2:");
		lblOption_1.setBounds(48, 218, 66, 14);
		frame.getContentPane().add(lblOption_1);
		
		lblCorrectAnswer = new JLabel("Correct Answer");
		lblCorrectAnswer.setBounds(48, 261, 123, 14);
		frame.getContentPane().add(lblCorrectAnswer);
		
		textField_3 = new JTextField();
		textField_3.setBounds(455, 184, 58, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		lblMaxMarks = new JLabel("Max. Marks");
		lblMaxMarks.setBounds(386, 187, 84, 14);
		frame.getContentPane().add(lblMaxMarks);
		
		JButton btnNewQuestion = new JButton("New Question");
		btnNewQuestion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!textPane.getText().isEmpty() && !textField_2.getText().isEmpty() && !textField_3.getText().isEmpty())
				{
					make_quiz object=new make_quiz(File_name);
					
				 object.make_quiz_function(textPane.getText(),"true","false"," "," ",textField_2.getText(),textField_3.getText());
				 frame.dispose();
				QuizGenerationByTeacher obj=new QuizGenerationByTeacher(File_name);
				obj.Question_Type_Screen();
			}
			}
		});
		btnNewQuestion.setBounds(380, 335, 133, 23);
		frame.getContentPane().add(btnNewQuestion);
	}
}
