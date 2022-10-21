import java.sql.DriverManager;
import groovy.sql.Sql
import java.util.ServiceLoader;
import java.sql.Driver;

@Grab(group='mysql', module='mysql-connector-java', version='8.0.21')
class MyDB {
    def driver = Class.forName("com.mysql.cj.jdbc.Driver").newInstance(); 
    ServiceLoader<Driver> loader = ServiceLoader.load(Driver.class);
    def openConnection() {
        def conn = DriverManager.getConnection("jdbc:mysql://localhost/test?user=minty&password=greatsqldb");
    }
}

def call (Map Config) {
   def mydb = new MyDB() 
   mydb.openConnection()
}
