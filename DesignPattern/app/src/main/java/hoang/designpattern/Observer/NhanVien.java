package hoang.designpattern.Observer;

/**
 * Created by Administrator on 12/1/2016.
 */

public class NhanVien implements UpdateMassage {
    @Override
    public void update() {
        System.out.print("nhan vien nhan thong bao \n");
    }
}
