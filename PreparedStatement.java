import java.sql.DriverManager;
import java.sql.Connection;

class PrepaidStatment {
    final String url = "jdbc:mysql://localhost:3306/sys";
    final String user = "root";
    final String pwd = "";

    static{
        try{
            class.forName("con.mysql.jdbc.Driver");
        }
    }

    public static void main(String[] args) {
        Connection con = DriverManager.getConnection(url, user, pwd);
        PrepaidStatment ps = con.prepareStatement("insert into student(?,?,?)");
        ps.setInt(1, 101);
        ps.setString(2, "viprajay");
        ps.setString(3, "delhi");
        ps.excuteUpdate();
    }
}