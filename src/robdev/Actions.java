package robdev;

public interface Actions {
    
    /**
     * The robot stop his activities
     */
    public void pause();

    /**
     * The robot move forward nb seconds
     * @param nbSeconds
     */
    public void moveForward(int nbSeconds);

    /**
     * The robot move backward nb seconds
     * @param nbSeconds
     */
    public void moveBackward(int nbSeconds);
 
    /**
     * The robot turn 90 degrees to the right
     */
    public void turnRight();

    /**
     * The robot turn 90 degrees to the left
     */
    public void turnLeft();

}
