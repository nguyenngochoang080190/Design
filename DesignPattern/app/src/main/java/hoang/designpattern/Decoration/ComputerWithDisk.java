package hoang.designpattern.Decoration;

/**
 * Created by Administrator on 11/30/2016.
 */

public class ComputerWithDisk extends ComputerExtra {
    Computer computer;
    public ComputerWithDisk(Computer c)
    {
        computer=c;
    }
    @Override
    public String des() {
        return computer.des()+" with disk";
    }
}
