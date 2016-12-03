package hoang.designpattern.Observer;

import java.util.ArrayList;

/**
 * Created by Administrator on 12/1/2016.
 */

public class GiamDoc implements GD {
    ArrayList<UpdateMassage> massages;

    public GiamDoc() {
        massages = new ArrayList<>();
    }

    @Override
    public void add(UpdateMassage u) {
        massages.add(u);
    }

    @Override
    public void delete(UpdateMassage u) {
        massages.remove(u);
    }

    @Override
    public void notification() {
            for(int i=0;i<massages.size();++i)
            {
                massages.get(i).update();
            }
    }
}
