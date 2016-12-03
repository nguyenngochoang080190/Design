package hoang.designpattern.Statregy;

/**
 * Created by Administrator on 11/30/2016.
 */

public abstract class Vehicle {
    private GoAlgorithm goAlgorithm;
    public Vehicle(){}
    public void setGoAlgorithm(GoAlgorithm goAlgorithm)
    {
        this.goAlgorithm=goAlgorithm;
    }
    public void go()
    {
        goAlgorithm.go();
    }
}
