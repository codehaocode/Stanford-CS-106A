// TODO: comment this program

import acm.program.*;

public class Hailstone extends ConsoleProgram {
	public void run() {
		// TODO: finish this program
		println("This program computes Hailstone sequences.");
		
		int num = readInt("Enter a number: ");
		
		computeHailstone(num);
		
	}
	
	private void computeHailstone(int n) {
		
		int steps = 0;
		
		while (true) {
			if (n == 1) {
				break;
			} else if ((n % 2 == 1)) {
				int m = 3 * n + 1;
				println(n + " is odd, so I make 3n  + 1: " + m);
				n = m;
			} else {
				int m = n / 2;
				println(n + " is even, so I take half: " + m);
				n = m;
			}
			
		steps++;
		}
		println("It took " + steps + " steps to reach 1.");
		if (readBoolean("Run again?(y/n) ", "y", "n")) {
			int num = readInt("Enter a number: ");	
			computeHailstone(num);
		}
	}
}
