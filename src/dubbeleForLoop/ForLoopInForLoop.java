package dubbeleForLoop;

public class ForLoopInForLoop {
	
	public static void main(String[] args) {
		ForLoopInForLoop forLoop = new ForLoopInForLoop();
		forLoop.doubleloop();
	}

	private void doubleloop() {
		
		for (int i = 0; i < 4; i++) {
			for (int j = 1; j < 7; j++) {
				System.out.print(j);
				if (j < 6) {
					System.out.print(", ");
				}
			}
			System.out.println();
		}
	}
}
