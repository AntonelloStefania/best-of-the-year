package org.java.bofy.controller;

import java.util.ArrayList;
import java.util.List;

import org.java.bofy.pojo.Movie;
import org.java.bofy.pojo.Song;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class MainController {
	private List<Movie> getBestMovie(){
		
		List<Movie> movies = new ArrayList<>();
		movies.add(new Movie(0, "THE FIRST SLAM DUNK"));
		movies.add(new Movie(1, "ARE YOU THERE GOD? IT'S ME, MARGARET"));
		movies.add(new Movie(2, "PAST LIVES"));
		movies.add(new Movie(3, "BLACKBERRY"));
		movies.add(new Movie(4, "RYE LANE"));
		movies.add(new Movie(5, "JOYLAND"));
		movies.add(new Movie(6, "THE BEASTS"));
		movies.add(new Movie(7, "FULL TIME"));
		movies.add(new Movie(8, "ALONERS"));
		movies.add(new Movie(9, "THE INNOCENT"));
		
		
		return movies;
	}
	
	private List<Song> getBestSong(){
		List<Song> songs = new ArrayList<>();
		songs.add(new Song(0, "Last Night"));
		songs.add(new Song(1, "Kill Bill"));
		songs.add(new Song(2, "Flowers"));
		songs.add(new Song(3, "Something in the Orange"));
		songs.add(new Song(4, "Fast Car"));
		songs.add(new Song(5, "Anti-Hero"));
		songs.add(new Song(6, "You Proof"));
		songs.add(new Song(7, "Die For You"));
		songs.add(new Song(8, "Ella Baila Sola"));
		songs.add(new Song(9, "Snooze"));
		
		return songs;
	}
	
	
	
	@GetMapping("/")
	public String firstPage(Model model) {
		final String myName = "Antonello";
		model.addAttribute("myName", myName);
		
		return "firstPage";
	}
	
	@GetMapping("/movies")
	public String moviesPage(Model model) {
		final List<Movie> movies = getBestMovie();
		
		
		StringBuilder movieDetails = new StringBuilder(); 
		for (Movie movie : movies ) {
			movieDetails.append("titolo film: "+movie.getTitle());
			movieDetails.append(" id film: " + movie.getId());
			movieDetails.append(", ");
		}
		model.addAttribute("movies", movieDetails);
		
		return "moviePage";
	}
	
	@GetMapping("/showMovie/{id}")
	public String showMovie(Model model,
				@PathVariable int id) {
		final List<Movie> movies = getBestMovie();

		
		StringBuilder movieShow = new StringBuilder(); 
		for (Movie movie : movies ) {
			if(movie.getId() == id) {
				
				movieShow.append("titolo film scelto: "+ movie.getTitle());
			}
			
		}
		model.addAttribute("id", id);
		model.addAttribute("movie", movieShow);
		return "showMovie";
	}
	
	@GetMapping("/songs")
	public String songsPage(Model model) {
		final List<Song> songs = getBestSong();
		StringBuilder songDetails = new StringBuilder(); 
		for (Song song : songs ) {
			songDetails.append("totolo canzone: " + song.getSong_title());
			songDetails.append(" id canzone: " + song.getSong_id());
			songDetails.append(", ");
		}
		model.addAttribute("songs", songDetails);
		return "songPage";
	}
	
	@GetMapping("/showSong/{id}")
	public String showSong(Model model,
				@PathVariable int id) {
		final List<Song> songs = getBestSong();

		
		StringBuilder songShow = new StringBuilder(); 
		for (Song song : songs ) {
			if(song.getSong_id() == id) {
				
				songShow.append("titolo canzone scelta: "+ song.getSong_title());
			}
			
		}
		model.addAttribute("id", id);
		model.addAttribute("song", songShow);
		return "songShow";
	}

}
