package hoang.designpattern.Template;

/**
 * Created by Administrator on 11/30/2016.
 */

public class Main {
    public static void main(String[] args) {
        Person a = new Person();
        a.setName("Hoang");
        a=new Face(a);
        a=new Amr(a);

        System.out.print(a.des());

    }
}
