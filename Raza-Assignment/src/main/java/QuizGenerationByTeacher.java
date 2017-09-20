import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextArea;
import javax.swing.JCheckBox;
import javax.swing.ButtonGroup;
import javax.swing.JToggleButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class QuizGenerationByTeacher {
static String File_Name;
	private JFrame frame;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void Question_Type_Screen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QuizGenerationByTeacher window = new QuizGenerationByTeacher(File_Name);
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
	public QuizGenerationByTeacher(String name) {
		this.File_Name=name;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 575, 503);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		final JCheckBox chckbxMultipleChoiceQuestion = new JCheckBox("Multiple Choice Question");
		buttonGroup.add(chckbxMultipleChoiceQuestion);
		chckbxMultipleChoiceQuestion.setBounds(51, 51, 153, 23);
		frame.getContentPane().add(chckbxMultipleChoiceQuestion);
		
		final JCheckBox chckbxTruefalse = new JCheckBox("True/False");
		buttonGroup.add(chckbxTruefalse);
		chckbxTruefalse.setBounds(51, 90, 114, 23);
		frame.getContentPane().add(chckbxTruefalse);
		
		final JCheckBox chckbxNumeric = new JCheckBox("Numeric");
		buttonGroup.add(chckbxNumeric);
		chckbxNumeric.setBounds(51, 127, 122, 23);
		frame.getContentPane().add(chckbxNumeric);
		
		JLabel lblSelectOneOf = new JLabel("Select one of the following options:");
		lblSelectOneOf.setBounds(51, 11, 227, 23);
		frame.getContentPane().add(lblSelectOneOf);
		
		JButton btnNext = new JButton("NEXT");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(chckbxMultipleChoiceQuestion.isSelected())
				{
					//New screen for MCQs
					 frame.dispose();
					mcqs obj=new mcqs(File_Name);
					obj.Write_mcqs();
				}
				else if(chckbxTruefalse.isSelected())
				{
					//New screen for True false based question
					 frame.dispose();
					true_false obj=new true_false(File_Name);
					obj.Write_true_false();
				}
				else if(chckbxNumeric.isSelected())
				{
					//New screen for numeric based questions
					 frame.dispose();
					numeric obj=new numeric(File_Name);
					obj.Write_numeric();
				}
			}
		});
		btnNext.setBounds(189, 163, 108, 23);
		frame.getContentPane().add(btnNext);
		
		JButton btnEndQuiz = new JButton("End Quiz");
		btnEndQuiz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 user_view obj=new user_view();
					obj.Display_Created_Quiz_to_Teacher();			}
		});
		btnEndQuiz.setBounds(307, 163, 108, 23);
		frame.getContentPane().add(btnEndQuiz);
	}
}
