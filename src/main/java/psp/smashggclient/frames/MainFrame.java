package psp.smashggclient.frames;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import psp.smashggclient.apiclient.ApiClient;
//import psp.smashggclient.models.Converter;
//import psp.smashggclient.models.Tournament;
//import psp.smashggclient.models.player.Player;

public class MainFrame extends javax.swing.JFrame {

    public MainFrame() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtSlug = new javax.swing.JTextField();
        btnGetTournament = new javax.swing.JButton();
        lblTournamentName = new javax.swing.JLabel();
        lblTournamentEntrants = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtSlug.setText("super-charge-shot-series");

        btnGetTournament.setText("Get tournament");
        btnGetTournament.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetTournamentActionPerformed(evt);
            }
        });

        lblTournamentName.setText("Tournament name");

        lblTournamentEntrants.setText("Entrants");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtSlug)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGetTournament))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTournamentName)
                            .addComponent(lblTournamentEntrants, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 29, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSlug, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGetTournament))
                .addGap(18, 18, 18)
                .addComponent(lblTournamentName)
                .addGap(18, 18, 18)
                .addComponent(lblTournamentEntrants)
                .addContainerGap(204, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGetTournamentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetTournamentActionPerformed
        ApiClient api = new ApiClient();
        //Tournament t = new Tournament();
//        try {
//            //t = Converter.fromJsonString(api.getTournamentJson("super-charge-shot-series"));
//            System.out.println(api.getPlayerDetailsJson(143842));
//        } catch (IOException ex) {
//            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
//        }
        //System.out.println(t);
        //System.out.println(api.getEventEntrantsJson((int) t.getEntities().getEvent().get(0).getID()));
    }//GEN-LAST:event_btnGetTournamentActionPerformed

    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        try {
            UIManager.setLookAndFeel("swing.defaultlaf=com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGetTournament;
    private javax.swing.JLabel lblTournamentEntrants;
    private javax.swing.JLabel lblTournamentName;
    private javax.swing.JTextField txtSlug;
    // End of variables declaration//GEN-END:variables
}
/*
Entrants in event
https://api.smash.gg/event/667569?expand[]=entrants

Player details
https://api.smash.gg/player/{id}
*/