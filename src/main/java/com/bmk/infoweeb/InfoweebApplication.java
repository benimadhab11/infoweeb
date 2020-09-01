package com.bmk.infoweeb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.bmk.infoweeb.client.AnimeClient;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;

@SpringBootApplication
@ComponentScan({"com.bmk.infoweeb.controller", "com.bmk.infoweeb.dto","com.bmk.infoweeb.config","com.bmk.infoweeb.client"})
@EntityScan(basePackages = {"com.bmk.infoweeb.model"})
@EnableJpaRepositories(basePackages = {"com.bmk.infoweeb.repo"})
public class InfoweebApplication {



	public static void main(String[] args) {
		SpringApplication.run(InfoweebApplication.class, args);



	}


}
