package videogamedatabase;

import java.io.Serializable;

/**
 * @author Gavin Lumsden
 * @param <T>
 */
public class Game <T extends Comparable<T>> implements Serializable {

    // properties of the class 
    public String author;
    public String genre;
    public String name;
    public String releaseDate;
    
    /**
     * Default constructor for the class
     *
     * @param author the author of the game
     * @param genre the genre of the game
     * @param name the name of the game
     * @param releaseDate the release date of the game
     */
    public Game(String author,String genre,String name,String releaseDate) {
        this.author = author;
        this.genre  = genre;
        this.name   = name;
        this.releaseDate = releaseDate;
    }

    /**
     * Returns a string that represents the class
     *
     * @return returns the string
     */
    @Override
    public String toString() {
        String text = ""; 
        text += "Name: "           + name; 
        text += ", Author: "       + author; 
        text += ", Release date: " + releaseDate; 
        text += ", Genre: "        + genre; 
        return text; 
    }
    
}
