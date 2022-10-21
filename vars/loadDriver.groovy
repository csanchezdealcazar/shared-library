
@Grab("mysql:mysql-connector-java:5.1.25")

import groovy.sql.Sql;
import java.util.ServiceLoader;
import java.sql.Driver;

def call(Map config){
Class.forName("com.mysql.jdbc.Driver"); 
DriverManager.registerDriver(new com.mysql.jdbc.driver())
sql = Sql.newInstance("jdbc:mysql://localhost:3306/test", "root", "root", "com.mysql.jdbc.Driver")
sql.execute 'select 1 from dual'
sql.close()
}
