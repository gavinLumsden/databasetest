package videogamedatabase;

import collections.LinkedList;
import io.FileHandler;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * @author Gavin Lumsden
 */
public class ProgramEngine {

    // properties of the class
    public        LinkedList<Game> database;
    private       FileHandler      handler;
    private final String           FILENAME = "data.txt"; 

    /**
     * Default constructor for the class
     */
    public ProgramEngine() {
        // create a new database
        database = new LinkedList<>();
        handler = new FileHandler(); 
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
    public void newGame(String name,String keyword,String author,String releaseDate) {
        try {
            // create a new game
            Game game = new Game(name,keyword,author,releaseDate);
            // add it to the database
            database.add(game);
        } catch (NullPointerException error) {
            System.out.println("null error: " + error.toString());
        }
    }
    
    /**
     * Searches the database using a keyword
     * 
     * @return returns the items found
     */
    public LinkedList<Game> searchDatabase() {
        return null; 
    }
    
    /**
     * Searches the database using a keyword
     * 
     * @return returns the items found
     */
    public LinkedList<Game> sortDatabase() {
        return null; 
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
        handler.save("", FILENAME); 
    }

    /**
     * Saves the new database
     */
    public void saveDatabase() {
        if (database == null) JOptionPane.showMessageDialog(null, "There is no database to save");
        else handler.saveObject(database, FILENAME); 
    }

    /**
     * Quits the program
     */
    public void quit() {
        System.exit(0);
    }

}
