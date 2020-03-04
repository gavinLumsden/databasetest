package jframes;

import videogamedatabase.ProgramEngine;

/**
 * @author g.lumsden
 */
public class SearchBy extends javax.swing.JFrame {

    // properties of the class
    private final int FORM_WIDTH = 550; 
    private final int FORM_HEIGHT = 200; 
    private ProgramEngine engine; 
    
    /**
     * Constructor for the class
     * 
     * @param engine 
     */
    public SearchBy(ProgramEngine engine) {
        initComponents();
        this.engine = engine; 
        engine.createJFrame(FORM_WIDTH, FORM_HEIGHT, this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnReleaseDate = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnAuthor = new javax.swing.JButton();
        btnKeyword = new javax.swing.JButton();
        btnName = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        btnReleaseDate.setText("Release Date");
        btnReleaseDate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReleaseDateMouseClicked(evt);
            }
        });
        getContentPane().add(btnReleaseDate);
        btnReleaseDate.setBounds(270, 80, 230, 30);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("What do you want to search by?");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 510, 40);

        btnAuthor.setText("Author");
        btnAuthor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAuthorMouseClicked(evt);
            }
        });
        getContentPane().add(btnAuthor);
        btnAuthor.setBounds(270, 40, 230, 30);

        btnKeyword.setText("Keyword");
        btnKeyword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnKeywordMouseClicked(evt);
            }
        });
        getContentPane().add(btnKeyword);
        btnKeyword.setBounds(10, 80, 250, 30);

        btnName.setText("Name");
        btnName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNameMouseClicked(evt);
            }
        });
        getContentPane().add(btnName);
        btnName.setBounds(10, 40, 250, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReleaseDateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReleaseDateMouseClicked
        engine.searchDatabase("date");
    }//GEN-LAST:event_btnReleaseDateMouseClicked

    private void btnAuthorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAuthorMouseClicked
        engine.searchDatabase("author");
    }//GEN-LAST:event_btnAuthorMouseClicked

    private void btnKeywordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKeywordMouseClicked
        engine.searchDatabase("keyword");
    }//GEN-LAST:event_btnKeywordMouseClicked

    private void btnNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNameMouseClicked
        engine.searchDatabase("name");
    }//GEN-LAST:event_btnNameMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAuthor;
    private javax.swing.JButton btnKeyword;
    private javax.swing.JButton btnName;
    private javax.swing.JButton btnReleaseDate;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

}
