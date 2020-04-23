package io.pivotal.pal.tracker;

import com.mysql.cj.jdbc.MysqlDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

@SpringBootApplication
public class PalTrackerApplication {

    public static void main(String[] args) {
        SpringApplication.run(PalTrackerApplication.class, args);
    }


    @Bean
    TimeEntryRepository timeEntryRepository(@Value("${SPRING_DATASOURCE_URL}") String dataSourceUrl) {
        DataSource dataSource = new MysqlDataSource();
        ((MysqlDataSource) dataSource).setUrl(dataSourceUrl);
        return new JdbcTimeEntryRepository(dataSource);

    }
}