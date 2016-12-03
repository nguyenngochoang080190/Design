package hoang.designpattern.Statregy;

/**
 * Created by Administrator on 11/30/2016.
 */

public class Plane extends Vehicle {
    public Plane()
    {
        setGoAlgorithm(new GoByFly());
    }
}
