package robdev;

public interface Actions {
    
	/**
	 * To keep the robot waiting 
	 * @param seconds
	 */
    public void wait(int seconds);
    
    /**
     * To keep the robot waiting
     * @param event : the event 
     */
    public void wait(Event event);

    /**
     * To move the robot forward
     * @param seconds
     */
    public void moveForward(int seconds);
    
    /**
     * To move the robot forward
     * @param event
     */
    public void moveForward(Event event);

    /**
     * To move the robot backward
     * @param seconds
     */
    public void moveBackward(int seconds);
    
    /**
     * To move the robot backward
     * @param event
     */
    public void moveBackward(Event event);
 
    /**
     * To turn the robot 90 degrees to the right
     */
    public void turnRight();

    /**
     * To turn the robot 90 degrees to the left
     */
    public void turnLeft();

}
