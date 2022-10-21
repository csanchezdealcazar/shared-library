import java.sql.DriverManager;
import groovy.sql.Sql


class MyDB {

    def openConnection() {
     Class.forName("com.mysql.cj.jdbc.Driver").newInstance();   
     def conn = DriverManager.getConnection("jdbc:mysql://localhost/test?user=minty&password=greatsqldb");
    }
}
@Grab(group='mysql', module='mysql-connector-java', version='8.0.21')
def call (Map Config) {
   def mydb = new MyDB() 
   mydb.openConnection()
}
