package hoang.designpattern.Visitor;

/**
 * Created by Administrator on 12/1/2016.
 */

public interface Visitor {
    public void getDame(Alien alien);
    public void getDame(MetaHumen metaHumen);
    public void getDame(InHuman inHuman);
    public void getDame(Flash flash);
    public void getDame(Superman superman);
    public void getDame(God god);
}
