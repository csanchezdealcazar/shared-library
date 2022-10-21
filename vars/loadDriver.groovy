@Grab('mysql:mysql-connector-java:5.1.25')

import groovy.sql.Sql;
import java.util.ServiceLoader;
import java.sql.*;

def call(Map config){

  Connection conn = null;

    conn =
       DriverManager.getConnection("jdbc:mysql://localhost/test?user=minty&password=greatsqldb");
  
    PreparedStatement preparedStatement = conn.prepareStatement('SELECT * from employee'));

}
