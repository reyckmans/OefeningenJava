package toetsForLoops07112019Robbe;

public class Oef1matrix {
	
		public static void main(String[] args) {
			Oef1matrix array = new Oef1matrix();
			array.matrix();
		}
		
		public void matrix() {
			int[][] tabel = new int [10][15];
			
			for (int i = 0; i < tabel.length; i++) {
				for (int j = 0; j < tabel[i].length; j++) {
					tabel[i][j] = (i+1)*(j+1);
				}
			}
			
			for (int i = 0; i < tabel.length; i++) {
				for (int j = 0; j < tabel[i].length; j++) {
					System.out.print(tabel[i][j] + " ");
				}
				System.out.println();
			}
		}
}
