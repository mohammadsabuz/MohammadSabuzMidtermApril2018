package databases;
import org.testng.Assert;

public class UnitTestConnectDB {
    public static void main(String[] args) throws Exception {
        ConnectDB connectDB = new ConnectDB();

        Assert.assertEquals(connectDB.readDataBase("table1","employee"),connectDB.readDataBase("table1","employee"));
    }
}