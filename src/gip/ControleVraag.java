package gip;

/**
*
* In these classes we check whether you give the correct answer to the question.
* This code can be found underneath the button “Check”
*
* On line 33 a reference is made to the classes "ConectionsMetDB" this so that all the necessary information from the Database can be used.
* On line 35 one speaks of a Boolean which is a kind of method where one can only answer with right and/ or wrong.
* Furthermore you will see If / Else that speaks for itself. this means if ... then ..., this is widely used in programming.
* In the If you will see (System.out.println ("correct")) this is the message you will get if it is correct.
* In the Else you will only see the error message again if the answer is wrong.
* You will see "Return False" on line ..., this is a return stemming which should always happen when using a Boolean.
* Finally, on line 51 a method "controle" is made, this is essential for easy coding. Everything is referenced here, otherwise the program doesn't know what to do.
*
* nice to know:
* 	"int score = 0;" means that the score must start counting from 0. On line 38 you can also see (Score ++) this has the function that ensures that the score always increases by 1 if the answer is correct.
* 	At the top of the code you will also see "Inport".  Inports are methods that alrrady exist within the program. You should not have to make these again/ make these yourself. For the program knows exactly what is meant with this and what they have to do.
*/


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ControleVraag {

	int score = 0;
	
	ConectiesMetDB connectiesMetDB;
	
	public ControleVraag(ConectiesMetDB connectiesMetDB) {
		this.connectiesMetDB = connectiesMetDB;
	}
	
	public boolean checkAntwoord(String antwoord,String letter) {
		if (antwoord.toLowerCase().toCharArray()[0]== letter.toLowerCase().toCharArray()[0]) {
				if (connectiesMetDB.retrieveFromDB(antwoord)) {
					score++;
					System.out.println("juist");
					return true;
				}
				else {
					System.out.println("fout");
					return false;
				}
			}
		return false;
	}
	
	public static void main(String[] args) {
		ControleVraag controle = new ControleVraag();
		System.out.println(controle.checkAntwoord("mazda", "m"));
	}
}
