package robdev.examples;

import robdev.Actions;
import robdev.Behavior;
import robdev.Emotion;
import robdev.Event;

public class AngryRobotBehavior implements Behavior {

	@Override
	public void run(Actions actions) {
		
		actions.setEmotion(Emotion.Angry);
		
		actions.when(Event.SHOCK_DETECTED, () -> {
			actions.setEmotion(Emotion.Surprised);
			actions.wait(1);
			actions.setEmotion(Emotion.Angry);
			actions.speak("Leave me alone!");
		});
		
		while(true){}

	}

}
