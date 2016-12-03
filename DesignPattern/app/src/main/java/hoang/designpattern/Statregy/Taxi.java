package hoang.designpattern.Statregy;

/**
 * Created by Administrator on 11/30/2016.
 */

public class Taxi extends Vehicle {
    public Taxi()
    {
        setGoAlgorithm(new GoByDriving());
    }
}
