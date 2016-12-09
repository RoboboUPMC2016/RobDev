package robdev;

/**
 * This enumeration represents all the events the robot can detect.
 */
public enum Event {
	
	/**
	 * A shock is detected, the robot has probably met an obstacle, or a foot kick ...
	 */
	SHOCK_DETECTED,
	/**
	 * Something is detected with the front IR captor
	 */
	IRFRONT,
	/**
	 * Something is detected with the back IR captor
	 */
	IRBACK
	

}
