package videogamedatabase;

import collections.LinkedList;
import io.FileHandler;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import tools.Search;
import tools.Sort;

/**
 * @author g.lumsden
 */
public class ProgramEngine {

    // properties of the class
    public LinkedList<Game> database;
    private FileHandler handler;
    private Search search;
    private Sort sort;
    private final String FILENAME = "data.txt"; 

    /**
     * Default constructor for the class
     */
    public ProgramEngine() {
        // create a new database
        database = new LinkedList<>();
        handler = new FileHandler(); 
        search = new Search(); 
        sort = new Sort(); 
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
     * Searches the database using a keyword
     * 
     * @return returns the items found
     */
    public LinkedList<Game> searchDatabase(String keyword) {
        // make a linked list of all the found items (games)
        LinkedList found = new LinkedList<>(); 
        for (int i = 0; i < database.size(); i++) {
            Game check = database.get(i); 
            if (check.keyword.equals(keyword)) found.add(check); 
        }
        // returns the found items
        return found; 
    }
    
    /**
     * Searches the database using a keyword
     * 
     * @param property
     * @return returns the items found
     */
    public LinkedList<Game> sortDatabase(String property) {
        return sort.bubble(database, property); 
    }
    
    /**
     * Opens a database from a saved file
     */
    public void openDatabse() {
        database = (LinkedList<Game>)handler.openObject(FILENAME); 
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
        handler.saveObject(database, FILENAME); 
    }

    /**
     * Selects an image for a game 
     */
    public void selectImage() {
        
    }

}
