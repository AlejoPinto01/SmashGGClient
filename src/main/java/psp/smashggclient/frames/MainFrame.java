package psp.smashggclient.frames;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import psp.smashggclient.apiclient.ApiClient;
import psp.smashggclient.models.Entrant;
import psp.smashggclient.models.Image;
import psp.smashggclient.models.Player;
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

        label1 = new java.awt.Label();
        txtSlug = new javax.swing.JTextField();
        btnGetTournament = new javax.swing.JButton();
        lblTournamentName = new javax.swing.JLabel();
        lblTournamentEntrants = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        label1.setText("label1");

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

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

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
                            .addComponent(lblTournamentEntrants, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(137, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGetTournamentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetTournamentActionPerformed
//Tournament t = new Tournament();
//        try {
//            //t = Converter.fromJsonString(api.getTournamentJson("super-charge-shot-series"));
//            System.out.println(api.getPlayerDetailsJson(143842));
//        } catch (IOException ex) {
//            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
//        }
//System.out.println(t);
//System.out.println(api.getEventEntrantsJson((int) t.getEntities().getEvent().get(0).getID()));

        ApiClient api = new ApiClient();
        try {
            ArrayList<Player> players = api.getPlayers("super-charge-shot-series");
            
            for (Player p : players) {
                //System.out.println(p.getGamerTag());
            }
            
            ArrayList<Entrant> entrants = api.getEntrants("super-charge-shot-series");
            
            System.out.println("Ranking Ladder");
            for (Entrant e : entrants) {
                if (e.getEventID() == 667569)
                System.out.println(e.getName() + ", posisció " + e.getFinalPlacement());
            }
        } catch (IOException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private java.awt.Label label1;
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
