package hoang.designpattern.Statregy;

/**
 * Created by Administrator on 11/30/2016.
 */

public class Main {
    public static void main(String[] args) {
        Vehicle taxi = new Taxi();
        Vehicle plane = new Plane();
        taxi.go();
        plane.go();
        Vehicle superPlane=new Plane();
        superPlane.setGoAlgorithm(new GoByDriving());
        superPlane.go();
        superPlane.setGoAlgorithm(new GoByFly());
        superPlane.go();
        superPlane.setGoAlgorithm(new GoByFast());
        superPlane.go();

    }
}
