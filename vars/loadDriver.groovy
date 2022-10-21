
@Grab("mysql:mysql-connector-java:5.1.25")

import groovy.sql.Sql;
import java.sql.DriverManager;
import java.sql.Driver;

def call(Map config){

Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
  
  
sql = Sql.newInstance("jdbc:mysql://localhost:3306/test", "root", "root", "com.mysql.jdbc.Driver")
sql.execute 'select 1 from dual'
sql.close()
}
