package robdev;

/**
 * This enumeration represents all the events the robot can detect.
 */
public interface Event {
	
	/**
	 * A shock is detected, the robot has probably met an obstacle, or a foot kick ...
	 */
	public int SHOCK_DETECTED = 0;
	
	/**
	 * Allows to define a specific behavior to execute if an event is detected
	 * @param event: 
	 * @param function:
	 * @return an id allowing to cancel the listener
	 */
	public int when(int event, Runnable function);
	
	public void stop(int listener);

}
