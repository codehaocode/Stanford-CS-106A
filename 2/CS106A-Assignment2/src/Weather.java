// TODO: comment this program

import acm.program.*;

public class Weather extends ConsoleProgram {
	
	private static final int SENTINEL_VALUE = -42;

	public void run() {
		// TODO: finish this program
		println("CS 106A \"Weather Master 4000\"!");
		getWeather();
	}
	
	private void getWeather() {
				
		int temp = readInt("Next temperature (or " + SENTINEL_VALUE + " to quit): ");
		int highestTemp = temp;
		int lowestTemp = temp;
		
		int sum = 0;
		int count = 0;
		int coldDays = 0;

		while (temp != SENTINEL_VALUE) {
			
			sum += temp;
			count ++;
			
			if (temp >= highestTemp) {
				highestTemp = temp;
			}
			
			if (temp <= lowestTemp) {
				lowestTemp = temp;
			}
			
			if (temp <= 50) {
				coldDays ++;
			}
			
			temp = readInt("Next temperature (or " + SENTINEL_VALUE + " to quit): ");

		}
		
		if (count == 0) {
			
			println("No temperature were entered.");
			
		} else {
			
			double average = average(sum, count);	
			println("Highest temperature = " + highestTemp);
			println("Lowest temperature = " + lowestTemp);
			println("Average = " + average);
			println(coldDays + " cold day(s).");
		}
		
		
	}
	
	private double average (int sum, int count) {
		double s = sum;
		double c = count;
		return s/c;
	}
	
	
}
