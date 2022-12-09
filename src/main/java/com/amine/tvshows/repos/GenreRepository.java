package com.amine.tvshows.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.amine.tvshows.entities.Genre;

@RepositoryRestResource(path = "genre")
@CrossOrigin(origins ="http://localhost:4200/") //pour autoriser angular
@Repository
public interface GenreRepository extends JpaRepository<Genre, Long>{

}
