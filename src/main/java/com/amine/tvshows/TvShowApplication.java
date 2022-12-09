package com.amine.tvshows;

import java.util.Date;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.amine.tvshows.controllers.TvShowController;
import com.amine.tvshows.entities.Genre;
import com.amine.tvshows.entities.TvShow;
import com.amine.tvshows.service.TvShowService;

@SpringBootApplication
@ComponentScan
@EnableAutoConfiguration

@Import(TvShowController.class)
public class TvShowApplication implements CommandLineRunner {
@Autowired
private RepositoryRestConfiguration repositoryRestConfiguration;
TvShowService tvshowService;
public static void main(String[] args) {
SpringApplication.run(TvShowApplication.class, args);
 	
}
@Override
public void run(String... args) throws Exception {
repositoryRestConfiguration.exposeIdsFor(TvShow.class,Genre.class);
}
}