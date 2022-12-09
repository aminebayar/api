package com.amine.tvshows.restcontrollers;

import java.util.List;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.amine.tvshows.entities.TvShow;
import com.amine.tvshows.service.TvShowService;
@RestController
@RequestMapping("/api")
@CrossOrigin (origins = "*")
public class TvShowRESTController {
@Autowired
TvShowService tvshowService;
@RequestMapping(path ="all",method = RequestMethod.GET)
public List<TvShow> getAllTvShows() {
return tvshowService.getAllTvShows();
}
@RequestMapping(value="/{id}",method = RequestMethod.GET)
public TvShow getTvShowById(@PathVariable("id") Long id) {
return tvshowService.getTvShow(id);

}
@RequestMapping(method = RequestMethod.POST)
public TvShow createTvShow(@RequestBody TvShow tvshow) {
return tvshowService.saveTvShow(tvshow);
}
@RequestMapping(method = RequestMethod.PUT)
public TvShow updateTvShow(@RequestBody TvShow tvshow) {
return tvshowService.updateTvShow(tvshow);
}
@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
public void deleteTvShow(@PathVariable("id") Long id)
{
tvshowService.deleteTvShowById(id);
}
@RequestMapping(value="/tvshowsgenre/{idGenre}",method = RequestMethod.GET)
public List<TvShow> getTvShowsByGenreId(@PathVariable("idGenre") Long idGenre) {
return tvshowService.findByGenreIdGenre(idGenre);
}
@RequestMapping(value="/tvshowsByName/{nom}",method = RequestMethod.GET)
public List<TvShow> findByNomTvShowContains(@PathVariable("nom") String nom) {
return tvshowService.findByNomTvShowContains(nom);
}

}
