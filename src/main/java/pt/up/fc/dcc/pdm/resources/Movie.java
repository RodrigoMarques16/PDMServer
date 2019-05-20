package pt.up.fc.dcc.pdm.resources;

import java.io.Serializable;
import java.util.Set;
/**
 * Movie
 */
public class Movie implements Serializable{

    private static final long serialVersionUID = 4218539720918454078L;
    
    private int id;
    private String name;
    private int year;
    private Set<String> tags;
    private String url;
    private Length length;

    public Movie(int id, String name, int year, Set<String> tags, Length length, String url) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.tags = tags;
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
    public Set<String> getTags() {
        return tags;
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