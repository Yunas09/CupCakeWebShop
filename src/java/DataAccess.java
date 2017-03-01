
import java.sql.*;


    public class DataAccess{
        Connection con;
        
        
        public DataAccess() throws SQLException, ClassNotFoundException {
                
    connector connect = new connector();
    con = connect.getConnection();
   }
  
public User getUser(String username) throws SQLException
{
    PreparedStatement prep = con.prepareStatement("SELECT * from user WHERE username = ?;");
    
    prep.setString(1, username);
    ResultSet rs = prep.executeQuery();
    rs.next();
   return new User(rs.getString(1), rs.getString(2), rs.getDouble(3));
}

public boolean verifyUser(String username, String pw)
{
    User temp;
    
    try
    {
     temp = getUser(username);
    }
    catch (SQLException ex)
    {
        System.out.println("Not in a database");
        return false;
        
        
    }
    return temp.getUserName().equals(username) && temp.getPassWord().equals(pw);
}

public void Regsiter (String username, String password, String balance) throws SQLException  
{
   
   PreparedStatement prep = con.prepareStatement("INSERT INTO user (username, password, balance, ) VALUES (?, ?, ?)");
   prep.setString(1, username);
   prep.setString(2, password);
   prep.setString(3, balance);
    ResultSet rs = prep.executeQuery();
    System.out.println("Storing done");
    }
}