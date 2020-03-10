package jframes;

import javax.swing.JOptionPane;

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
        txtProperty = new javax.swing.JTextArea();
        btnSort = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        txtProperty.setColumns(20);
        txtProperty.setRows(5);
        jScrollPane1.setViewportView(txtProperty);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(350, 10, 240, 40);

        btnSort.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnSort.setText("Sort");
        btnSort.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSortMouseClicked(evt);
            }
        });
        getContentPane().add(btnSort);
        btnSort.setBounds(600, 10, 180, 40);

        background.setBackground(new java.awt.Color(255, 153, 51));
        background.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        background.setText("What do you want to sort by?");
        background.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        background.setOpaque(true);
        getContentPane().add(background);
        background.setBounds(0, 0, 790, 60);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSortMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSortMouseClicked
        try {
            String text = txtProperty.getText(); 
            if (text.equals("")) JOptionPane.showMessageDialog(this, "property is bad");
            else ui.sortDatabase(text);
        } catch (NullPointerException error) {
            JOptionPane.showMessageDialog(this, "null error");
        }
        this.dispose();
    }//GEN-LAST:event_btnSortMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton btnSort;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtProperty;
    // End of variables declaration//GEN-END:variables

}
