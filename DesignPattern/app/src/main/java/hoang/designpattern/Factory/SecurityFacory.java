package hoang.designpattern.Factory;

/**
 * Created by Administrator on 11/30/2016.
 */

public class SecurityFacory extends ConnecttionFactory {
    @Override
    protected MyConnect getConnect(String type) {
        if (type.equals("Oracle"))
            return new OracleConnect();
        else if (type.equals("SQL Server"))
            return new SqlConnect();
        else
            return new MySqlConnect();

    }
}
