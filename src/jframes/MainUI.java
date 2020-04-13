package jframes;

import java.awt.Color;
import javax.swing.BorderFactory;
import videogamedatabase.ProgramEngine;

/**
 * @author Gavin Lumsden
 */
public class MainUI extends javax.swing.JFrame {

    // properties of the class
    private final int FORM_WIDTH = 830;
    private final int FORM_HEIGHT = 500;
    public ProgramEngine engine;

    /**
     * Default constructor for the class
     */
    public MainUI() {
        initComponents();
        // make a new engine
        engine = new ProgramEngine();
        // set the colours of the jpanels
        Color backgroundColor = new Color(0, 255, 255); 
        Color panelColor = new Color(255, 204, 0); 
        background.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        background.setOpaque(true);
        background.setBackground(backgroundColor);
        pnl1.setBackground(panelColor);
        pnl2.setBackground(panelColor);
        // create the jframe
        engine.createJFrame(FORM_WIDTH, FORM_HEIGHT, this);
    }
    
    /**
     * NetBeans generated code
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        btnQuit = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        pnl1 = new javax.swing.JPanel();
        pnl1Title = new javax.swing.JLabel();
        lblNewGame = new javax.swing.JLabel();
        lblNewReleaseDate = new javax.swing.JLabel();
        lblNewAuthor = new javax.swing.JLabel();
        lblNewGenre = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtNewName = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtNewReleaseDate = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtNewAuthor = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtNewGenre = new javax.swing.JTextPane();
        btnNewGame = new javax.swing.JButton();
        btnCleartext = new javax.swing.JButton();
        pnl2 = new javax.swing.JPanel();
        pnl2Title = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtOutput = new javax.swing.JTextArea();
        btnClearDatabaseOutput = new javax.swing.JButton();
        btnOutputDatabase = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        btnSort = new javax.swing.JButton();
        btnOpenSaved = new javax.swing.JButton();
        btnDeleteSaved = new javax.swing.JButton();
        btnSaveNew = new javax.swing.JButton();
        btnDeleteNew = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        btnQuit.setForeground(new java.awt.Color(255, 0, 0));
        btnQuit.setText("X");
        btnQuit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnQuit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnQuitMouseClicked(evt);
            }
        });
        getContentPane().add(btnQuit);
        btnQuit.setBounds(780, 10, 40, 40);

        lblTitle.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Videogame Database");
        getContentPane().add(lblTitle);
        lblTitle.setBounds(0, 0, 830, 60);

        pnl1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnl1.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        pnl1.setLayout(null);

        pnl1Title.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        pnl1Title.setText("Enter a new game: ");
        pnl1.add(pnl1Title);
        pnl1Title.setBounds(10, 10, 310, 14);

        lblNewGame.setText("Enter the name of the game: ");
        pnl1.add(lblNewGame);
        lblNewGame.setBounds(10, 30, 210, 30);

        lblNewReleaseDate.setText("Enter the release date of the game: ");
        pnl1.add(lblNewReleaseDate);
        lblNewReleaseDate.setBounds(10, 110, 210, 30);

        lblNewAuthor.setText("Enter the author of the game: ");
        pnl1.add(lblNewAuthor);
        lblNewAuthor.setBounds(10, 70, 210, 30);

        lblNewGenre.setText("Enter the genre of the game: ");
        pnl1.add(lblNewGenre);
        lblNewGenre.setBounds(10, 150, 210, 30);

        jScrollPane1.setViewportView(txtNewName);

        pnl1.add(jScrollPane1);
        jScrollPane1.setBounds(220, 30, 170, 30);

        jScrollPane2.setViewportView(txtNewReleaseDate);

        pnl1.add(jScrollPane2);
        jScrollPane2.setBounds(220, 110, 170, 30);

        jScrollPane3.setViewportView(txtNewAuthor);

        pnl1.add(jScrollPane3);
        jScrollPane3.setBounds(220, 70, 170, 30);

        jScrollPane4.setViewportView(txtNewGenre);

        pnl1.add(jScrollPane4);
        jScrollPane4.setBounds(220, 150, 170, 30);

        btnNewGame.setText("Create new game");
        btnNewGame.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNewGameMouseClicked(evt);
            }
        });
        pnl1.add(btnNewGame);
        btnNewGame.setBounds(10, 190, 380, 30);

        btnCleartext.setText("Clear the text in the input boxes");
        btnCleartext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCleartextMouseClicked(evt);
            }
        });
        pnl1.add(btnCleartext);
        btnCleartext.setBounds(10, 230, 380, 30);

        getContentPane().add(pnl1);
        pnl1.setBounds(10, 60, 400, 270);

        pnl2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnl2.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        pnl2.setLayout(null);

        pnl2Title.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        pnl2Title.setText("All games: ");
        pnl2.add(pnl2Title);
        pnl2Title.setBounds(10, 10, 300, 14);

        txtOutput.setColumns(20);
        txtOutput.setRows(5);
        txtOutput.setFocusable(false);
        jScrollPane5.setViewportView(txtOutput);

        pnl2.add(jScrollPane5);
        jScrollPane5.setBounds(10, 30, 380, 230);

        getContentPane().add(pnl2);
        pnl2.setBounds(420, 60, 400, 270);

        btnClearDatabaseOutput.setText("Clear the output box");
        btnClearDatabaseOutput.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClearDatabaseOutputMouseClicked(evt);
            }
        });
        getContentPane().add(btnClearDatabaseOutput);
        btnClearDatabaseOutput.setBounds(10, 380, 400, 30);

        btnOutputDatabase.setText("Output the current database");
        btnOutputDatabase.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOutputDatabaseMouseClicked(evt);
            }
        });
        getContentPane().add(btnOutputDatabase);
        btnOutputDatabase.setBounds(10, 340, 400, 30);

        btnSearch.setText("Search the database");
        btnSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSearchMouseClicked(evt);
            }
        });
        getContentPane().add(btnSearch);
        btnSearch.setBounds(10, 420, 400, 30);

        btnSort.setText("Sort the database");
        btnSort.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSortMouseClicked(evt);
            }
        });
        getContentPane().add(btnSort);
        btnSort.setBounds(10, 460, 400, 30);

        btnOpenSaved.setText("Open the current saved database");
        btnOpenSaved.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOpenSavedMouseClicked(evt);
            }
        });
        getContentPane().add(btnOpenSaved);
        btnOpenSaved.setBounds(420, 420, 400, 30);

        btnDeleteSaved.setText("Delete the current saved database");
        btnDeleteSaved.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteSavedMouseClicked(evt);
            }
        });
        getContentPane().add(btnDeleteSaved);
        btnDeleteSaved.setBounds(420, 460, 400, 30);

        btnSaveNew.setText("Save the new database");
        btnSaveNew.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSaveNewMouseClicked(evt);
            }
        });
        getContentPane().add(btnSaveNew);
        btnSaveNew.setBounds(420, 340, 400, 30);

        btnDeleteNew.setText("Delete the new database");
        btnDeleteNew.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteNewMouseClicked(evt);
            }
        });
        getContentPane().add(btnDeleteNew);
        btnDeleteNew.setBounds(420, 380, 400, 30);
        getContentPane().add(background);
        background.setBounds(0, 0, 830, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClearDatabaseOutputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearDatabaseOutputMouseClicked
        clearDatabaseOutput(); // clear the database output box
    }//GEN-LAST:event_btnClearDatabaseOutputMouseClicked

    private void btnSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchMouseClicked
        engine.searchDatabase(); // search the database
        outputDatabase();
    }//GEN-LAST:event_btnSearchMouseClicked

    private void btnSortMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSortMouseClicked
        engine.sortDatabase(); // sort the database
        outputDatabase(); 
    }//GEN-LAST:event_btnSortMouseClicked

    private void btnOpenSavedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOpenSavedMouseClicked
        try {
            engine.openSavedDatabse(); // open the database
            outputDatabase();
        } catch (NullPointerException error) {
            System.out.println("null error: " + error.toString()); // catch a null error
        }
    }//GEN-LAST:event_btnOpenSavedMouseClicked

    private void btnDeleteSavedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteSavedMouseClicked
        engine.deleteSavedDatabase(); // delete the current saved database
    }//GEN-LAST:event_btnDeleteSavedMouseClicked

    private void btnSaveNewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveNewMouseClicked
        engine.saveNewDatabase(); // save the new database
    }//GEN-LAST:event_btnSaveNewMouseClicked

    private void btnQuitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQuitMouseClicked
        engine.quit(); // quit the program
    }//GEN-LAST:event_btnQuitMouseClicked

    private void btnNewGameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNewGameMouseClicked
        // get the text from the input boxes
        String author      = txtNewAuthor.getText(); 
        String genre       = txtNewGenre.getText(); 
        String name        = txtNewName.getText(); 
        String releaseDate = txtNewReleaseDate.getText();
        engine.newGame(author,genre,name,releaseDate); // create a new game using the inputs
        outputDatabase();
        clearInputs(); // clear the input boxes
    }//GEN-LAST:event_btnNewGameMouseClicked

    private void btnCleartextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCleartextMouseClicked
        clearInputs(); // clear the input boxes
    }//GEN-LAST:event_btnCleartextMouseClicked

    private void btnDeleteNewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteNewMouseClicked
        engine.deleteNewDatabase(); 
        outputDatabase();
    }//GEN-LAST:event_btnDeleteNewMouseClicked

    private void btnOutputDatabaseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOutputDatabaseMouseClicked
        outputDatabase();
    }//GEN-LAST:event_btnOutputDatabaseMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton btnClearDatabaseOutput;
    private javax.swing.JButton btnCleartext;
    private javax.swing.JButton btnDeleteNew;
    private javax.swing.JButton btnDeleteSaved;
    private javax.swing.JButton btnNewGame;
    private javax.swing.JButton btnOpenSaved;
    private javax.swing.JButton btnOutputDatabase;
    private javax.swing.JButton btnQuit;
    private javax.swing.JButton btnSaveNew;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSort;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lblNewAuthor;
    private javax.swing.JLabel lblNewGame;
    private javax.swing.JLabel lblNewGenre;
    private javax.swing.JLabel lblNewReleaseDate;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel pnl1;
    private javax.swing.JLabel pnl1Title;
    private javax.swing.JPanel pnl2;
    private javax.swing.JLabel pnl2Title;
    private javax.swing.JTextPane txtNewAuthor;
    private javax.swing.JTextPane txtNewGenre;
    private javax.swing.JTextPane txtNewName;
    private javax.swing.JTextPane txtNewReleaseDate;
    private javax.swing.JTextArea txtOutput;
    // End of variables declaration//GEN-END:variables

    /**
     * Clears all the text boxes
     */
    private void clearInputs() {
        txtNewAuthor.setText("");
        txtNewGenre.setText("");
        txtNewName.setText("");
        txtNewReleaseDate.setText("");
    }
    
    /**
     * Clears the output box and the database
     */
    private void clearDatabaseOutput() {
        txtOutput.setText("");
    }

    /**
     * Output the database
     */
    private void outputDatabase() {
        if (engine.database == null || engine.database.isEmpty()) txtOutput.setText("");
        else txtOutput.setText(engine.database.toString());
    }

}
