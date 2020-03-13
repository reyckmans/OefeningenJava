package swingGui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class StarterOef2 {

	ReadFileOef2 rf = new ReadFileOef2();
	JButton knop = new JButton("Save");
	JTextArea textArea = new JTextArea(20, 20);

	public static void main(String[] args) {
		StarterOef2 textEditor = new StarterOef2();
		textEditor.createFrame();
	}

	public void createFrame() {
		JFrame frame = new JFrame("TextEditor");
		frame.setSize(400, 600);

		JPanel panel = new JPanel();
		frame.add(panel);

		addTextArea(panel);
		addSaveKnop(panel);

		frame.setVisible(true);
	}

	private void addSaveKnop(JPanel panel) {

		knop.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				rf.writeToFile(textArea.getText());
			}
		});
		panel.add(knop);
	}

	private void addTextArea(JPanel panel) {

		JScrollPane sp = new JScrollPane(textArea);

		textArea.setText(rf.read());

		panel.add(sp);
	}

	

}