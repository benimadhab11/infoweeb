package com.bmk.infoweeb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.bmk.infoweeb.client.AnimeClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.stereotype.Component;

@SpringBootApplication
@ComponentScan({"com.bmk.infoweeb.client","com.bmk.infoweeb.config","com.bmk.infoweeb.controller","com.bmk.infoweeb"})
public class InfoweebApplication {



	public static void main(String[] args) {
		SpringApplication.run(InfoweebApplication.class, args);



	}


}
