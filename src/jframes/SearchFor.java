package jframes;

import javax.swing.JOptionPane;
import videogamedatabase.ProgramEngine;

/**
 * @author g.lumsden
 */
public class SearchFor extends javax.swing.JFrame {

    // properties of the class
    private final int FORM_WIDTH = 850;
    private final int FORM_HEIGHT = 40;
    private MainUI ui;
    public String keyword; 

    /**
     * Constructor for the class
     * 
     * @param ui
     */
    public SearchFor(MainUI ui) {
        initComponents();
        this.ui = ui;
        ui.engine.createJFrame(FORM_WIDTH, FORM_HEIGHT, this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtKeyword = new javax.swing.JTextArea();
        btnSearch = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        txtKeyword.setColumns(20);
        txtKeyword.setRows(5);
        jScrollPane1.setViewportView(txtKeyword);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(410, 10, 240, 40);

        btnSearch.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSearchMouseClicked(evt);
            }
        });
        getContentPane().add(btnSearch);
        btnSearch.setBounds(660, 10, 180, 40);

        background.setBackground(new java.awt.Color(51, 255, 255));
        background.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        background.setText("Enter the keyword to search with:");
        background.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        background.setOpaque(true);
        getContentPane().add(background);
        background.setBounds(0, 0, 860, 60);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchMouseClicked
        try {
            if (txtKeyword.getText().equals("")) JOptionPane.showMessageDialog(this, "Please enter something");
            else ui.searchDatabase(txtKeyword.getText());
        } catch (NullPointerException error) {
            JOptionPane.showMessageDialog(this, "Please enter something");
        }
        this.dispose();
    }//GEN-LAST:event_btnSearchMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton btnSearch;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtKeyword;
    // End of variables declaration//GEN-END:variables

}
