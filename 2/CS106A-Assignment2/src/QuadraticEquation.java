// TODO: comment this program

import acm.program.*;

public class QuadraticEquation extends ConsoleProgram {
	public void run() {
		// TODO: finish this program
		println("CS 106A Quadratic Solver!");
		double a = readDouble("Enter a: ");
		double b = readDouble("Enter b: ");
		double c = readDouble("Enter c: ");
		calculateQuadratic(a, b, c);
		
	}
	
	private void calculateQuadratic(double a, double b, double c) {
		double y = b * b - 4 * a * c;
		
		if (y < 0) {
			println("No real roots");
		} else if (y == 0) {
			double result = (- b) / (2 * a);
			println("One root: " + result);
		} else {
			double sqrt = Math.sqrt(y);
			double r1 = ((-b) + sqrt) / (2 * a);
			double r2 = ((-b) - sqrt) / (2 * a);
			println("Two roots: " + r1 + " and " + r2);
		}
		
		
	}
}
