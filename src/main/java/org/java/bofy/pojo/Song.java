package org.java.bofy.pojo;

public class Song {
	private int song_id;
	private String song_title;
	
	public Song(int song_id, String song_title) {
		setSong_id(song_id);
		setSong_title(song_title);
	}

	public int getSong_id() {
		return song_id;
	}

	public void setSong_id(int song_id) {
		this.song_id = song_id;
	}

	public String getSong_title() {
		return song_title;
	}

	public void setSong_title(String song_title) {
		this.song_title = song_title;
	}
	
}
