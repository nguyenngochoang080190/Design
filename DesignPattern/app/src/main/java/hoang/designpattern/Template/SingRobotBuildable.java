package hoang.designpattern.Template;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Administrator on 11/30/2016.
 */

public class SingRobotBuildable implements RobotBuildable {
    ArrayList<Integer> action;
    public SingRobotBuildable()
    {
        action=new ArrayList<>();
    }
    public void setAction(ArrayList<Integer> ac)
    {
        action=ac;
    }
    @Override
    public final void go() {
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
        System.out.print("Chuẩn bị giọng \n");
    }

    @Override
    public void addWork() {
        System.out.print("Đang hát \n");
    }

    @Override
    public void addStop() {
        System.out.print("Đã hát xong \n");
    }
}
