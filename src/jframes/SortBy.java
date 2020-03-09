package jframes;

import javax.swing.JOptionPane;
import videogamedatabase.ProgramEngine;

/**
 * @author g.lumsden
 */
public class SortBy extends javax.swing.JFrame {

    // properties of the class
    private final int FORM_WIDTH = 800;
    private final int FORM_HEIGHT = 60;
    private MainUI ui;
    
    /**
     * Constructor for the class
     * 
     * @param ui
     */
    public SortBy(MainUI ui) {
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
        jScrollPane1.setBounds(350, 10, 240, 40);

        btnSearch.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnSearch.setText("Sort");
        btnSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSearchMouseClicked(evt);
            }
        });
        getContentPane().add(btnSearch);
        btnSearch.setBounds(600, 10, 180, 40);

        background.setBackground(new java.awt.Color(255, 153, 51));
        background.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        background.setText("What do you want to sort by?");
        background.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        background.setOpaque(true);
        getContentPane().add(background);
        background.setBounds(0, 0, 790, 60);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchMouseClicked
        try {
            if (!txtKeyword.getText().equalsIgnoreCase("") || 
                !txtKeyword.getText().equalsIgnoreCase("name") || 
                !txtKeyword.getText().equalsIgnoreCase("keyword") || 
                !txtKeyword.getText().equalsIgnoreCase("author") || 
                !txtKeyword.getText().equalsIgnoreCase("release date")) JOptionPane.showMessageDialog(this, "Please enter a correct property to sort by");
            else ui.sortDatabase(txtKeyword.getText());
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
