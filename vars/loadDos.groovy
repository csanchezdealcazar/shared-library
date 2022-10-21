
@Grab('mysql:mysql-connector-java:5.1.47')


import groovy.sql.*
import java.sql.DriverManager

def call(Map Config){
    DriverManager.registerDriver(new com.mysql.jdbc.Driver())

   
    def sql = Sql.newInstance('jdbc:mysql://localhost:3306/midb', 'USER', 'PASSWORD', 'com.mysql.jdbc.Driver')
   
}
