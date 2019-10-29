import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;

public class set_quiz {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void QuizTitleScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					set_quiz window = new set_quiz();
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
	public set_quiz() {
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
		
		textField = new JTextField();
		textField.setBounds(232, 26, 198, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		final JTextPane textPane = new JTextPane();
		textPane.setBounds(232, 63, 198, 87);
		frame.getContentPane().add(textPane);
		
		
		JLabel lblEnterTheTitle = new JLabel("Enter the title of the Quiz:");
		lblEnterTheTitle.setBounds(38, 32, 184, 14);
		frame.getContentPane().add(lblEnterTheTitle);
		
		
		
		
		JLabel lblEnterShortDescription = new JLabel("Enter short description:");
		lblEnterShortDescription.setBounds(38, 73, 184, 14);
		frame.getContentPane().add(lblEnterShortDescription);
		
		JButton btnCreateQuiz = new JButton("Create QUIZ");
		btnCreateQuiz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
                if(!textField.getText().isEmpty() && ! textPane.getText().isEmpty() )	
                {
                	
                	new make_quiz(textField.getText(),textPane.getText());
                }
				QuizGenerationByTeacher obj=new QuizGenerationByTeacher(textField.getText());
				obj.Question_Type_Screen();	
			
			}
		});
		btnCreateQuiz.setBounds(232, 165, 125, 23);
		frame.getContentPane().add(btnCreateQuiz);
		
		
		
		JButton btnLogOut = new JButton("Log Out");
		btnLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Quizer_Start obj=new Quizer_Start();
				obj.main(null);
			}
		});
		btnLogOut.setBounds(367, 165, 116, 23);
		frame.getContentPane().add(btnLogOut);
	}
}
