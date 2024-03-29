package jdbcexamples;

import java.sql.*;

//Connection is Interface to make a connection with db.- It contains some statements- PreparedStatement and DatabaseMetadata.
//con.createStatement();
//Drivermanager-It acts as bridge between users and drivers.
//Methods available in drivermanager.
    //  registerDriver()
    //deregisterDriver()
    //getConnection()
    //getDriver()

// Statement it is a interface - it provides methods to execute queries.
//      -executeQuery("query passed as string")
//      executeupdate("Query")
//      execute()
//      executeBatch()

//Resultset - It is an interface which is used to maitain the cursor pointing to a row of the table.
    //next()
    //previous()
    //first()
    //last()

// URL Formtat- jdbc:mysql://localhost:3306/studentdb
    //          JDBC:database type://url:portnumber/database name.
public class JDBCConnection {
    public static void main(String[] args) {
        try {
            //Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/javabatch2success","root","root");
            //here studentdb is database name, root is username and password

          /*  String sql="SELECT * FROM students where grade<=90";
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery(sql);
            //stmt.executeQuery(sql);
            while(rs.next())
                System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
*/
            //To insert data into table
          /*  String sql = "insert into students (id, name, grade)" + " values (?,?,?)";

            PreparedStatement stmt=con.prepareStatement(sql);
            stmt.setInt(1,6);
            stmt.setString(2,"Naresh");
            stmt.setInt(3,98);
            stmt.execute();

            System.out.println("Value inserted.");
*/
            //To Update table data
            String sql = "update students set name=? where id =?";

            PreparedStatement stmt=con.prepareStatement(sql);
            stmt.setString(1,"Pratik");
            stmt.setInt(2,2);
            stmt.executeUpdate();

            System.out.println("updated");


            //Delete Query MySQL.
         /*   String sql = "delete from students where id=?";
            PreparedStatement stmt=con.prepareStatement(sql);
            stmt.setInt(1,5);
            stmt.executeUpdate();
            System.out.println("Deleted");*/
            con.close();
        }catch(Exception e){
            e.printStackTrace();
            }
}
}
