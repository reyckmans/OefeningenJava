package staticModify;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;



public class FileInputPlanet {
	
	public static void main(String[] args) {
		File myfile = new File("D:\\School\\School 2019-2020\\OOP\\Oefeningen\\OefeningenJava\\OefeningenJava\\src\\staticModify\\planets.csv");
		try {
			Scanner myscanner = new Scanner(myfile);
			
			while (myscanner.hasNext()) {
				System.out.println(myscanner.nextLine());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
