package hoang.designpattern.Visitor;

/**
 * Created by Administrator on 12/1/2016.
 */

public class MetaHumen implements Human {

    @Override
    public void hit(Visitor visitor) {
        visitor.getDame(this);
    }
}
