package robdev.examples;

import robdev.*;

public class UnstoppableBehavior implements Behavior{

	public void run(final Action action,final Event event) {

		// define how to handle a shock
		event.when(Event.SHOCK_DETECTED, () -> { avoidObstacle(action); });

		while(true)
			action.moveForward(1);

	}

	private void avoidObstacle(Actions action){
		action.turnLeft();
	}

}
