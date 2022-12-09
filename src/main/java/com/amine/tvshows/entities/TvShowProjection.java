package com.amine.tvshows.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "nomTvShow", types = { TvShow.class })
public interface TvShowProjection {
	public String getNomTvShow();
}
