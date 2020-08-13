import java.awt.Color;

import acm.program.*;

public class AsciiArt extends ConsoleProgram {
	public void run() {
		// TODO: finish this program
		println("CS 106A ASCII Art by Yuhao Zhong", Color.RED);
		
		for (int i = 1; i < 10; i++) {
				for (int j = 10; j > i; j--) {
					print(" ");
				}
				for (int r = i; r > 0; r--) {
					print("/", Color.CYAN);
				}
				for (int q = i; q > 0; q--) {
					print("\\", Color.GREEN);
				}
				println("");
			}
		}
	
}
