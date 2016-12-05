package robdev;

/** 
 * An instance of the class {@link Action} provides useful methods to 
 * animate or actionate amazing robot behaviors.
 */
public interface Action {

	/**
	 * Keeps the robot waiting for a while
	 * @param seconds : the number of seconds to wait
	 */
	public void wait(int seconds);

	/**
	 * Keeps the robot waiting for a while
	 * @param event : an event to wait to resume the behavior
	 */
	public void wait(Event event);

	/**
	 * Moves the robot forward
	 * @param seconds : the number of seconds to move
	 */
	public void moveForward(int seconds);

	/**
	 * Moves the robot forward
	 * @param event : an event to wait to go on the next step
	 */
	public void moveForward(Event event);

	/**
	 * Moves the robot backward
	 * @param seconds : the number of seconds to move
	 */
	public void moveBackward(int seconds);

	/**
	 * Moves the robot backward
	 * @param event : an event to wait to go on the next step
	 */
	public void moveBackward(Event event);

	/**
	 * Turns the robot for 90 degrees to the right
	 */
	public void turnRight();

	/**
	 * Turns the robot for 90 degrees to the left
	 */
	public void turnLeft();

	/**
	 * Stops instantly the robot behavior
	 */
	public void stop();
	
	public void when(Event event, Runnable function);

}
