@GrabConfig(systemClassLoader=true )
@Grab("mysql:mysql-connector-java:5.1.25")

import groovy.sql.Sql
def call(Map config){
 sql = Sql.newInstance("jdbc:mysql://localhost:3306/test", "root", "root", "com.mysql.jdbc.Driver")
 users = sql.rows("SELECT * FROM users")
}
