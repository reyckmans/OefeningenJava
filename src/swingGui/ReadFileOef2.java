package swingGui;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ReadFileOef2 {

	File planets = new File("D:\\School\\School 2019-2020\\OOP\\Oefeningen\\OefeningenJava\\OefeningenJava\\src\\staticModify\\planets.csv");
	public String read() {
			try {
				Scanner scanner = new Scanner(planets);
				String resultaat = "";
				while (scanner.hasNext()) {
					String input = scanner.nextLine();
					if (resultaat == "") {
						resultaat = input;
					}else {
						resultaat = resultaat + "\n" + input;
					}
				}
				return resultaat;
			} catch (FileNotFoundException e) {
				System.out.println("sorry, je bestant is niet gevonden");
				e.printStackTrace();
			}
		return "error reading file";	
	}
	
	public void writeToFile(String text) {
		try (FileWriter writer = new FileWriter(planets)) {
			writer.write(text + "\n");
			System.out.println("Game saved");
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, e);
		}
		System.out.println("we slaan het bestand op");
	}
}
