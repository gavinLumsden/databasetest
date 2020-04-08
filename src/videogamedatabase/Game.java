package videogamedatabase;

import java.io.Serializable;

/**
 * @author Gavin Lumsden
 * @param <T>
 */
public class Game <T extends Comparable<T>> implements Serializable {

    // properties of the class 
    public String keyword;
    public String name;
    public String author;
    public String releaseDate;
    
    public final int BAD_PROPERTY = Integer.MIN_VALUE; 

    /**
     * Default constructor for the class
     *
     * @param name the name of the game
     * @param keyword the keyword used to search for
     * @param author the author of the game
     * @param releaseDate the release date of the game
     */
    public Game(String name,String keyword,String author,String releaseDate) {
        this.name        = name;
        this.keyword     = keyword;
        this.author      = author;
        this.releaseDate = releaseDate;
    }

    /**
     * Turns the class into a string
     *
     * @return return the text as a string
     */
    @Override
    public String toString() {
        String text = ""; 
        text += "Name: "           + name; 
        text += ", Keyword: "      + keyword; 
        text += ", Author: "       + author; 
        text += ", Release date: " + releaseDate; 
        return text; 
    }

    public int compareTo(Game that, String property) {
        if (property.equals("name"))         return this.name.compareTo(that.name); 
        if (property.equals("keyword"))      return this.keyword.compareTo(that.keyword); 
        if (property.equals("author"))       return this.author.compareTo(that.author); 
        if (property.equals("release date")) return this.author.compareTo(that.author); 
        return BAD_PROPERTY; 
    }
    
}
