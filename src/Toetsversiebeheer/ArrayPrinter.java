package Toetsversiebeheer;

public class ArrayPrinter {
	
	
	public static void main(String[]args) {
		ArrayPrinter array = new ArrayPrinter();
		int[] a = {4,5,5,6,8};
		array.printarray(a);
	}
	
	public void printarray(int[] a){
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
			}
	}

}
