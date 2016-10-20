import robdev.*

public class RoundTripBehavior implements Behavior {

	public static final int ROUND_TRIP_NUMBER = 5;
	
	public void run(Actions actions) {
		
		int i = 0;
		
		while(true){
			
			//The robot moves forward during 3 seconds,
			actions.moveForward(3);
			
			// it performs a U-turn,
			actions.turnRight();
			actions.turnRight();
			
			// and comes back to its starting point !
			actions.moveForward(3);
			
			if(i++ >= ROUND_TRIP_NUMBER)
				actions.stop();
			
			// Let's start again !
				
		}
	}

}
