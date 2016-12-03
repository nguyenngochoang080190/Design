package hoang.designpattern.Observer;

/**
 * Created by Administrator on 11/30/2016.
 */

public class Main {
    public static void main(String[] args) {
        GiamDoc hoang=new GiamDoc();
        hoang.add(new NhanVien());
        hoang.add(new TruongPhong());
        hoang.notification();
    }
}
