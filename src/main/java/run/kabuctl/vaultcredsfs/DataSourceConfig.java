package run.kabuctl.vaultcredsfs;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

//@Configuration
public class DataSourceConfig {

//    @Bean
//    public DataSource getDataSource() throws Exception {
//
//        MysqlCreds getMysqlCreds = new MysqlCreds();
//        System.out.println("Username: " + getMysqlCreds.getCreds()[0]);
//        System.out.println("Password: " + getMysqlCreds.getCreds()[1]);
//        HikariConfig config = new HikariConfig();
//        config.setJdbcUrl("jdbc:mysql://127.0.0.1:3306/handson?useSSL=false");
//        config.setDriverClassName("com.mysql.jdbc.Driver");
//        config.setUsername(getMysqlCreds.getCreds()[0]);
//        config.setPassword(getMysqlCreds.getCreds()[1]);
//        config.setMaxLifetime(30000);
//        config.setConnectionTimeout(300);
//        config.setConnectionInitSql("SELECT 1");
//        HikariDataSource dataSource = new HikariDataSource(config);
//
//        return dataSource;
//    }
}
