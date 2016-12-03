package hoang.designpattern.Template;

import java.util.ArrayList;

/**
 * Created by Administrator on 11/30/2016.
 */

public class SingingRobotBulider implements RobotBuilder {
    ArrayList<Integer> action;
    SingRobotBuildable robot;
    public SingingRobotBulider() {
        action = new ArrayList<>();
        robot=new SingRobotBuildable();
    }

    @Override
    public void addStart() {
        action.add(1);
    }

    @Override
    public void addWork() {
        action.add(2);
    }

    @Override
    public void addStop() {
        action.add(3);
    }

    @Override
    public RobotBuildable getRobotBuildable() {
        robot.setAction(action);
        return robot;
    }
}
