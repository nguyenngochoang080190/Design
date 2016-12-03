package hoang.designpattern.Visitor;

/**
 * Created by Administrator on 12/1/2016.
 */

public class God implements Human {
    Alien alien;
    Superman superman;
    @Override
    public void hit(Visitor visitor) {
        visitor.getDame(this);
        visitor.getDame(alien);
        visitor.getDame(superman);

    }
}
