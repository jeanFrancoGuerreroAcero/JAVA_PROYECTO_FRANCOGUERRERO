package orgg.src;

import java.sql.*;

public class Conexion {
    String URL = "jdbc:mysql://uzrbyoxgcejuxurg:YoRlbmc5IOLGBWhDu7ZS@b8x28o6u2ny0tovhttln-mysql.services.clever-cloud.com:3306/b8x28o6u2ny0tovhttln";
    String USERNAME = "uzrbyoxgcejuxurg";
    String PASSWORD = "YoRlbmc5IOLGBWhDu7ZS";

    public Connection con() throws SQLException{
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }
}
