/*
 * File: CheckerboardKarel.java
 * ----------------------------
 * When you finish writing it, the CheckerboardKarel class should draw
 * a checkerboard using beepers, as described in Assignment 1.  You
 * should make sure that your program works for all of the sample
 * worlds supplied in the starter folder.
 */

/*
 * Pseudocode
 * 
 * 1. Put beeper at (1, 1)
 * 2. While ceilin is clear
 * 4. Build row then move up one block
 * 5. If beeper is present, move up and turn
 * 6. Build new row
 * 
*/

import stanford.karel.*;

public class CheckerboardKarel extends SuperKarel {

	// You fill in this part
	public void run() {
		
		putBeeper();
		
		while (leftIsClear()) {
			buildRow();
			moveUp();
		}		
		
		if (beepersPresent()) {
			buildRow();
		}
	}
	
	
	private void buildRow() {
		
		while (frontIsClear()) {
			
			if (noBeepersPresent()) {
				move();
				putBeeperNext();
				
			} else {
				move();
				putBeeperAfterSpace();
				
			}
		}
	}
	
	private void putBeeperNext() {
		if (frontIsClear()) {
			putBeeper();
			move();
		}
	}
	
	private void putBeeperAfterSpace() {
		if (frontIsClear()) {
			move();
			putBeeper();
		}
	}
	
	
	private void moveUp() {
		
		if (facingEast()) {
			turnLeft();
			moveOneStepUp();
			turnLeft();
			
		} else if(facingWest()) {
			turnRight();
			moveOneStepUp();
			turnRight();
		}
	}
	
	private void moveOneStepUp() {
		if (frontIsClear()) {
			if (beepersPresent()) {
				move();
			} else {
				move();
				putBeeper();
			}
		}
		
	}

}
