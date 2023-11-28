package org.java.bofy.controller;

import java.util.ArrayList;
import java.util.List;

import org.java.bofy.pojo.Movie;
import org.java.bofy.pojo.Song;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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
	public String test1(Model model) {
		final String myName = "Antonello";
		model.addAttribute("myName", myName);
		
		return "firstPage";
	}

}
