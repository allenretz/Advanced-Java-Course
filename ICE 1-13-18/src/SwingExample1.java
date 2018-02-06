import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class SwingExample1 {
	public static void main(String[] args) {
		JFrame windowFrame = new JFrame("Allen's Frame");
		JTextField textArea = new JTextField();
		textArea.setBounds(50,50,150,20);
		JButton button = new JButton("Click Me");
		button.setBounds(50,100,150,150);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("Example of an Event");
			}
		});
		windowFrame.add(button);
		windowFrame.add(textArea);
		windowFrame.setSize(400,400);
		windowFrame.setLayout(null);
		windowFrame.setVisible(true);
	}
}
