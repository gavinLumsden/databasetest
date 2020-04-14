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
public class Engine {

    // properties of the class
    public  LinkedList<Game> database;
    
    private FileHandler handler;
    private Sort        sort; 
    private Search      search; 
    
    private final String FILENAME  = "data.txt"; 
    private final int    NOT_FOUND = -1; 

    /**
     * Default constructor for the class
     */
    public Engine() {
        database = new LinkedList<>(); // create a new database
        handler  = new FileHandler(); // create a file handler object, used for file managment
        sort     = new Sort(); 
        search   = new Search(); 
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
     * @param genre the genre of the game
     * @param author the author of the game
     * @param releaseDate the release date of the game
     */
    public void newGame(String name,String genre,String author,String releaseDate) {
        if (database == null || database.isEmpty()) database = new LinkedList(); // error trap, checks to see if the database exists
        author = author.strip();
        genre  = genre.strip();
        name   = name.strip();
        releaseDate = releaseDate.strip();
        author = author.toLowerCase();
        genre  = genre.toLowerCase();
        name   = name.toLowerCase();
        releaseDate = releaseDate.toLowerCase();
        if (author.equals("") || author == null || 
            genre.equals("")  || genre  == null || 
            name.equals("")   || name   == null || 
            releaseDate.equals("") || releaseDate == null) output("Please fill out all the boxes!"); 
        else {
            Game game = new Game(name,genre,author,releaseDate); // create a new game
            database.add(game); // add it to the database
        }
    }
    
    /**
     * Used to search the database using an input from the user
     */
    public void searchDatabase() {
        String input = input("Enter the name of the game you are searching for"); 
        LinkedList<String> names = new LinkedList(); 
        for (int i = 0; i < database.size(); i++) {
            names.add(database.get(i).name); 
        }
        int index = search.linear(input, names); 
        if (index == NOT_FOUND) output("No games were found with the name: " + input); 
        else {
            String text = database.get(index).toSentence(); 
            output("Found " + text); 
        }
    }
    
    /**
     * Used to sort the database using one of the four properties of a game
     */
    public void sortDatabase() {
        try {
            String input = input("What would you like to sort by?"); 
            if (input.equals("author") || 
                input.equals("genre") || 
                input.equals("name") || 
                input.equals("release date")) sort.bubble(database, input);
            else output("Please enter a property of a video game"); 
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
        if (database == null) output("There is no database to save"); 
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
    
    /**
     * Outputs a message to the user
     * @param text the message that is displayed
     */
    private void output(String text) {
        JOptionPane.showMessageDialog(null, text);
    }
    
    /**
     * Asks the user to input a string 
     * @param text the message that is displayed
     * @return returns the input
     */
    private String input(String text) {
        String input = ""; 
        boolean check = true; 
        do {
            input = JOptionPane.showInputDialog(text); 
            if (input == null || input.equals("")) {
                output("Please enter something!");
                check = false; 
            } 
            else check = true; 
        } while (check == false); 
        input = input.toLowerCase(); 
        return input;
    }

}
