package com.amine.produits;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;

import com.amine.tvshows.entities.Genre;
import com.amine.tvshows.entities.TvShow;
import com.amine.tvshows.repos.TvShowRepository;
import com.amine.tvshows.service.TvShowService;

@SpringBootTest
class ProduitApplicationTests {

	@Autowired
	private TvShowRepository produitRepository;
	@Autowired
	private TvShowService produitService ;
	@Test
	public void testCreateProduit() {
	TvShow prod = new TvShow("PC Dell",2200.500,new Date());
	produitRepository.save(prod);
	}
	
	

	@Test
	public void testUpdateProduit()
	{
	TvShow p = produitRepository.findById(1L).get();
	p.setPrixProduit(1000.0);
	produitRepository.save(p);
	}
	@Test
	public void testDeleteProduit()
	{
	produitRepository.deleteById(1L);;
	}
	@Test
	public void testListerTousProduits()
	{
	List<TvShow> prods = produitRepository.findAll();
	for (TvShow p : prods)
	{
	System.out.println(p);
	}
}
	@Test
	public void testFindByNomProduit()
	{
	List<TvShow> prods = produitRepository.findByNomProduit("PC Dell");

	for (TvShow p : prods)
	{
	System.out.println(p);
	}

	}
	
	@Test
	public void testFindByNomProduitContains ()
	{
	List<TvShow> prods=produitRepository.findByNomProduitContains("PC Dell");

	for (TvShow p : prods)
	{
	System.out.println(p);
	} }
	@Test
	public void testfindByNomPrix()
	{
	List<TvShow> prods = produitRepository.findByNomPrix("PC Dell", 2600.0);
	for (TvShow p : prods)
	{
	System.out.println(p);
	}

	}
	@Test
	public void testfindByCategorie()
	{
	Genre cat = new Genre();
	cat.setIdCat(1L);

	List<TvShow> prods = produitRepository.findByCategorie(cat);
	for (TvShow p : prods)
	{
	System.out.println(p);
	}

	}
	@Test
	public void findByCategorieIdCat()
	{
	List<TvShow> prods = produitRepository.findByCategorieIdCat(1L);
	for (TvShow p : prods)
	{
	System.out.println(p);
	}

	}
	@Test
	public void testfindByOrderByNomProduitAsc()
	{
	List<TvShow> prods =produitRepository.findByOrderByNomProduitAsc();
	for (TvShow p : prods)
	{
	System.out.println(p);
	}

	}
	@Test
	public void testTrierProduitsNomsPrix()
	{
	List<TvShow> prods = produitRepository.trierProduitsNomsPrix();
	for (TvShow p : prods)
	{
	System.out.println(p);
	}

	}
	}
