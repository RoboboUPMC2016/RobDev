package robdev.examples;

import robdev.*;

public class InfiniteRoundBehavior implements Behavior{

	@Override
	public void run(Action action, Event event) {

		do{

			// The robot will moves forward until a shock is detected,
			action.moveForward(Event.SHOCK_DETECTED);

			// then it performs the opposite way
			action.moveBackward(Event.SHOCK_DETECTED);

		}while(true); // and starts again for the rest of its life !

	}
}