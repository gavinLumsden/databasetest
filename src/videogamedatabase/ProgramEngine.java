package videogamedatabase;

import collections.LinkedList;
import java.awt.Color;
import javax.swing.JFrame;
import jframes.SearchBy;
import jframes.SortBy;

/**
 * @author g.lumsden
 */
public class ProgramEngine {

    // properties of the class
    public LinkedList<Game> database;

    /**
     * Default constructor for the class
     */
    public ProgramEngine() {
        // create a new database
        database = new LinkedList<>();
    }

    /**
     * Used to create a jframe and set basic properties
     *
     * @param width
     * @param height
     * @param frame
     */
    public void createJFrame(int width, int height, JFrame frame) {
        // set default properties for a jframe
        frame.setSize(width, height);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);
    }

    /**
     * Creates a new game and adds it to the database
     *
     * @param name the name of the game
     * @param keyword the keyword used to search for
     * @param author the author of the game
     * @param releaseDate the release date of the game
     */
    public void newGame(String name, String keyword, String author, int releaseDate) {
        // create a new game
        Game game = new Game(name, keyword, author, releaseDate);
        // add it to the database
        database.add(game);
    }

    /**
     * Gets a keyword to search with
     */
    public void searchDatabase() {
        SearchBy search = new SearchBy(this); 
    }
    
    /**
     * Searches the database using a keyword
     * 
     * @param searchProperty
     */
    public void searchDatabase(String searchProperty) {
        System.out.println("Search by: " + searchProperty);
    }

    /**
     * Searches the database using multiple keywords
     * 
     * @param searchPropertys
     */
    public void searchDatabase(String[] searchPropertys) {
        
    }
    
    /**
     * Gets a property to search with
     */
    public void sortDatabase() {
        SortBy sort = new SortBy(this); 
    }
    
    /**
     * Sorts the database using a property of a game
     * 
     * @param sortProperty the property used to sort
     */
    public void sortDatabase(String sortProperty) {
        System.out.println("Sort by: " + sortProperty);
    }
    
    /**
     * Sorts the database using multiple properties of a game
     * 
     * @param sortProperties the properties used to sort
     */
    public void sortDatabase(String[] sortProperties) {
        
    }

    /**
     * Opens a database from a saved file
     */
    public void openDatabse() {
        
    }

    /**
     * Deletes the saved database
     */
    public void deleteDatabase() {
        
    }

    /**
     * Saves the new database
     */
    public void saveDatabase() {
        
    }

    /**
     * Selects an image for a game 
     */
    public void selectImage() {
        
    }

}
