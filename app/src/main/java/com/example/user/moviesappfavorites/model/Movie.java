package com.example.user.moviesappfavorites.model;

public class Movie {
    private String title, poster, release, rate, overview;
    private int id;

    //constructor
    public Movie(){
    }

    public Movie(String title, String poster, String release, String rate, String overview, int id){
        this.title = title;
        this.poster = poster;
        this.release = release;
        this.rate = rate;
        this.overview = overview;
        this.id = id;
    }

    //generate getters and setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public String getRelease() {
        return release;
    }

    public void setRelease(String release) {
        this.release = release;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}