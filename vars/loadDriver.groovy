
import groovy.sql.Sql
import com.mysql.jdbc.*

/**
 * A small example script on how to connect to a mysql database in a groovy script.
 *  
 * @author: Marcel Maatkamp (m.maatkamp avec gmail dot com)
 */

@Grab(group='mysql', module='mysql-connector-java', version='5.1.12')
class MyDB {
  def db = Sql.newInstance("jdbc:mysql://hostname/database", "username", "password", "com.mysql.jdbc.Driver")

  def getUsers() {
    def results = new HashMap()
    db.eachRow("select number, first, last from user", { user ->
      results.put(user.number, [ number: user.number, firstname: user.first, lastname: user.last])
    })
    return results
  }
}

def call (Map Config){
def mydb = new MyDB()
mydb.getUsers().each { user 
  println "$user.key \t $user.value.lastname, \t $user.value.firstname"
}
}
  
