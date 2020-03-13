package swingGui;

import java.awt.Dimension;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import dateBase.DatabaseConection;

public class StarterOef3 {

	public static void main(String[] args) {
		StarterOef3 printOut = new StarterOef3();
		printOut.createFrame();
	}
	
	public void createFrame() {
		JFrame frame = new JFrame("programma");
		frame.setSize(600,600);
		
		JPanel panel = new JPanel();
		frame.add(panel);
		
		DataBaseConectionOef3 dbcon = new DataBaseConectionOef3(); //conectie gemaakt met de klasse databaseconectioenOef3
		
		JList list = new JList(dbcon.artiestOpvragen().toArray());	//instantie aangemaakt van de database classe hier roep ik de methot van aan 
		
		panel.add(list);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportView(list);
		panel.add(scrollPane);
		
		frame.setVisible(true);
	}
	
}
