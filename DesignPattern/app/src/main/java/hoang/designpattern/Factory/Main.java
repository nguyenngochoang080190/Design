package hoang.designpattern.Factory;

/**
 * Created by Administrator on 11/30/2016.
 */

public class Main {
    public static void main(String[] args) {
        SecurityFacory securityFacory=new SecurityFacory();
        MyConnect myConnect=securityFacory.getConnect("Oracle");
        myConnect.work();

    }
}
