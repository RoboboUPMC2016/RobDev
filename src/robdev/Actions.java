package robdev;

/** 
 * An instance of the class {@link Actions} provides useful methods to 
 * create amazing robot behaviors.
 */
public interface Actions {

	/**
	 * Keeps the robot waiting for a while.
	 * @param seconds : the number of seconds to wait
	 */
	public void wait(int seconds);

	/**
	 * Keeps the robot waiting for a while.
	 * @param event : an event to wait to resume the behavior
	 */
	public void wait(Event event);

	/**
	 * Moves the robot forward.
	 * @param seconds : the number of seconds to move
	 */
	public void moveForward(int seconds);

	/**
	 * Moves the robot forward.
	 * @param event : an event to wait to go on the next step
	 */
	public void moveForward(Event event);

	/**
	 * Moves the robot backward.
	 * @param seconds : the number of seconds to move
	 */
	public void moveBackward(int seconds);

	/**
	 * Moves the robot backward.
	 * @param event : an event to wait to go on the next step
	 */
	public void moveBackward(Event event);

	/**
	 * Turns the robot for 90 degrees to the right.
	 */
	public void turnRight();

	/**
	 * Turns the robot for 90 degrees to the left.
	 */
	public void turnLeft();

	/**
	 * Stops instantly the robot's behavior. 
	 */
	public void stop();

	/**
	 * Changes the emotion displayed upon the robot's face. 
	 * The robot will keep the emotion until another call of this method.
	 * @param emotion : the emotion to display
	 * @see Emotion
	 */
	public void setEmotion(Emotion emotion);
	
	/**
	 * Makes the robot talking. 
	 * @param text : the text to be recited; for example: "Hello guys! I'm a talking robot!"
	 */
	public void speak(String text);
	
	/**
	 * <p>Associates a function with an event. 
	 * <p>From a call of this method, when the event is detected, the associated function is fully 
	 * and independently executed then the behavior resume normally.
	 * <p>A "when" instruction is overridden by another one using the same event. Thus you can invalidate a
	 * previous "when" using something like
	 * <p>
	 * <code>actions.when(event,null)</code>
	 * @param event : the event to which the function must be called
	 * @param function : a {@link Runnable} to be called when the event occurs. 
	 */
	public void when(Event event, Runnable function);
	
}
