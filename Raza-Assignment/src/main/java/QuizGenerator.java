import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class QuizGenerator extends JFrame implements ActionListener  {
 
	
  // Constructor
  QuizGenerator(String s) {
    super("Quizer_Start: " + s);
    
 

    
    

    Container cp = getContentPane();
    cp.setLayout(new FlowLayout());
    // the main window
    cp.add(new JLabel("Menu Window"));
    // pack();
    setSize(400, 400);

   
    JButton button1 = new JButton();
    button1.setText("Student");
    JButton button2 = new JButton("Teacher");
    // adding buttons to the frame
    cp.add(button1);
    cp.add(button2);
    
  }

  public static void main(String[] arg) {
    new QuizGenerator("Testing").setVisible(true);
   
  }
}
