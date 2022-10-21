
@Grab('mysql:mysql-connector-java:5.1.25')

import groovy.sql.Sql;
import java.util.ServiceLoader;
import java.sql.Driver;

def call(Map config){
Class.forName("com.mysql.jdbc.Driver")
sql = Sql.newInstance("jdbc:mysql://172.17.0.2:3306/zd190955", "root","root", "com.mysql.jdbc.Driver")
rows = sql.execute "select * from sample;"
echo rows.dump()
}
