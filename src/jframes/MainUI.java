package jframes;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import videogamedatabase.ProgramEngine;

/**
 * @author Gavin Lumsden
 */
public class MainUI extends javax.swing.JFrame {

    // properties of the class
    private final int FORM_WIDTH = 690;
    private final int FORM_HEIGHT = 510;
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
        lblTitle = new javax.swing.JLabel();
        pnl1 = new javax.swing.JPanel();
        pnl1Title = new javax.swing.JLabel();
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

        lblTitle.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Videogame Database");
        getContentPane().add(lblTitle);
        lblTitle.setBounds(10, 0, 670, 60);

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

        lblNewDate.setText("Enter the release date of the game: ");
        pnl1.add(lblNewDate);
        lblNewDate.setBounds(10, 70, 210, 30);

        lblNewAuthor.setText("Enter the author of the game: ");
        pnl1.add(lblNewAuthor);
        lblNewAuthor.setBounds(10, 110, 210, 30);

        lblNewKeyword.setText("Enter the keyword of the game: ");
        pnl1.add(lblNewKeyword);
        lblNewKeyword.setBounds(10, 150, 210, 30);

        jScrollPane1.setViewportView(txtNewName);

        pnl1.add(jScrollPane1);
        jScrollPane1.setBounds(220, 30, 100, 30);

        jScrollPane2.setViewportView(txtNewDate);

        pnl1.add(jScrollPane2);
        jScrollPane2.setBounds(220, 70, 100, 30);

        jScrollPane3.setViewportView(txtNewAuthor);

        pnl1.add(jScrollPane3);
        jScrollPane3.setBounds(220, 110, 100, 30);

        jScrollPane4.setViewportView(txtNewKeyword);

        pnl1.add(jScrollPane4);
        jScrollPane4.setBounds(220, 150, 100, 30);

        btnNewGame.setText("Create new game");
        btnNewGame.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNewGameMouseClicked(evt);
            }
        });
        pnl1.add(btnNewGame);
        btnNewGame.setBounds(10, 190, 310, 30);

        btnCleartext.setText("Clear text");
        btnCleartext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCleartextMouseClicked(evt);
            }
        });
        pnl1.add(btnCleartext);
        btnCleartext.setBounds(10, 230, 310, 30);

        getContentPane().add(pnl1);
        pnl1.setBounds(10, 60, 330, 270);

        pnl2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnl2.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        pnl2.setLayout(null);

        pnl2Title.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        pnl2Title.setText("All games: ");
        pnl2.add(pnl2Title);
        pnl2Title.setBounds(10, 10, 300, 14);

        txtOutput.setColumns(20);
        txtOutput.setRows(5);
        jScrollPane5.setViewportView(txtOutput);

        pnl2.add(jScrollPane5);
        jScrollPane5.setBounds(10, 30, 310, 230);

        getContentPane().add(pnl2);
        pnl2.setBounds(350, 60, 330, 270);

        btnClearDatabase.setText("Clear database");
        btnClearDatabase.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClearDatabaseMouseClicked(evt);
            }
        });
        getContentPane().add(btnClearDatabase);
        btnClearDatabase.setBounds(10, 340, 330, 30);

        btnSearch.setText("Search the database");
        btnSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSearchMouseClicked(evt);
            }
        });
        getContentPane().add(btnSearch);
        btnSearch.setBounds(10, 380, 330, 30);

        btnSort.setText("Sort the database");
        btnSort.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSortMouseClicked(evt);
            }
        });
        getContentPane().add(btnSort);
        btnSort.setBounds(10, 420, 330, 30);

        btnOpen.setText("Open the current saved database");
        btnOpen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOpenMouseClicked(evt);
            }
        });
        getContentPane().add(btnOpen);
        btnOpen.setBounds(350, 340, 330, 30);

        btnDelete.setText("Delete the current saved database");
        btnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteMouseClicked(evt);
            }
        });
        getContentPane().add(btnDelete);
        btnDelete.setBounds(350, 380, 330, 30);

        btnSave.setText("Save the new database");
        btnSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSaveMouseClicked(evt);
            }
        });
        getContentPane().add(btnSave);
        btnSave.setBounds(350, 420, 330, 30);

        btnQuit.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnQuit.setText("Quit");
        btnQuit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnQuitMouseClicked(evt);
            }
        });
        getContentPane().add(btnQuit);
        btnQuit.setBounds(10, 460, 670, 40);
        getContentPane().add(background);
        background.setBounds(0, 0, 690, 510);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClearDatabaseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearDatabaseMouseClicked
        clearDatabaseOutput(); 
    }//GEN-LAST:event_btnClearDatabaseMouseClicked

    private void btnSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchMouseClicked
        engine.searchDatabase(); 
    }//GEN-LAST:event_btnSearchMouseClicked

    private void btnSortMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSortMouseClicked
        engine.sortDatabase(); 
    }//GEN-LAST:event_btnSortMouseClicked

    private void btnOpenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOpenMouseClicked
        try {
            engine.openDatabse(); 
            txtOutput.setText(engine.database.toString());
        } catch (NullPointerException error) {
            System.out.println("null error: " + error.toString());
        }
    }//GEN-LAST:event_btnOpenMouseClicked

    private void btnDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseClicked
        engine.deleteDatabase(); 
    }//GEN-LAST:event_btnDeleteMouseClicked

    private void btnSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseClicked
        engine.saveDatabase(); 
    }//GEN-LAST:event_btnSaveMouseClicked

    private void btnQuitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQuitMouseClicked
        engine.quit(); 
    }//GEN-LAST:event_btnQuitMouseClicked

    private void btnNewGameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNewGameMouseClicked
        String name = txtNewName.getText(); 
        String keyword = txtNewKeyword.getText(); 
        String author = txtNewAuthor.getText(); 
        String date = txtNewDate.getText();
        engine.newGame(name,keyword,author,date); 
        clearInputs();
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
    private javax.swing.JButton btnSort;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lblNewAuthor;
    private javax.swing.JLabel lblNewDate;
    private javax.swing.JLabel lblNewGame;
    private javax.swing.JLabel lblNewKeyword;
    private javax.swing.JLabel lblTitle;
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
     * Clears the output box and the database
     */
    private void clearDatabaseOutput() {
        try {
            engine.database.finalize();
        } catch (NullPointerException error) {
            JOptionPane.showMessageDialog(this, "list is null");
        }
        txtOutput.setText("");
    }

}
