package com.amine.tvshows.restcontrollers;

import java.util.List;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.amine.tvshows.entities.Genre;
import com.amine.tvshows.entities.TvShow;
import com.amine.tvshows.repos.GenreRepository;
import com.amine.tvshows.service.TvShowService;
@RestController
@RequestMapping("/api/genre")
@CrossOrigin (origins = "*")
public class GenreRESTController {
@Autowired
GenreRepository genreRepository;
@RequestMapping(method = RequestMethod.GET)
public List<Genre> getAllGenres()
{
return genreRepository.findAll();
}
@RequestMapping(value="/{id}",method = RequestMethod.GET)
public Genre getCategorieById(@PathVariable("id") Long id) {
	return genreRepository.findById(id).get();
}}
