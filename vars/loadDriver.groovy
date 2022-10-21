
@Grab("mysql:mysql-connector-java:5.1.25")

import groovy.sql.Sql;
import java.util.ServiceLoader;
import java.sql.Driver;

def call(Map config){
ServiceLoader<Driver> loader = ServiceLoader.load(Driver.class);
sql = Sql.newInstance('jdbc:oracle:thin:@SERVER:2483/INSTANCE', 'USER', 'PASSWORD', 'oracle.jdbc.OracleDriver')
sql.execute 'select 1 from dual'
sql.close()
}
