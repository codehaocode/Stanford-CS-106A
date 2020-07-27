// TODO: comment this program

import acm.program.*;

public class Weather extends ConsoleProgram {
	public void run() {
		// TODO: finish this program
		println("CS 106A \"Weather Master 4000\"!");
		getWeather();
	}
	
	private void getWeather() {
		
		int highestTemp = 0;
		int lowestTemp = 0;
		
		int sum = 0;
		int count = 0;
		int coldDays = 0;

		while (true) {
			
			int temp = readInt("Next temperature (or -1 to quit): ");
			
			if (temp == -1) {
				break;
			}
			
			if (temp >= highestTemp) {
				highestTemp = temp;
			}
			
			if (temp <= lowestTemp) {
				lowestTemp = temp;
			}
			
			if (temp <= 50) {
				coldDays ++;
			}
			
			sum += temp;
			count ++;
		}
		
		double average = average(sum, count);
		
		println("Highest temperature = " + highestTemp);
		println("Lowest temperature = " + lowestTemp);
		println("Average = " + average);
		println(coldDays + " cold day(s).");
		
	}
	
	private double average (int sum, int count) {
		double s = sum;
		double c = count;
		return s/c;
	}
	
	
}
