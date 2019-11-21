package array;

public class RasterVanArraysArray5 {
	
	public static void main(String[] args) {
		RasterVanArraysArray5 array = new RasterVanArraysArray5();
		array.raster();
	}
	
	public void raster() {
		int[][] matrix = new int[3][2];
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}