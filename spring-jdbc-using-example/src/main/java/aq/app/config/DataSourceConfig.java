package aq.app.config;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import com.zaxxer.hikari.HikariDataSource;

import jakarta.annotation.PostConstruct;

@Configuration
public class DataSourceConfig {

	private String username;
	private String password;
	private String url;
	private String driver;
	
	@PostConstruct
	private void loadDbConfigs() {
		try {
			Properties properties = new Properties();
			properties.load(new FileInputStream(new File("src/main/resources/application.properties")));
			username = properties.getProperty("db.username");
			password = properties.getProperty("db.password");
			url = properties.getProperty("db.url");
			driver = properties.getProperty("db.driver");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Bean
	DataSource dataSource() {
		HikariDataSource dataSource = new HikariDataSource();
		dataSource.setDriverClassName(driver);
		dataSource.setJdbcUrl(url);
		dataSource.setUsername(username);
		dataSource.setPassword(password);
		dataSource.setConnectionTimeout(1000);
		return dataSource;
	}
	
	@Bean
	JdbcTemplate jdbcTemplate(DataSource dataSource) {
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		return jdbcTemplate;
	}
}
