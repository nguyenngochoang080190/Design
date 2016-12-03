package hoang.designpattern.Template;

/**
 * Created by Administrator on 12/1/2016.
 */

public interface RobotBuilder {
    public void addStart();
    public void addWork();
    public void addStop();
    public RobotBuildable getRobotBuildable();
}
