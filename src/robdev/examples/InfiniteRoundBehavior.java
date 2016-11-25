package robdev.examples;

import robdev.*;

public class InfiniteRoundBehavior implements Behavior{

	public void run(Actions actions) {

		do{

			// The robot will moves forward until a shock is detected,
			actions.moveForward(Events.SHOCK_DETECTED);

			// then it performs the opposite way
			actions.moveBackward(Events.SHOCK_DETECTED);

		}while(true); // and starts again for the rest of its life !

	}
}