//first step
import java.sql.*;

public class demoJava {
    public static void main(String[] args) throws Exception{

        /*
            ****seven steps to connect to JDBC****
            Import packages
            Load Drivers
            Register Driver
            Create Connection
            Create Statement
            Execute Statement
            process the result
            Close
         */

        String url = "jdbc:mysql://localhost:3306/Students";
        String username = "Local Instance 3306";
        String pass = "3009Vivek2408#";

        //second step
        Class.forName("org.mysqlDriver");

        //Third Step - Create Connection
        Connection con = DriverManager.getConnection(url,username,pass);
        System.out.println("Connection Established ");
    }
}
