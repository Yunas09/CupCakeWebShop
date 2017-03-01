
import static java.lang.Class.forName;
import java.sql.*;
import javax.servlet.http.HttpServlet;

public class connector extends HttpServlet {

    static final String HOST = "Localhost";
    static final int PORT = 3306;
    static final String DATABASE = "webshop";
    static String USERNAME = "root";
    static String PASSWORD = "";
    static String URL = "jdbc:mysql://" + HOST + ":" + PORT + "/" + DATABASE;

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        new connector().getConnection();
    }

    public Connection getConnection() throws SQLException, ClassNotFoundException {

        try {
            Class.forName("com.mysql.jdbc.Driver");

        } catch (Exception ex) {

        } finally {
            Connection con = null;
            con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            return con;
        }

    }
}
