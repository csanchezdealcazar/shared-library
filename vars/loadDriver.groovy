@GrabConfig(systemClassLoader=true )
@Grab("mysql:mysql-connector-java:8.0.31")

import groovy.sql.Sql

def sql = Sql.newInstance("jdbc:mysql://localhost:3306/test", "root", "root", "com.mysql.jdbc.Driver")
def users = sql.rows("SELECT * FROM users")
