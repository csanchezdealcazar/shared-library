
@Grab('mysql:mysql-connector-java:5.1.47'),


import groovy.sql.*
import java.sql.DriverManager

DriverManager.registerDriver(new com.mysql.jdbc.Driver())

def logger = LoggerFactory.getLogger('sql')
logger.info 'Initialize SQL'
def sql = Sql.newInstance('jdbc:mysql://localhost:3306/midb, 'USER', 'PASSWORD', 'com.mysql.jdbc.Driver')
logger.info "Got myself a SQL connection: $sql"
