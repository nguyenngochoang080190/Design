package hoang.designpattern.Template;

import java.util.ArrayList;

/**
 * Created by Administrator on 11/30/2016.
 */

public interface RobotBuildable {
    public void go();
    public void addStart();
    public void addWork();
    public void addStop();
    public void setAction(ArrayList<Integer> i);
}
