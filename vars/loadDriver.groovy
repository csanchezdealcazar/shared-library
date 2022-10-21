
@Grab("mysql:mysql-connector-java:5.1.25")
@GrabConfig(systemClassLoader=true)

import groovy.sql.Sql;
import java.util.ServiceLoader;
import java.sql.Driver;

def call(Map config){
ServiceLoader<Driver> loader = ServiceLoader.load(Driver.class);
sql = Sql.newInstance('jdbc:mysql://localhost:3306/test', 'root', 'root', 'com.mysql.jdbc.Driver')
sql.execute 'select 1 from dual'
sql.close()
}
