package am.aca.generactive.generactive.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.util.Properties;

public class DataSourceConfig {
    @Bean

    public DataSource dataSource(@Qualifier("hibernateProperties") Properties hibernateProperties){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setConnectionProperties(hibernateProperties);
        return dataSource;
    }
}
