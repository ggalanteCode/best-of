package com.soprasteria.bestof.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.soprasteria.bestof.model.Movie;
import com.soprasteria.bestof.model.Song;

@RestController
@RequestMapping("/bestof")
public class BestOfController {
	
	@GetMapping("/movie")
	public Movie bestMovieOf2022() {
		List<String> cast = new ArrayList<String>();
		cast.add("A");
		cast.add("B");
		return new Movie("Film", 2022, "Mr.",cast);
	}
	
	@GetMapping("/song")
	public Song bestSongOf2022() {
		return new Song("Metal", 2022, "Metal", "A", "B");
	}

}
