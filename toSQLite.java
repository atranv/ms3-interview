import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
 

public class ToSQLite {
 

    private Connection connect() {
        // SQLite connection
        String url = "jdbc:sqlite:C://users/alex/ms3-interview.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
 
//inserting to database
    
    public void insert(String lastname, String email) {
        String sql = "INSERT INTO MS3 Interview(lastname,email) VALUES(?,?)";
 
        try (Connection conn = this.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, lastname);
            pstmt.setString(2, email);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
 

    public static void main(String[] args) {
 
        ToSQLite app = new ToSQLite();
        
        // insert 
        app.insert("Jefferson", "jjefferson@hotmail.com");
        app.insert("Johnson", "joejohnson@yahoo.com");
        app.insert("Jackson", "mikejackson@thriller.com");
    }
 
}
