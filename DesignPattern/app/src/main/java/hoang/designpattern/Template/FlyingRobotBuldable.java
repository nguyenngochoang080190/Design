package hoang.designpattern.Template;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Administrator on 11/30/2016.
 */

public class FlyingRobotBuldable implements RobotBuildable {
    ArrayList<Integer> action;
    FlyingRobotBuldable(){}
    @Override
    public void go() {
        Iterator iterator=action.iterator();
        while (iterator.hasNext())
        {
            switch ((Integer) iterator.next())
            {
                case 1:
                    addStart();
                    break;
                case 2:
                    addWork();
                    break;
                case 3:
                    addStop();
                    break;
            }
        }
    }

    @Override
    public void addStart() {
        System.out.print("Chuẩn bị bay /n");
    }

    @Override
    public void addWork() {
        System.out.print("Chạy trên đường băng /n");
    }

    @Override
    public void addStop() {
        System.out.print("Hạ cánh /n");
    }

    @Override
    public void setAction(ArrayList<Integer> i) {
        action=i;
    }
}
