package hoang.designpattern.Template;

/**
 * Created by Administrator on 11/30/2016.
 */

public abstract class Robot {
    public Robot() {
    }

    public void go() {
        start();
        work();
        stop();
    }

    public void start() {
        System.out.print("start \n");
    }

    public void work() {
        System.out.print("working \n");
    }

    public void stop() {
        System.out.print("stopped \n");
    }
}
