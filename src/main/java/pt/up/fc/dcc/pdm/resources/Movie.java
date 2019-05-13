package pt.up.fc.dcc.pdm.resources;

import java.io.Serializable;
/**
 * Movie
 */
public class Movie implements Serializable{

    private static final long serialVersionUID = 4218539720918454078L;
    
    private int id;
    private String name;
    private int year;
    private String genre;
    private String url;
    private Length length;

    public Movie(int id, String name, int year, String genre, Length length, String url) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.genre = genre;
        this.length = length;
        this.url = url;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the length
     */
    public Length getLength() {
        return length;
    }

    /**
     * @return the tags
     */
    public String getGenre() {
        return genre;
    }

    /**
     * @return the url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }

}