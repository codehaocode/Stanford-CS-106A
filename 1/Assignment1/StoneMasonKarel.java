/*
 * File: StoneMasonKarel.java
 * --------------------------
 * The StoneMasonKarel subclass as it appears here does nothing.
 * When you finish writing it, it should solve the "repair the quad"
 * problem from Assignment 1.  In addition to editing the program,
 * you should be sure to edit this comment so that it no longer
 * indicates that the program does nothing.
 */

/*
 * 
 * Pseudocode
 * While front is clear
 * Fix column
 * Move to next column
 * Fix column
 * 
*/


import stanford.karel.*;

public class StoneMasonKarel extends SuperKarel {

	// You fill in this part
	public void run() {
		while(frontIsClear()) {
			fixColumn();
			moveFourTimes();
		}	
		fixColumn();

	}
	
	private void fixColumn() {
		turnLeft();

		fillBeeper();
		while(frontIsClear()) {
			move();
			fillBeeper();
		}
		fillBeeper();
		backToBottom();

	}
	
	private void fillBeeper() {
		if (noBeepersPresent()) {
			putBeeper();
			}
	}
	
	private void backToBottom() {
		turnAround();
		while (frontIsClear()) {
			move();
		}
		turnLeft();
	}
	
	private void moveFourTimes() {
		for(int i = 0; i < 4; i++) {
			move();
		}
	}

}
