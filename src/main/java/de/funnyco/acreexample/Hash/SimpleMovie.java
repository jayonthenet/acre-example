package de.funnyco.acreexample.Hash;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@RedisHash("Movies")
public class SimpleMovie {
    private final String title;
    private final String genre;
    private final int votes;
    private final double rating;
    private final int release_year;
    private final String plot;
    private final String poster;
    @Id
    private final String imdb_id;

    public SimpleMovie(String title, String genre, int votes, double rating, int release_year) {
        this.title = title;
        this.genre = genre;
        this.votes = votes;
        this.rating = rating;
        this.release_year = release_year;
        // Not in IMDB so we need to be creative
        this.plot = "";
        this.poster = "";
        this.imdb_id = RandomStringUtils.randomAlphanumeric(10);
    }
    public SimpleMovie(String title, String genre, int votes, double rating, int release_year, String plot, String poster) {
        this.title = title;
        this.genre = genre;
        this.votes = votes;
        this.rating = rating;
        this.release_year = release_year;
        this.plot = plot;
        this.poster = poster;
        this.imdb_id = RandomStringUtils.randomAlphanumeric(10);
    }
    public SimpleMovie(String title, String genre, int votes, double rating, int release_year, String plot, String poster, String imdb_id) {
        this.title = title;
        this.genre = genre;
        this.votes = votes;
        this.rating = rating;
        this.release_year = release_year;
        this.plot = plot;
        this.poster = poster;
        this.imdb_id = imdb_id;
    }

}
