package robdev.examples;

import robdev.*;

public class SquareTripBehavior implements Behavior {

	public static final int ROUND_TRIP_NUMBER = 5;

	public void run(Action actions,Event event) {

		int i = 0;

		while(true){

			for(int j=0;j<4;j++){
				actions.moveForward(1);
				actions.turnLeft();
			}

			if(i++ >= ROUND_TRIP_NUMBER)
				actions.stop();
		}
	}

}