package hoang.designpattern.Statregy;

/**
 * Created by Administrator on 11/30/2016.
 */

public class GoByFly implements GoAlgorithm {
    @Override
    public void go() {
        System.out.print("\nI am flying");
    }
}
