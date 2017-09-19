import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class numeric {

	private JFrame frame;
	private JTextField textField;
	private static String Fname;
	/**
	 * Launch the application.
	 */
	public static void Write_numeric() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					numeric window = new numeric(Fname);
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
	public numeric(String f) {
		Fname = f;
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
		textPane.setBounds(41, 38, 461, 143);
		frame.getContentPane().add(textPane);
		
		JLabel lblEnterTheMcq = new JLabel("Enter the MCQ.");
		lblEnterTheMcq.setBounds(42, 21, 91, 14);
		frame.getContentPane().add(lblEnterTheMcq);
		
		JLabel lblAnswer = new JLabel("Correct Answer:");
		lblAnswer.setBounds(41, 247, 116, 14);
		frame.getContentPane().add(lblAnswer);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setBounds(138, 201, 196, 108);
		frame.getContentPane().add(textPane_1);
		
		textField = new JTextField();
		textField.setBounds(441, 201, 61, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblMaxMarks = new JLabel("Max. Marks");
		lblMaxMarks.setBounds(372, 204, 106, 14);
		frame.getContentPane().add(lblMaxMarks);
		
		JButton btnNewQuestion = new JButton("New Question");
		btnNewQuestion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!textPane.getText().isEmpty() && !textPane_1.getText().isEmpty() && !textField.getText().isEmpty())
				{
					make_quiz object=new make_quiz(Fname) ;
					
				 object.make_quiz_function(textPane.getText(),""," "," "," ",textPane_1.getText(),textField.getText()); 
				frame.dispose();
				QuizGenerationByTeacher obj=new QuizGenerationByTeacher(Fname);
				obj.Question_Type_Screen();
				}
			}
		});
		btnNewQuestion.setBounds(386, 348, 116, 23);
		frame.getContentPane().add(btnNewQuestion);
	}

}
