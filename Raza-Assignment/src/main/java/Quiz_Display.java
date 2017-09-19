import java.awt.EventQueue;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Quiz_Display {
	private int Score;
	private boolean role;
	private JFrame frame;
	private final ButtonGroup buttonGroup = new ButtonGroup();
private read_question obj;
private int x;
	/**
	 * Launch the application.
	 */
private static String filename;
	public void quiz_display_main() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Quiz_Display window = new Quiz_Display(filename , role);
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @throws IOException 
	 */
	public Quiz_Display(String fileName , boolean role) throws IOException {
		
		this.role = role;
     obj=new read_question(fileName);
     this.filename=fileName;
     this.x=0;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Score = 0;
		frame = new JFrame();
		frame.setBounds(100, 100, 570, 503);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		//for(int i=0;i<obj.question.size();i++)
		
		
		JLabel label = new JLabel("");
		label.setBounds(33, 282, 46, 14);
		frame.getContentPane().add(label);
		// -------------------------------------------------
		JTextPane textPane_1 = new JTextPane();
		if(!role)
		{
			
			textPane_1.setBounds(33, 180, 368, 46);
			frame.getContentPane().add(textPane_1);
		}
		JButton btnNext = new JButton("NEXT");
		
		btnNext.setBounds(428, 273, 89, 23);
		frame.getContentPane().add(btnNext);
		
		JButton btnEndQuiz = new JButton("END QUIZ");
		btnEndQuiz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				user_view obj=new user_view();
				obj.Display_Created_Quiz_to_Teacher();
			}
		});
		btnEndQuiz.setBounds(428, 430, 89, 23);
		frame.getContentPane().add(btnEndQuiz);
		
		JLabel lblNewLabel = new JLabel("<html>" + obj.question.get(x).getStatement() + "<br>" + obj.question.get(x).getOp1() + "<br>" + obj.question.get(x).getOp2() + "<br>" + obj.question.get(x).getOp3() + "<br>" + obj.question.get(x).getOp4() + "<br>" + "</html>");
		lblNewLabel.setBounds(33, 28, 482, 122);
		frame.getContentPane().add(lblNewLabel);
		
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(x< obj.question.size()) {
					if(!role)
					{
						if(obj.question.get(x).getAnswer().equals( textPane_1.getText()) )
						{
							Score+= Integer.valueOf(obj.question.get(x).getScore());
							System.out.println(Score);
						}
						else {
							System.out.println("Wrong Answer");
							System.out.println((obj.question.get(x).getAnswer()));
						}
					}
				}
					x++;
				if(x<obj.question.size())
			{
				
				
				lblNewLabel.setText("<html>" + obj.question.get(x).getStatement() + "<br>" + obj.question.get(x).getOp1() + "<br>" + obj.question.get(x).getOp2() + "<br>" + obj.question.get(x).getOp3() + "<br>" + obj.question.get(x).getOp4() + "<br>" + "</html>");
				
			}	
				if(x>= obj.question.size() && (!role)) {
					System.out.println("MEssage pop up");
					JOptionPane.showMessageDialog(null, "Score is "+ Score+" " );
				}
			}
		});
		
		
	}
}

