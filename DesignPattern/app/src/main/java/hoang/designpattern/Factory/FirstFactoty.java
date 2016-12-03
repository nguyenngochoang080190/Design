package hoang.designpattern.Factory;

/**
 * Created by Administrator on 11/30/2016.
 */

public class FirstFactoty {
    protected String type;

    public FirstFactoty(String t) {
        type = t;
    }

    public MyConnect getConnect() {
        if (type.equals("Oracle"))
            return new OracleConnect();
        else if (type.equals("SQL Server"))
            return new SqlConnect();
        else
            return new MySqlConnect();
    }
}
