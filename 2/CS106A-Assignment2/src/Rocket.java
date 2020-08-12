// TODO: comment this program

import acm.program.*;

public class Rocket extends ConsoleProgram {
	
	private static final int SIZE = 10;
	
	public void run() {
		// TODO: finish this program
		
		buildRocket(SIZE);
	}
	
	private void buildRocket(int size) {
		buildRocketEnd(size);
		buildDivider(size);
		buildRocketBody(size);
		buildDivider(size);
		buildRocketEnd(size);
	}
	
	private void buildRocketEnd(int size) {
		for (int i = 1; i < size+1; i++) {
			for (int j = size+1; j > i; j--) {
				print(" ");
			}
			for (int r = i; r > 0; r--) {
				print("/");
			}
			for (int q = i; q > 0; q--) {
				print("\\");
			}
			println("");
		}
	}
	
	private void buildDivider(int size) {
		print("+");
		for (int i = 1; i < size*2+1; i++) {
			print("=");
		}
		println("+");
	}
	
	
	private void buildRocketBody(int size) {
		// Rocket Body Upper Half
		for (int i = 1; i < size+1; i++) {
			print("|");
			for (int j = size; j > i; j--) {
				print(".");
			}
			for (int r = i*2; r > 0; r--) {
				if (r%2 == 0) {
					print("/");
				} else {
					print("\\");
				}
			}
			for (int j = size; j > i; j--) {
				print(".");
			}
			print("|");
			println("");
		}
		
		// Rocket Body Below Half
		for (int i = 1; i < size+1; i++) {
			print("|");
			for (int j = 1; j < i; j++) {
				print(".");
			}
			for (int r = 2*(size - i + 1); r > 0; r--) {
				if (r%2 == 1) {
					print("/");
				} else {
					print("\\");
				}
			}
			for (int j = 1; j < i; j++) {
				print(".");
			}
			print("|");
			println("");
		}
		
	}
	
}
