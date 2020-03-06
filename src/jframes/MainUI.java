package jframes;

import collections.LinkedList;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import videogamedatabase.Game;
import videogamedatabase.ProgramEngine;

/**
 * @author g.lumsden
 */
public class MainUI extends javax.swing.JFrame {

    // properties of the class
    private final int FORM_WIDTH = 690;
    private final int FORM_HEIGHT = 690;
    public ProgramEngine engine;

    /**
     * Default constructor for the class
     */
    public MainUI() {
        initComponents();
        // make a new engine
        engine = new ProgramEngine();
        // set the properties of the form
        Color backgroundColor = new Color(0, 255, 255); 
        Color panelColor = new Color(255, 204, 0); 
        background.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        background.setOpaque(true);
        background.setBackground(backgroundColor);
        pnl1.setBackground(panelColor);
        pnl2.setBackground(panelColor);
        engine.createJFrame(FORM_WIDTH, FORM_HEIGHT, this);
    }
    
    /**
     * NetBeans generated code
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        pnl1 = new javax.swing.JPanel();
        pnl1Title = new javax.swing.JLabel();
        lblNewLogoImage = new javax.swing.JLabel();
        btnSelectImage = new javax.swing.JButton();
        lblNewGame = new javax.swing.JLabel();
        lblNewDate = new javax.swing.JLabel();
        lblNewAuthor = new javax.swing.JLabel();
        lblNewKeyword = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtNewName = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtNewDate = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtNewAuthor = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtNewKeyword = new javax.swing.JTextPane();
        btnNewGame = new javax.swing.JButton();
        btnCleartext = new javax.swing.JButton();
        pnl2 = new javax.swing.JPanel();
        pnl2Title = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtOutput = new javax.swing.JTextArea();
        btnClearDatabase = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        btnSort = new javax.swing.JButton();
        btnOpen = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnQuit = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Videogame Database");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 690, 60);

        pnl1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnl1.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        pnl1.setLayout(null);

        pnl1Title.setText("Enter a new game: ");
        pnl1.add(pnl1Title);
        pnl1Title.setBounds(10, 10, 310, 14);

        lblNewLogoImage.setBackground(new java.awt.Color(255, 255, 255));
        lblNewLogoImage.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblNewLogoImage.setForeground(new java.awt.Color(102, 102, 102));
        lblNewLogoImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNewLogoImage.setText("Image here");
        lblNewLogoImage.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblNewLogoImage.setOpaque(true);
        pnl1.add(lblNewLogoImage);
        lblNewLogoImage.setBounds(10, 30, 310, 300);

        btnSelectImage.setText("Select image");
        btnSelectImage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSelectImageMouseClicked(evt);
            }
        });
        pnl1.add(btnSelectImage);
        btnSelectImage.setBounds(10, 340, 310, 30);

        lblNewGame.setText("Enter the name of the game: ");
        pnl1.add(lblNewGame);
        lblNewGame.setBounds(10, 380, 210, 30);

        lblNewDate.setText("Enter the release date of the game: ");
        pnl1.add(lblNewDate);
        lblNewDate.setBounds(10, 420, 210, 30);

        lblNewAuthor.setText("Enter the author of the game: ");
        pnl1.add(lblNewAuthor);
        lblNewAuthor.setBounds(10, 460, 210, 30);

        lblNewKeyword.setText("Enter the keyword of the game: ");
        pnl1.add(lblNewKeyword);
        lblNewKeyword.setBounds(10, 500, 210, 30);

        jScrollPane1.setViewportView(txtNewName);

        pnl1.add(jScrollPane1);
        jScrollPane1.setBounds(220, 380, 100, 30);

        jScrollPane2.setViewportView(txtNewDate);

        pnl1.add(jScrollPane2);
        jScrollPane2.setBounds(220, 420, 100, 30);

        jScrollPane3.setViewportView(txtNewAuthor);

        pnl1.add(jScrollPane3);
        jScrollPane3.setBounds(220, 460, 100, 30);

        jScrollPane4.setViewportView(txtNewKeyword);

        pnl1.add(jScrollPane4);
        jScrollPane4.setBounds(220, 500, 100, 30);

        btnNewGame.setText("Create new game");
        btnNewGame.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNewGameMouseClicked(evt);
            }
        });
        pnl1.add(btnNewGame);
        btnNewGame.setBounds(10, 540, 310, 30);

        btnCleartext.setText("Clear text");
        btnCleartext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCleartextMouseClicked(evt);
            }
        });
        pnl1.add(btnCleartext);
        btnCleartext.setBounds(10, 580, 310, 30);

        getContentPane().add(pnl1);
        pnl1.setBounds(10, 60, 330, 620);

        pnl2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnl2.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        pnl2.setLayout(null);

        pnl2Title.setText("All games: ");
        pnl2.add(pnl2Title);
        pnl2Title.setBounds(10, 10, 300, 14);

        txtOutput.setColumns(20);
        txtOutput.setRows(5);
        jScrollPane5.setViewportView(txtOutput);

        pnl2.add(jScrollPane5);
        jScrollPane5.setBounds(10, 30, 310, 300);

        btnClearDatabase.setText("Clear database");
        btnClearDatabase.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClearDatabaseMouseClicked(evt);
            }
        });
        pnl2.add(btnClearDatabase);
        btnClearDatabase.setBounds(10, 340, 310, 30);

        btnSearch.setText("Search the database");
        btnSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSearchMouseClicked(evt);
            }
        });
        pnl2.add(btnSearch);
        btnSearch.setBounds(10, 380, 310, 30);

        btnSort.setText("Sort the database");
        btnSort.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSortMouseClicked(evt);
            }
        });
        pnl2.add(btnSort);
        btnSort.setBounds(10, 420, 310, 30);

        btnOpen.setText("Open the current saved database");
        btnOpen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOpenMouseClicked(evt);
            }
        });
        pnl2.add(btnOpen);
        btnOpen.setBounds(10, 460, 310, 30);

        btnDelete.setText("Delete the current saved database");
        btnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteMouseClicked(evt);
            }
        });
        pnl2.add(btnDelete);
        btnDelete.setBounds(10, 500, 310, 30);

        btnSave.setText("Save the new database");
        btnSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSaveMouseClicked(evt);
            }
        });
        pnl2.add(btnSave);
        btnSave.setBounds(10, 540, 310, 30);

        btnQuit.setText("Quit");
        btnQuit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnQuitMouseClicked(evt);
            }
        });
        pnl2.add(btnQuit);
        btnQuit.setBounds(10, 580, 310, 30);

        getContentPane().add(pnl2);
        pnl2.setBounds(350, 60, 330, 620);
        getContentPane().add(background);
        background.setBounds(0, 0, 690, 690);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClearDatabaseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearDatabaseMouseClicked
        clearListDisplay(); 
    }//GEN-LAST:event_btnClearDatabaseMouseClicked

    private void btnSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchMouseClicked
        SearchFor searchFor = new SearchFor(this);  
    }//GEN-LAST:event_btnSearchMouseClicked

    private void btnSortMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSortMouseClicked
        SortBy sortBy = new SortBy(engine); 
    }//GEN-LAST:event_btnSortMouseClicked

    private void btnOpenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOpenMouseClicked
        openDatabse(); 
    }//GEN-LAST:event_btnOpenMouseClicked

    private void btnDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseClicked
        engine.deleteDatabase(); 
    }//GEN-LAST:event_btnDeleteMouseClicked

    private void btnSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseClicked
        engine.saveDatabase(); 
    }//GEN-LAST:event_btnSaveMouseClicked

    private void btnQuitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQuitMouseClicked
        quit(); 
    }//GEN-LAST:event_btnQuitMouseClicked

    private void btnSelectImageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSelectImageMouseClicked
        engine.selectImage(); 
    }//GEN-LAST:event_btnSelectImageMouseClicked

    private void btnNewGameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNewGameMouseClicked
        newGame(); 
    }//GEN-LAST:event_btnNewGameMouseClicked

    private void btnCleartextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCleartextMouseClicked
        clearInputs();
    }//GEN-LAST:event_btnCleartextMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton btnClearDatabase;
    private javax.swing.JButton btnCleartext;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnNewGame;
    private javax.swing.JButton btnOpen;
    private javax.swing.JButton btnQuit;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSelectImage;
    private javax.swing.JButton btnSort;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lblNewAuthor;
    private javax.swing.JLabel lblNewDate;
    private javax.swing.JLabel lblNewGame;
    private javax.swing.JLabel lblNewKeyword;
    private javax.swing.JLabel lblNewLogoImage;
    private javax.swing.JPanel pnl1;
    private javax.swing.JLabel pnl1Title;
    private javax.swing.JPanel pnl2;
    private javax.swing.JLabel pnl2Title;
    private javax.swing.JTextPane txtNewAuthor;
    private javax.swing.JTextPane txtNewDate;
    private javax.swing.JTextPane txtNewKeyword;
    private javax.swing.JTextPane txtNewName;
    private javax.swing.JTextArea txtOutput;
    // End of variables declaration//GEN-END:variables

    /**
     * Clears all the text boxes
     */
    private void clearInputs() {
        txtNewName.setText("");
        txtNewKeyword.setText("");
        txtNewAuthor.setText("");
        txtNewDate.setText("");
    }

    /**
     * creates a new game
     */
    private void newGame() {
        try {
            if      (txtNewName.getText().equals(""))    JOptionPane.showMessageDialog(this, "Please enter something");
            else if (txtNewKeyword.getText().equals("")) JOptionPane.showMessageDialog(this, "Please enter something");
            else if (txtNewAuthor.getText().equals(""))  JOptionPane.showMessageDialog(this, "Please enter something");
            else if (txtNewDate.getText().equals(""))    JOptionPane.showMessageDialog(this, "Please enter something");
            else {
                String name = txtNewName.getText(); 
                String keyword = txtNewKeyword.getText(); 
                String author = txtNewAuthor.getText(); 
                String date = txtNewDate.getText();
                int releaseDate = Integer.parseInt(date); 
                engine.newGame(name, keyword, author, releaseDate);
                txtOutput.setText(engine.database.toString());
            }
        } catch (NullPointerException error) {
            JOptionPane.showMessageDialog(this, "Please enter something");
        } catch (NumberFormatException error) {
            JOptionPane.showMessageDialog(this, "Please enter the correct information in the correct box");
        }
        clearInputs();
    }
    
    /**
     * Clears the output box and the database
     */
    private void clearListDisplay() {
        engine.database.finalize();
        txtOutput.setText("");
    }

    /**
     * Quits the program
     */
    private void quit() {
        System.exit(0);
    }
    
    /**
     * Searches the database using a keyword
     * 
     * @param keyword the keyword used to search
     */
    public void searchDatabase(String keyword) {
        // creates the form that gets the keyword the search with
        LinkedList<Game> found = engine.searchDatabase(keyword); 
        for (int i = 0; i < found.size(); i++) {
            String name        = found.get(i).name; 
            String author      = found.get(i).author; 
            int    releaseDate = found.get(i).releaseDate; 
            // outputs the games found
            JOptionPane.showMessageDialog(this, "Found the game " + name + "\n" + name + " was created by " + author + " in " + releaseDate);
        }
        // outputs nothing if there are no games with the keyword entered
        if (found.isEmpty()) JOptionPane.showMessageDialog(this, "There are no games with the keyword: " + keyword);
    }

    private void openDatabse() {
        engine.openDatabse();
        txtOutput.setText(engine.database.toString());
    }
    
}
