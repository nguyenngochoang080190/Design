package hoang.designpattern.Visitor;

/**
 * Created by Administrator on 11/30/2016.
 */

public class Main {
    public static void main(String[] args) {
        God myGod=new God();
        Visitor wifeOfDod=new WifeGod();
        myGod.hit(wifeOfDod);

        Human meta=new MetaHumen();
        meta.hit(wifeOfDod);
    }
}
