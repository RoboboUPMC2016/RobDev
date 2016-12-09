package robdev.examples;

import robdev.*;

public class UnstoppableBehavior implements Behavior{

	public void run(final Actions action) {

		// define how to handle a shock
		action.when(Event.SHOCK_DETECTED, () -> { avoidObstacle(action); });

		while(true)
			action.moveForward(1);

	}

	private void avoidObstacle(Actions action){
		action.turnLeft();
	}

}