package robdev;

/**
 * Represents a robot behavior. Let's define your own behaviors implementing this interface !
 */
public interface Behavior{

    /**
     * @param actions : a library containing all the actions the robot can perform
     * @see Event
     */
    public void run(Actions actions);

}