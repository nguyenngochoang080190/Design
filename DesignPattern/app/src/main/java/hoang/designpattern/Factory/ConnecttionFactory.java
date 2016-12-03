package hoang.designpattern.Factory;

/**
 * Created by Administrator on 11/30/2016.
 */

public abstract class ConnecttionFactory {
    public ConnecttionFactory(){}
    protected abstract MyConnect getConnect(String type);
}
