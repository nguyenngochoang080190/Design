package hoang.designpattern.Factory;

/**
 * Created by Administrator on 11/30/2016.
 */

public class MySqlConnect extends MyConnect {
    @Override
    public void work() {
        System.out.print("MySql connect,");
    }
}
