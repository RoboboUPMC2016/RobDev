package robdev;


public interface Actions {
    
    /**
     * Robobo stop his activities for nb seconds
     * @param nbSeconds
     */
    public void pause(int nbSeconds);

    /**
     * Robobo move forward nb seconds
     * @param nbSeconds
     */
    public void moveForward(int nbSeconds);

    /**
     * Robobo move backward nb seconds
     * @param nbSeconds
     */
    public void moveBackward(int nbSeconds);
 
    /**
     * Robobo turn 90 degrees to the right
     */
    public void turnRight();

    /**
     * Robo turn 90 degrees to the left
     */
    public void turnLeft();

}