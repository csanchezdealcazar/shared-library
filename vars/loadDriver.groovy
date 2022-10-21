
@Grab('com.oracle:ojdbc6:11.2.0.4')
	import groovy.sql.Sql;
    import java.util.ServiceLoader;
    import java.sql.Driver;

    ServiceLoader<Driver> loader = ServiceLoader.load(Driver.class);
    def sql = Sql.newInstance('jdbc:oracle:thin:@SERVER:2483/INSTANCE', 'USER', 'PASSWORD', 'oracle.jdbc.OracleDriver')
    sql.execute 'select 1 from dual'
    sql.close()
