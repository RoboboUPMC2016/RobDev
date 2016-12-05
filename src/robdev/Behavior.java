package robdev;

/**
 * Represents a robot behavior. Let's define your own behaviors implementing this interface !
 */
public interface Behavior{

    /**
     * This method is the starting point for your robot behavior. Use it like a 'main' 
     * method. 
     * @param actions : a library containing all the actions the robot can perform
     * @param events : a instance of the class {@link Event} providing useful methods to
     * manage events.
     * @see Event
     * @see Action
     */
    public void run(Action actions,Event events);

}