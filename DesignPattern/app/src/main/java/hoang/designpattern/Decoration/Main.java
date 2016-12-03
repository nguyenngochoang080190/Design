package hoang.designpattern.Decoration;

/**
 * Created by Administrator on 11/30/2016.
 */

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer = new ComputerWithDisk(computer);
        computer = new ComputerWithMoniter(computer);
        computer = new ComputerWithDisk(computer);
        computer = new ComputerWithMoniter(computer);
        computer = new ComputerWithDisk(computer);
        computer = new ComputerWithMoniter(computer);
        System.out.print(computer.des());
    }
}
