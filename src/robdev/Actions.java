package robdev;

public interface Actions {
    
    /**
     * The robot stops his activities
     */
    public void stop();

    /**
     * The robot moves forward for the time in parameter
     * @param nbSeconds
     */
    public void moveForward(int nbSeconds);

    /**
     * The robot moves backward nb seconds
     * @param nbSeconds
     */
    public void moveBackward(int nbSeconds);
 
    /**
     * The robot turns 90 degrees to the right
     */
    public void turnRight();

    /**
     * The robot turns 90 degrees to the left
     */
    public void turnLeft();

}
