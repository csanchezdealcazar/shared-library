
@Grab('mysql:mysql-connector-java:5.1.10')


import groovy.sql.Sql;
import java.util.ServiceLoader;
import java.sql.Connection;
import java.sql.Driver;

def call(Map config){

 Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sonoo","root","root");  
 
Statement stmt=con.createStatement();  
ResultSet rs=stmt.executeQuery("select * from emp");  
while(rs.next())  
System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
con.close();  

  
}
