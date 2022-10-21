
import java.sql.DriverManager;
import groovy.sql.Sql


/**
 * A small example script on how to connect to a mysql database in a groovy script.
 *  
 * @author: Marcel Maatkamp (m.maatkamp avec gmail dot com)
 */
//mysql:mysql-connector-java:8.0.31

@Grab(group='mysql', module='mysql-connector-java', version='5.1.25')
class MyDB {
 /* def db = Sql.newInstance("jdbc:mysql://hostname/database", "username", "password", "com.mysql.jdbc.Driver")*/

 
 
 // Class.forName("com.mysql.jdbc.Driver")
  def getUsers() {
 /*   def sql = Sql.newInstance("jdbc:mysql://mysql:3306/test_db", "user","passwd", "com.mysql.jdbc.Driver")
    def rows = sql.execute "select count(*) from test_table;"
    echo rows.dump()*/
   Class.forName("com.mysql.jdbc.Driver").newInstance();
   def conn = DriverManager.getConnection("jdbc:mysql://localhost/test?user=minty&password=greatsqldb");
  }
  
 /* 
  def getUsers() {
    def results = new HashMap()
    db.eachRow("select number, first, last from user", { user ->
      results.put(user.number, [ number: user.number, firstname: user.first, lastname: user.last])
    })
    return results
  }*/
}

def call (Map Config){
def mydb = new MyDB()
mydb.getUsers().each { user 
  println "$user.key \t $user.value.lastname, \t $user.value.firstname"
}
}
  
