import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.ButtonGroup;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.Font;
import java.awt.Color;

public class Quizer_Start {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private ReadUsers obj;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Quizer_Start window = new Quizer_Start();
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
	public Quizer_Start() {
		try {
			 obj=new ReadUsers();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 277);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(144, 84, 196, 23);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblQuizer = new JLabel("QUIZER");
		lblQuizer.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 30));
		lblQuizer.setBounds(183, 11, 97, 67);
		frame.getContentPane().add(lblQuizer);
		
		JLabel lblName = new JLabel("UserName :");
		lblName.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblName.setBounds(55, 87, 90, 14);
		frame.getContentPane().add(lblName);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblPassword.setBounds(55, 144, 78, 14);
		frame.getContentPane().add(lblPassword);
		
		JButton btnLogIn = new JButton("Login");
		btnLogIn.setBackground(Color.RED);
		btnLogIn.setForeground(Color.WHITE);
		btnLogIn.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
		
					for(int i=0;i<obj.users.size();i++)
					{
						if(obj.users.get(i).getName().equals(textField.getText()))
						{
							if(obj.users.get(i).checkPassword(String.copyValueOf(passwordField.getPassword())))
							{
								  frame.dispose(); //closes this window and next page opens 
								   user_view title_description = new user_view(obj.users.get(i).getRole());
								   title_description.Display_Created_Quiz_to_Teacher();
								  
								break;
							}
						}
					}
				
				
				
			 
			}
		});
		btnLogIn.setBounds(191, 185, 89, 23);
		frame.getContentPane().add(btnLogIn);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(144, 135, 196, 23);
		frame.getContentPane().add(passwordField);
	}
}
