package robdev.examples;

import robdev.Actions;
import robdev.Behavior;
import robdev.Events;

public class UnstoppableBehavior implements Behavior{

	public void run(final Actions actions) {

		// define how to handle a shock
		actions.when(Events.SHOCK_DETECTED, () -> { avoidObstacle(actions); });

		while(true)
			actions.moveForward(1);

	}

	private void avoidObstacle(Actions actions){
		actions.turnLeft();
	}

}
