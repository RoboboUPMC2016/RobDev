package robdev;


public interface Behavior extends Runnable{

    /**
     * Define your behavior in this method
     * @param moveRobobo
     */
    public void run(Actions moveRobobo);

}