package swingGui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Starter {

	public static void main(String[] args) {
		JFrame frame = new JFrame("programma");
		JPanel panel = new JPanel();
		frame.setSize(400,400);
		frame.add(panel);
		
		JLabel label = new JLabel();
		
		JTextField textfield = new JTextField();
		textfield.setColumns(10);
		
		JButton button = new JButton("button");
		button.setSize(80,50);
		button.addActionListener(new ActionListener() {
			int teller = 0;
			
			@Override
			public void actionPerformed(ActionEvent e) {
				teller++;
				label.setText("Aantal keer geklikt: " + teller);
			}
		});
		panel.add(button);
		panel.add(label);
		panel.add(textfield);
		
		frame.setVisible(true);
	}
}
