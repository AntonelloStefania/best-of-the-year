package org.java.bofy.pojo;

public class Movie {
	private String movie_title;
	private int movie_id;
	
	public Movie(int movie_id, String movie_title) {
		setTitle(movie_title);
		setId(movie_id);
	}

	public String getTitle() {
		return movie_title;
	}

	public void setTitle(String movie_title) {
		this.movie_title = movie_title;
	}

	public int getId() {
		return movie_id;
	}

	public void setId(int movie_id) {
		this.movie_id = movie_id;
	}
	
}
