package hoang.designpattern.Visitor;

/**
 * Created by Administrator on 12/1/2016.
 */

public class WifeGod implements Visitor {
    @Override
    public void getDame(Alien alien) {
        System.out.print("Alien dame to wife of god : 30 \n");
    }

    @Override
    public void getDame(MetaHumen metaHumen) {
        System.out.print("MetaHumen dame to wife of god : 40 \n");
    }

    @Override
    public void getDame(InHuman inHuman) {
        System.out.print("InHuman dame to wife of god : 40 \n");
    }

    @Override
    public void getDame(Flash flash) {
        System.out.print("Flash dame to wife of god : 10 \n");
    }

    @Override
    public void getDame(Superman superman) {
        System.out.print("Superman dame to wife of god : 50 \n");
    }

    @Override
    public void getDame(God god) {
        System.out.print("God dame to wife of god : 10000000000 \n");
    }
}
