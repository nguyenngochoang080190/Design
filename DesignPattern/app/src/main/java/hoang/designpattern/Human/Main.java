package hoang.designpattern.Human;

/**
 * Created by Administrator on 11/30/2016.
 */

public class Main {
    public static void main(String[] args) {
        Person a = new Person();
        a.setName("Hoang");
        a = new PersonWithFace(a);
        a = new PersonWithArm(a);
        System.out.print(a.des());
    }
}
