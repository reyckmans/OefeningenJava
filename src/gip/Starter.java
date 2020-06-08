package gip;

/**
*@author Robbe Eyckmans
*
* This is my Strarter class, this is the basis of my game.
* This class contains all the codes you need for the appearance of the game such as the octagon where all buttons are located or the buttons themselves.
* In this class, all functions are also placed under the headings.
*
* PLAY BUTTON
* When you press the play button, a randomly selected question and letter will appear on the screen and there will be the option to press the check button.
* The cursor will automatically be placed in the text box for easy typing.
* Two timers will also start to count. One that keeps track of how long you have been doing throughout the game and one that counts down the number of seconds you get for answering that one question.
*
* CHECK BUTTON
* If you use this button, the program will check your question whether you have answered the question correctly or not.
* If you answer incorrectly, the screen will light up red and you will be notified that you have answered the question incorrectly. You can keep trying to solve the question as long as you have time. when the time is up, the game will automatically move to the next question.
* If the answer is correct, the screen will light up green. The game will automatically advance to the next question.
* The following thing I want to do is to see how many points you have. With every correct answer you get a point.
* I also want to make sure that if you press the check button while you have not entered anything, you will receive an error message that you have not entered anything yet.
*
* NEXT BUTTON
* The following button is made for if you don't know the answer to a question. You can press this button which will do the following: the time will be reset to 15 seconds and you will get a new question with a new letter. Meaning the question you didn�t know the answer to, gets skipped. The cursor will also point back to the text box for easy typing.
*
* LABELS AND TIMERS
* Outside of the buttons you will also see many JLabels and Timers coming back. These are also defined here.
* A JLabel is actually a name card that you can put anywhere in your background (also called Panel). These are usually used to provide additional information or to print the letters or questions in the same way as in my game.
* The Timers are self-explanatory, these are the elements of the timer here you can put a "function" (also called a method) that counts down how many seconds you have or how long you are working on something.
* 
* It is important to know that the classes RandomL and classes RandomV are linked under the button "Speel" that is created and listed in this class.
*/



import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
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




public class Starter {
	//panel
		JPanel panel = new JPanel();
		
	// standard background
		private Color panelColor;
		
	// button next
	JButton buttonVolgende = new JButton("Volgende");
	//button speel
	JButton buttonSpelen = new JButton("speel");
	
	//background
	ImageIcon background = new ImageIcon("achtergrond.jpg"); 
	
	//counter van timer 2 (dit is de defintie van mijn timer en hoeveel seconden hij heeft
	int time = 15;
	
	//labelTime
	JLabel labelT = new JLabel();
	
	//labelTime2
	JLabel labelT2 = new JLabel();
	
	// timer 1
	  Timer timer = new Timer(1000, createTimerActonListener());
	  
	// timer 2 for question
	  Timer timer2 = new Timer(1000, createTimerActionListener2());
	  
	// timer for return to original color
	  Timer timerK = new Timer(500, createTimerActionListenerK());
	  
	// label for correct or wrong
		JLabel labelCF = new JLabel();
		ConectiesMetDB connectiesMetDB= new ConectiesMetDB();
	final RandomV rndV = new RandomV(connectiesMetDB);
	ControleVraag controle = new ControleVraag(connectiesMetDB);
	
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
				
		
		//label for letter
				JLabel labelL = new JLabel();
				labelL.setSize(40, 20); //ik weet niet of dit werk?
		
		// label for the word letter
				JLabel labelWL = new JLabel("Letter :");
				labelWL.setSize(40, 20);
		
		// label for questions
				JLabel labelV = new JLabel();
				labelV.setSize(80,100);
				
		// label for word question
				JLabel labelWV = new JLabel("Vraag :");
				labelWV.setSize(40, 20); 
				
		// text box
				JTextField textFieldT = new JTextField(20);
				String text = textFieldT.getText();
				
		// label for the scoring
				JLabel labelS = new JLabel(controle.score + "/15");
				labelS.setSize(40, 20);
				
		// play buton
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
		
		// button for check
				JButton buttonC = new JButton("controleer");
				buttonC.setSize(80,50);
				buttonC.addActionListener(new ActionListener() {
			
					@Override
					public void actionPerformed(ActionEvent e) {
						boolean antwoordcorrect = controle.checkAntwoord(textFieldT.getText(),labelL.getText());
						if (antwoordcorrect) {
						// counter that I have yet to make ==> the score is already on ControleVraags
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
		
		// button for next
				
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
		
		// visibility function: this ensures that my coded code is displayed on the computer screen.
				
				panel.setLayout(new GridLayout(0,2));
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
		frame.add(panel);
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
