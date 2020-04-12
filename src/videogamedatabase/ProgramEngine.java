package videogamedatabase;

import collections.LinkedList;
import io.FileHandler;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import tools.Search;
import tools.Sort;

/**
 * @author Gavin Lumsden
 */
public class ProgramEngine {

    // properties of the class
    public LinkedList<Game> database;
    private FileHandler handler;
    private Sort sort; 
    private Search search; 
    
    private final String FILENAME = "data.txt"; 
    private final int NOT_FOUND = -1; 

    /**
     * Default constructor for the class
     */
    public ProgramEngine() {
        database = new LinkedList<>(); // create a new database
        handler = new FileHandler(); // create a file handler object, used for file managment
        sort = new Sort(); 
        search = new Search(); 
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
     * Used to search the database using a keyword
     */
    public void searchDatabase() {
        try {
            String input = JOptionPane.showInputDialog("Enter the name of the game you are searching for"); 
            input.toLowerCase(); 
            LinkedList<String> names = new LinkedList(); 
            for (int i = 0; i < database.size(); i++) {
                names.add(database.get(i).name); 
            }
            int index = search.linear(input, names); 
            if (index == NOT_FOUND) JOptionPane.showMessageDialog(null, "No games were found with the name: " + input);
            else {
                String author  = database.get(index).author; 
                String date    = database.get(index).releaseDate; 
                String keyword = database.get(index).keyword; 
                String name    = database.get(index).name; 
                JOptionPane.showMessageDialog(
                    null, 
                    "Found the game: " + name + "\n\n" + 
                    name + " was created on " + date + 
                    " by " + author + "\n" + 
                    name + " is a " + keyword + " game.");
            }
        } catch (NullPointerException error) {
            System.out.println("null error: " + error.toString());
        }
    }
    
    /**
     * Used to sort the database using one of the four properties of a game
     */
    public void sortDatabase() {
        try {
            String input = JOptionPane.showInputDialog("What would you like to sort by?"); 
            input.toLowerCase(); 
            if (input.equals("author") || 
                input.equals("release date") || 
                input.equals("keyword") || 
                input.equals("name")) sort.bubble(database, input);
            else JOptionPane.showMessageDialog(null, "Please enter a property of a video game");
        } catch (NullPointerException error) {
            System.out.println("null error: " + error.toString());
        }
    }
    
    /**
     * Opens the saved database from the file
     */
    public void openSavedDatabse() {
        database = (LinkedList<Game>)handler.openObject(FILENAME); 
    }

    /**
     * Deletes the saved database
     */
    public void deleteSavedDatabase() {
        handler.save("", FILENAME); 
    }

    /**
     * Saves the new database to the file
     */
    public void saveNewDatabase() {
        if (database == null) JOptionPane.showMessageDialog(null, "There is no database to save");
        else handler.saveObject(database, FILENAME); 
    }
    
    /**
     * Deletes the new database
     */
    public void deleteNewDatabase() {
        database.finalize();
    }

    /**
     * Quits the program
     */
    public void quit() {
        System.exit(0);
    }

}
