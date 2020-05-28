package gip;

/**
 * 
 * 
 * 
 * 
 * 
 * 
 */

// dit zijn al mijn copelingen, deze dienen voor het verweizen naar klassen die door java gemaakt zijn en een eigen voorafgeprogrameerde functie hebben
import java.awt.Color;
import java.awt.color.ColorSpace;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
//import javax.swing.JOptionPane; //dit ga ik gebruiken voor de spelers info.  het volgende is voor in de button zelf ==> JOptionPane.showMessageDialog(null, "This is first button");
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Timer;

import Collections.listInvullenViaForLoop;


// dit is mijn starter classe, dit zorgt er voor dat mijn spel voledich werkt en ook echt iets doet.
public class Starter {
	//panel
		JPanel panel = new JPanel();
		
	//standaart achtergrond
		private Color panelColor;
		
	//button volgende
	JButton buttonVolgende = new JButton("Volgende");
	//button speel
	JButton buttonSpelen = new JButton("speel");
	
	//achtergrond
	ImageIcon background = new ImageIcon("achtergrond.jpg"); 
	
	//counter van timer 2 (dit is de defintie van mijn timer en hoeveel seconden hij heeft
	int time = 15;
	
	//labelTime
	JLabel labelT = new JLabel();
	
	//labelTime2
	JLabel labelT2 = new JLabel();
	
	//timer ==> nog optesplitsen
	  Timer timer = new Timer(1000, createTimerActonListener());
	  
	//timer 2 per vraag
	  Timer timer2 = new Timer(1000, createTimerActionListener2());
	  
	//timer voor terug naar originele kleur
	  Timer timerK = new Timer(500, createTimerActionListenerK());
	  
	//label voor correct of fout
		JLabel labelCF = new JLabel();
	
	final RandomV rndV = new RandomV();
	ControleVraag controle = new ControleVraag();
	
	public static void main(String[] args) {
		Starter spel = new Starter();
		spel.timer.setRepeats(true);
		spel.timer2.setRepeats(true);
		spel.createFrame();
		}
	
	public void createFrame() {
		
		rndV.readLijst();
		//frame
				JFrame frame = new JFrame("Pim Pam Pet Online Edition");
				frame.setSize(1000,800);
		
		//panel
				frame.add(panel);
		
		//label voor letter
				JLabel labelL = new JLabel();
				labelL.setSize(40, 20); //ik weet niet of dit werk?
		
		//label voor met woord letter
				JLabel labelWL = new JLabel("Letter :");
				labelWL.setSize(40, 20);
		
		//label voor vragen
				JLabel labelV = new JLabel();
				labelV.setSize(80,100);
				
		//label voor woord vraag
				JLabel labelWV = new JLabel("Vraag :");
				labelWV.setSize(40, 20); 
				
		//tekstvak
				JTextField textFieldT = new JTextField(20);
				String text = textFieldT.getText();
				
		//label voor de scoren
				JLabel labelS = new JLabel(controle.score + "/15");
				labelS.setSize(40, 20);
				
		//buton voor te spelen
				buttonSpelen.setSize(80,50);
				buttonSpelen.addActionListener(new ActionListener() {
					final RandomL rndL = new RandomL();
					
					@Override
					public void actionPerformed(ActionEvent e) {
						 labelL.setText(rndL.makeRandomL()+"");
						 
						 labelV.setText(rndV.makeRandomV()+"");
		                 
						 timer.start();
						 
		                 timer2.start(); 
		                 
		                 textFieldT.requestFocusInWindow();
					}
				});
		
	    //button voor controleer
				JButton buttonC = new JButton("controleer");
				buttonC.setSize(80,50);
				buttonC.addActionListener(new ActionListener() {
			
					@Override
					public void actionPerformed(ActionEvent e) {
						boolean antwoordcorrect = controle.checkAntwoord(textFieldT.getText(),labelL.getText());
						if (antwoordcorrect) {
						//counter die ik nog moet maken ==> de score staat al op ControleVraags
						System.out.println("timer stop");
						
						labelCF.setText("CORRECT");
						
						timerK.start();
						
						panel.setBackground(Color.GREEN);
						
						buttonVolgende.doClick();
						
						timer2.start();
						
						textFieldT.setText("");
						}else {
							labelCF.setText("FOUT");
							panel.setBackground(Color.RED);
							textFieldT.setText("");
							textFieldT.requestFocusInWindow();
						}
			}
		});
		
		//button voor volgende
				
				buttonVolgende.setSize(80,50);
				buttonVolgende.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						buttonSpelen.doClick();
						time = 15;
						labelCF.setText("");
						
			}
		});
	        
	        
//	        //timer.stop();
//
//		//panel begin scherm
//
//		//panel
//			JPanel panelS = new JPanel();
//			frame.add(panelS);
//									
//		//buton makkelijk
//			JButton buttonMakkelijk = new JButton("MAKKELIJK");
//			buttonMakkelijk.setSize(80,50);
//			buttonMakkelijk.addActionListener(new ActionListener() {
//				
//				@Override
//				public void actionPerformed(ActionEvent e) {
//					// TODO Auto-generated method stub
//					if (buttonMakkelijk.doClick()) {
//						//ga naar "pannel1"
//					}
//				}
//			});
//			
//			
//		//button moeilijk
//			panelS.add(buttonMakkelijk);
//		
		
		// zichtbaarheid functie (visibility function: this ensures that my coded code is displayed on the computer screen.)
		panel.add(buttonSpelen);
		panel.add(labelWL);
		panel.add(labelL);
		panel.add(labelWV);
		panel.add(labelV);
		panel.add(textFieldT);
		panel.add(buttonC);
		panel.add(labelT);
		panel.add(labelT2);
		panel.add(buttonVolgende);
		panel.add(labelS); //label voor de score
		panel.add(labelCF); //melding juist of fout
		frame.setVisible(true);
			
	}
	
	public ActionListener createTimerActonListener() {
		return new ActionListener() {
            int time = 0;
            @Override
            public void actionPerformed(ActionEvent arg0) {
                time++;
                //display time in label
                labelT.setText(time + "");
            }
	  };
	}
	public ActionListener createTimerActionListener2() {
		return new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				time--;
				
				if (time == 0) {
					buttonVolgende.doClick();
					buttonSpelen.doClick();
				}
	            //display time in label
	            labelT2.setText(time + "");
			}
		};
	}
	public ActionListener createTimerActionListenerK() {
		return new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				timer.stop();
				panel.setBackground(null);
			}
		};
	}
}
