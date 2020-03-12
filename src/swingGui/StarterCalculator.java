package swingGui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class StarterCalculator {

	public static void main(String[] args) {
		JFrame frame = new JFrame("programma");
		JPanel panel = new JPanel();
		frame.setSize(800,800);
		frame.add(panel);
		
		JLabel label = new JLabel();
		
		JTextField textfield1 = new JTextField();
		textfield1.setColumns(10);
		JTextField textfield2 = new JTextField();
		textfield2.setColumns(10);
		
		JButton button = new JButton("vermenigvudig");
		button.setSize(80,50);
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int waarde1 = Integer.parseInt(textfield1.getText());
				int waarde2 = Integer.parseInt(textfield2.getText());
				int uitkomst = waarde1 * waarde2;
				label.setText("" + uitkomst);
			}
		});
		panel.add(textfield1);
		panel.add(textfield2);
		panel.add(button);
		panel.add(label);
		frame.setVisible(true);
	}
}
