
@Grab("mysql:mysql-connector-java:8.0.31")

import groovy.sql.Sql
def call(Map config){
 sql = Sql.newInstance("jdbc:mysql://localhost:3306/test", "root", "root", "com.mysql.jdbc.Driver")
 users = sql.rows("SELECT * FROM users")
}
