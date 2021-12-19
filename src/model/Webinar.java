package model;

import adapter.WebinarIF;

public class Webinar implements WebinarIF{
	
	private String id = "";
	private String title = "";
	private double price = 0.0;
	private String hoster = "";
	private long minutes = 0;
	private boolean watched = false;
	
	public Webinar() {
		
	}
	
	public Webinar(String id, String title, double price, String hoster, long minutes) {
		super();
		this.id = id;
		this.title = title;
		this.price = price;
		this.hoster = hoster;
		this.minutes = minutes;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getHoster() {
		return hoster;
	}

	public void setHoster(String hoster) {
		this.hoster = hoster;
	}

	public long getMinutes() {
		return minutes;
	}

	public void setMinutes(long minutes) {
		this.minutes = minutes;
	}

	public boolean wasWatched() {
		return watched;
	}

	@Override
	public void play() {
		this.watched = true;
		
	}
	
	@Override
	public String toString() {
		return "Webinar [id=" + id + ", title=" + title + ", price=" + price + ", hoster=" + hoster + ", minutes="
				+ minutes + ", watched=" + watched + "]";
	}	
}
