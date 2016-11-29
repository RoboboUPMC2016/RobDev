package robdev;

/**
 * Represents a robot behavior. Let's define your own behaviors implementing this interface !
 */
public interface Behavior{

    /**
     * This method is the starting point for your robot behavior. Use it like a 'main' 
     * method. 
     * @param actions : a library containing all the actions the robot can perform
     */
    public void run(Actions actions);

}