package robdev.examples;

import robdev.*;

public class RoundTripBehavior implements Behavior {

	public static final int ROUND_TRIP_NUMBER = 5;
	
	public void run(Action action,Event event) {
		
		int i = 0;
		
		while(true){
			
			//The robot moves forward during 3 seconds,
			action.moveForward(3);
			
			// it performs a U-turn,
			action.turnRight();
			action.turnRight();
			
			// and comes back to its starting point !
			action.moveForward(3);
			
			if(i++ >= ROUND_TRIP_NUMBER)
				action.stop();
			
			// Let's start again !
				
		}
	}

}
