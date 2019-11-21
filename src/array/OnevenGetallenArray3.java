package array;

public class OnevenGetallenArray3 {
	
	public static void main(String[]args) 
	{
		OnevenGetallenArray3 array = new OnevenGetallenArray3();
		array.bewerking();
	}
	
	public void bewerking()
	{
		int[] getal = new int[100];
		for (int i = 0; i < getal.length; i++) 
		{
			getal[i] = i + 1;
		}
		
		for (int i = 0; i < getal.length; i++) 
		{
			if((getal[i] % 2) != 0) 
			{
				System.out.println(getal[i]);
			}
		}
	}
}
