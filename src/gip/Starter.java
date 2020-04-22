package gip;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
//import javax.swing.JOptionPane; //dit ga ik gebruiken voor de spelers info.  het volgende is voor in de button zelf ==> JOptionPane.showMessageDialog(null, "This is first button");
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Starter {
	
	public static void main(String[] args) {
		Starter spel = new Starter();
		spel.createFrame();
	}
	
	public void createFrame() {
		// rondom letter maken
		String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		Random rnd = new Random();
		char c = chars.charAt(rnd.nextInt(chars.length()));
		System.out.println(rnd); //test
		
		// random vraag kiezen
		Random rndV = new Random();
	    List<String> givenList = Arrays.asList("Een beroep met een….", "Een zoogdier…", "Een jongensnaam…", "Een meisjesnaam","Wat zie je in de woonkamer…",
	    		"Wat zie je op de boerderij….",
	    		"Een insekt…",
	    		"Kledingstuk/Schoeisel….",
	    		"Noem een kleur….",
	    		"Noem een land….",
	    		"Meisjesnaam….",
	    		"Noem een vissoort met een…..",
	    		"Noem een vogelsoort…",
	    		"Wat vind je in de keuken….",
	    		"Wat vind je in de woonkamer….",
	    		"Noem een bloem plant", "boom of struik….");
	    
	    int numberOfElements = 2;
		
	    /*for (int i = 0; i < numberOfElements; i++) {
	        int randomIndex = rndV.nextInt(givenList.size());
	        String randomElement = givenList.get(randomIndex);
	        givenList.remove(randomIndex);
	    }*/
		
		//frame
		JFrame frame = new JFrame("Pim Pam Pet Online Edition");
		frame.setSize(800,800);
		
		//penel
		JPanel panel = new JPanel();
		frame.add(panel);
		
		//label voor letter
		JLabel labelL = new JLabel();
		labelL.setSize(40, 20); //ik weet niet of dit werk?
		
		// button van de letter
		JButton buttonL = new JButton("Letter");
		buttonL.setSize(80,50);
		buttonL.addActionListener(new ActionListener() {
		
			@Override
			public void actionPerformed(ActionEvent e) {
				 labelL.setText("" + chars.charAt(rnd.nextInt(chars.length())));
			}
		});
		
		//label voor vragen
		JLabel labelV = new JLabel();
		labelV.setSize(80,100);
		
		// button van de vraag
		 JButton buttonV = new JButton("Vraag");
	        buttonV.setSize(80,50);
	        buttonV.addActionListener(new ActionListener() {
	            Random random = new Random();

	            @Override
	            public void actionPerformed(ActionEvent e) {
	                 labelV.setText(givenList.get(random.nextInt(givenList.size())));
	            }
	        });
		
		
		// zichtbaarheid functie
		panel.add(buttonL);
		panel.add(labelL);
		panel.add(buttonV);
		panel.add(labelV);
		frame.setVisible(true);
		
		
	}
}
