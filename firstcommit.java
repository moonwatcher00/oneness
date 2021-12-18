import javax.swing.*;
import java.awt.FlowLayout;

	public class firstcommit extends JFrame{
		public firstcommit() {
			setSize(300,200);
			setTitle("My Frame");
			
            setLayout(new FlowLayout());
            JButton button = new JButton("버튼");
            JButton button2 = new JButton("버튼2");
            add(button);
            add(button2);
            setVisible(true);

             
            
		}
		public static void main(String[]args) {
			firstcommit f = new firstcommit();
		}
	
	}
