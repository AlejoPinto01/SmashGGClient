package psp.smashggclient.frames;

import com.fasterxml.jackson.core.JsonProcessingException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.UIManager;
import psp.smashggclient.apiclient.ApiClient;
import psp.smashggclient.models.Player;
import psp.smashggclient.models.scoreboard.Caster;
import psp.smashggclient.models.scoreboard.Converter;
import psp.smashggclient.models.scoreboard.PlayerScoreboard;
import psp.smashggclient.models.scoreboard.ScoreboardData;
import psp.smashggclient.util.ImageUtils;

public class MainFrame extends javax.swing.JFrame {

    String tournamentSlug = "";

    ApiClient api = new ApiClient();
    ImageUtils imageUtils = new ImageUtils();

    boolean grandFinal = false;
    boolean winnersBracket = true;
    boolean bo3 = true;

    int score1 = 0;
    int score2 = 0;

    ArrayList<String> characters;
    JComboBox cmbPlayers1 = new JComboBox<Player>();
    JComboBox cmbPlayers2 = new JComboBox<Player>();

    public MainFrame() {
        initComponents();
        setLocationRelativeTo(null);
        characters = new ArrayList<>();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new java.awt.Label();
        lblChar1 = new javax.swing.JLabel();
        cmbChar1 = new javax.swing.JComboBox<>();
        scrPlayer1 = new javax.swing.JScrollPane();
        lblVS = new javax.swing.JLabel();
        lblChar2 = new javax.swing.JLabel();
        cmbChar2 = new javax.swing.JComboBox<>();
        scrPlayer2 = new javax.swing.JScrollPane();
        chkL2 = new javax.swing.JCheckBox();
        chkL1 = new javax.swing.JCheckBox();
        lblL2 = new javax.swing.JLabel();
        lblL1 = new javax.swing.JLabel();
        lblSwitch = new javax.swing.JLabel();
        separator = new javax.swing.JSeparator();
        txtCaster1 = new javax.swing.JTextField();
        txtCaster2 = new javax.swing.JTextField();
        lblMic = new javax.swing.JLabel();
        txtTwitter1 = new javax.swing.JTextField();
        txtTwitter2 = new javax.swing.JTextField();
        lblTwitter = new javax.swing.JLabel();
        btnRound = new javax.swing.JButton();
        cmbRound = new javax.swing.JComboBox<>();
        spnRound = new javax.swing.JSpinner();
        lblBo = new javax.swing.JButton();
        lblSave = new javax.swing.JLabel();
        lblReset = new javax.swing.JLabel();
        lblSettings = new javax.swing.JLabel();
        lblScore1 = new javax.swing.JLabel();
        btnMinus1 = new javax.swing.JButton();
        btnPlus1 = new javax.swing.JButton();
        lblScore2 = new javax.swing.JLabel();
        btnMinus2 = new javax.swing.JButton();
        btnPlus2 = new javax.swing.JButton();

        label1.setText("label1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lblChar1.setBackground(new java.awt.Color(255, 255, 255));
        lblChar1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        cmbChar1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbChar1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbChar1ItemStateChanged(evt);
            }
        });

        lblVS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_head_to_head_48px.png"))); // NOI18N

        cmbChar2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbChar2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbChar2ItemStateChanged(evt);
            }
        });

        chkL2.setEnabled(false);

        chkL1.setEnabled(false);

        lblL2.setText("[L]");
        lblL2.setEnabled(false);

        lblL1.setText("[L]");
        lblL1.setEnabled(false);

        lblSwitch.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSwitch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_resize_horizontal_48px.png"))); // NOI18N
        lblSwitch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSwitchMouseClicked(evt);
            }
        });

        txtCaster1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        lblMic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_microphone_24px.png"))); // NOI18N

        txtTwitter1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        lblTwitter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTwitter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_twitter_squared_24px.png"))); // NOI18N

        btnRound.setText("Winners");
        btnRound.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRoundActionPerformed(evt);
            }
        });

        cmbRound.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Round", "Semis", "Quarters", "Grand Final" }));
        cmbRound.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbRoundItemStateChanged(evt);
            }
        });

        spnRound.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        lblBo.setText("Bo3");
        lblBo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblBoActionPerformed(evt);
            }
        });

        lblSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_save_48px.png"))); // NOI18N
        lblSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSaveMouseClicked(evt);
            }
        });

        lblReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_waste_48px.png"))); // NOI18N
        lblReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblResetMouseClicked(evt);
            }
        });

        lblSettings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_settings_48px.png"))); // NOI18N
        lblSettings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSettingsMouseClicked(evt);
            }
        });

        lblScore1.setFont(new java.awt.Font("Segoe UI", 1, 55)); // NOI18N
        lblScore1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblScore1.setText("0");

        btnMinus1.setText("-");
        btnMinus1.setFocusable(false);
        btnMinus1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinus1ActionPerformed(evt);
            }
        });

        btnPlus1.setText("+");
        btnPlus1.setFocusable(false);
        btnPlus1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlus1ActionPerformed(evt);
            }
        });

        lblScore2.setFont(new java.awt.Font("Segoe UI", 1, 55)); // NOI18N
        lblScore2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblScore2.setText("0");

        btnMinus2.setText("-");
        btnMinus2.setFocusable(false);
        btnMinus2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinus2ActionPerformed(evt);
            }
        });

        btnPlus2.setText("+");
        btnPlus2.setFocusable(false);
        btnPlus2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlus2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(separator)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblChar1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(scrPlayer1)
                                        .addComponent(cmbChar1, 0, 200, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblL1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(chkL1)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblVS)
                                    .addComponent(lblSwitch))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(chkL2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblL2)
                                        .addGap(19, 19, 19)
                                        .addComponent(lblScore2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(scrPlayer2)
                                        .addComponent(cmbChar2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnRound, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                                    .addComponent(lblScore1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cmbRound, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(spnRound, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblBo, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(181, 181, 181))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnMinus1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnPlus1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnMinus2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnPlus2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblChar2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtCaster1, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCaster2, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtTwitter1, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTwitter, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTwitter2, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblSettings, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblReset, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSave, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblChar2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblChar1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(scrPlayer1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbChar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(scrPlayer2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmbChar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(lblVS, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblSwitch)
                                .addGap(8, 8, 8)
                                .addComponent(lblBo))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblL2, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblL1, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addComponent(chkL1)
                                    .addComponent(chkL2)
                                    .addComponent(lblScore2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblScore1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnMinus1)
                            .addComponent(btnPlus1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnMinus2)
                                .addComponent(btnPlus2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRound)
                            .addComponent(cmbRound, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spnRound, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(separator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCaster1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCaster2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMic))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTwitter1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTwitter2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTwitter))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSave, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblReset, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSettings, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        openSettings();
    }//GEN-LAST:event_formWindowOpened

    private void cmbChar1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbChar1ItemStateChanged
        String selectedChar = (String) cmbChar1.getSelectedItem();
        setCharacterImage(lblChar1, selectedChar);
    }//GEN-LAST:event_cmbChar1ItemStateChanged

    private void cmbChar2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbChar2ItemStateChanged
        String selectedChar = (String) cmbChar2.getSelectedItem();
        setCharacterImage(lblChar2, selectedChar);
    }//GEN-LAST:event_cmbChar2ItemStateChanged

    private void cmbRoundItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbRoundItemStateChanged
        roundChanged();
    }//GEN-LAST:event_cmbRoundItemStateChanged

    private void btnRoundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRoundActionPerformed
        winnersBracket = !winnersBracket;
        btnRound.setText(winnersBracket ? "Winners" : "Losers");
    }//GEN-LAST:event_btnRoundActionPerformed

    private void lblBoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblBoActionPerformed
        bo3 = !bo3;
        lblBo.setText(bo3 ? "Bo3" : "Bo5");
        if (bo3) {
            updateScores();
        }
    }//GEN-LAST:event_lblBoActionPerformed

    private void lblSettingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSettingsMouseClicked
        openSettings();
    }//GEN-LAST:event_lblSettingsMouseClicked

    private void lblSwitchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSwitchMouseClicked
        swapPlayers();
    }//GEN-LAST:event_lblSwitchMouseClicked

    private void btnMinus1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinus1ActionPerformed
        score1--;
        updateScores();
    }//GEN-LAST:event_btnMinus1ActionPerformed

    private void btnPlus1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlus1ActionPerformed
        score1++;
        updateScores();
    }//GEN-LAST:event_btnPlus1ActionPerformed

    private void btnMinus2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinus2ActionPerformed
        score2--;
        updateScores();
    }//GEN-LAST:event_btnMinus2ActionPerformed

    private void btnPlus2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlus2ActionPerformed
        score2++;
        updateScores();
    }//GEN-LAST:event_btnPlus2ActionPerformed

    private void lblResetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblResetMouseClicked
        reset();
    }//GEN-LAST:event_lblResetMouseClicked

    private void lblSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSaveMouseClicked
        save();
    }//GEN-LAST:event_lblSaveMouseClicked

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
    private javax.swing.JButton btnMinus1;
    private javax.swing.JButton btnMinus2;
    private javax.swing.JButton btnPlus1;
    private javax.swing.JButton btnPlus2;
    private javax.swing.JButton btnRound;
    private javax.swing.JCheckBox chkL1;
    private javax.swing.JCheckBox chkL2;
    private javax.swing.JComboBox<String> cmbChar1;
    private javax.swing.JComboBox<String> cmbChar2;
    private javax.swing.JComboBox<String> cmbRound;
    private java.awt.Label label1;
    private javax.swing.JButton lblBo;
    private javax.swing.JLabel lblChar1;
    private javax.swing.JLabel lblChar2;
    private javax.swing.JLabel lblL1;
    private javax.swing.JLabel lblL2;
    private javax.swing.JLabel lblMic;
    private javax.swing.JLabel lblReset;
    private javax.swing.JLabel lblSave;
    private javax.swing.JLabel lblScore1;
    private javax.swing.JLabel lblScore2;
    private javax.swing.JLabel lblSettings;
    private javax.swing.JLabel lblSwitch;
    private javax.swing.JLabel lblTwitter;
    private javax.swing.JLabel lblVS;
    private javax.swing.JScrollPane scrPlayer1;
    private javax.swing.JScrollPane scrPlayer2;
    private javax.swing.JSeparator separator;
    private javax.swing.JSpinner spnRound;
    private javax.swing.JTextField txtCaster1;
    private javax.swing.JTextField txtCaster2;
    private javax.swing.JTextField txtTwitter1;
    private javax.swing.JTextField txtTwitter2;
    // End of variables declaration//GEN-END:variables

    private void loadCharacters() {
        File f = new File("src/main/resources/Stream Tool/Resources/Characters/Portraits");
        String[] pathnames;

        pathnames = f.list();

        for (String pathname : pathnames) {
            characters.add(pathname);
        }
        System.out.println(characters);
        loadCharComboboxes();
    }

    private void loadCharComboboxes() {
        DefaultComboBoxModel dcbm1 = new DefaultComboBoxModel();
        for (String character : characters) {
            dcbm1.addElement(character);
        }
        cmbChar1.setModel(dcbm1);

        DefaultComboBoxModel dcbm2 = new DefaultComboBoxModel();
        for (String character : characters) {
            dcbm2.addElement(character);
        }
        cmbChar2.setModel(dcbm2);
    }

    private void loadPlayers() {
        scrPlayer1.setViewportView(cmbPlayers1);
        scrPlayer2.setViewportView(cmbPlayers2);
        ArrayList<Player> players = new ArrayList<>();
        try {
            players = api.getPlayers(tournamentSlug);
        } catch (IOException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        DefaultComboBoxModel dcbm1 = new DefaultComboBoxModel<Player>();
        for (Player player : players) {
            dcbm1.addElement(player);
        }
        cmbPlayers1.setModel(dcbm1);

        DefaultComboBoxModel dcbm2 = new DefaultComboBoxModel<Player>();
        for (Player player : players) {
            dcbm2.addElement(player);
        }
        cmbPlayers2.setModel(dcbm2);
    }

    private void setCharacterImage(JLabel lbl, String selectedChar) {
        String imagePath = "src/main/resources/Stream Tool/Resources/Characters/Portraits/";
        imagePath = imagePath + selectedChar + "/" + selectedChar + "1.png";
        imageUtils.setLabelIconImage(lbl, imagePath);
    }

    private void roundChanged() {
        String roundString = cmbRound.getSelectedItem().toString();
        grandFinal = roundString.equals("Grand Final");
        chkL1.setEnabled(grandFinal);
        chkL1.setSelected(false);
        chkL2.setEnabled(grandFinal);
        chkL2.setSelected(false);
        lblL1.setEnabled(grandFinal);
        lblL2.setEnabled(grandFinal);
        btnRound.setEnabled(!grandFinal);

        spnRound.setEnabled(roundString.equals("Round"));
    }

    private void loadData() {
        loadCharacters();
        loadPlayers();
        setCharacterImage(lblChar1, "random");
        setCharacterImage(lblChar2, "random");
    }

    private void openSettings() {
        SettingsDialog sd = new SettingsDialog(this, true);
        sd.setVisible(true);
        loadData();
    }

    private void swapPlayers() {
        int auxChar = cmbChar1.getSelectedIndex();
        cmbChar1.setSelectedIndex(cmbChar2.getSelectedIndex());
        cmbChar2.setSelectedIndex(auxChar);

        int auxPlayer = cmbPlayers1.getSelectedIndex();
        cmbPlayers1.setSelectedIndex(cmbPlayers2.getSelectedIndex());
        cmbPlayers2.setSelectedIndex(auxPlayer);

        int auxScore = score1;
        score1 = score2;
        score2 = auxScore;
        updateScores();
    }

    private void updateScores() {
        int max = bo3 ? 2 : 3;
        if (score1 > max) {
            score1 = max;
        }
        if (score2 > max) {
            score2 = max;
        }
        if (score1 < 0) {
            score1 = 0;
        }
        if (score2 < 0) {
            score2 = 0;
        }
        lblScore1.setText("" + score1);
        lblScore2.setText("" + score2);
    }

    private void reset() {
        score1 = 0;
        score2 = 0;
        cmbChar1.setSelectedItem("Random");
        cmbChar2.setSelectedItem("Random");
        updateScores();
    }

    private void save() {
        List<PlayerScoreboard> playersScoreoard = new ArrayList<>();

        PlayerScoreboard player1 = new PlayerScoreboard();
        Player player1data = (Player) cmbPlayers1.getSelectedItem();

        player1.setCharacter(cmbChar1.getSelectedItem().toString());
        player1.setSkin(cmbChar1.getSelectedItem().toString() + "1");
        player1.setName(player1data.getGamerTag());
        player1.setTag(player1data.getPrefix());

        PlayerScoreboard player2 = new PlayerScoreboard();
        Player player2data = (Player) cmbPlayers2.getSelectedItem();

        player2.setCharacter(cmbChar2.getSelectedItem().toString());
        player2.setSkin(cmbChar2.getSelectedItem().toString() + "1");
        player2.setName(player2data.getGamerTag());
        player2.setTag(player2data.getPrefix());

        playersScoreoard.add(player1);
        playersScoreoard.add(player2);

        Caster caster1 = new Caster();
        caster1.setName(txtCaster1.getText());
        caster1.setTwitter(txtTwitter1.getText());

        Caster caster2 = new Caster();
        caster2.setName(txtCaster2.getText());
        caster2.setTwitter(txtTwitter2.getText());

        List<Caster> casters = new ArrayList<>();
        casters.add(caster1);
        casters.add(caster2);

        List<Long> scores = new ArrayList<>();
        scores.add(Long.valueOf(score1));
        scores.add(Long.valueOf(score2));

        List<String> wl = new ArrayList<>();
        wl.add(grandFinal ? chkL1.isSelected() ? "L" : "W" : "Nada");
        wl.add(grandFinal ? chkL2.isSelected() ? "L" : "W" : "Nada");
        
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        
        List<String> teamNames = new ArrayList<>();
        teamNames.add("");
        teamNames.add("");

        ScoreboardData data = new ScoreboardData();

        data.setBestOf(btnRound.getText());
        data.setRound(buildRoundString());
        data.setPlayer(playersScoreoard);
        data.setCaster(casters);
        data.setTournamentName(tournamentSlug);
        data.setGamemode(1);
        data.setScore(scores);
        data.setWl(wl);
        data.setColor(colors);
        data.setTeamName(teamNames);

        try {
            System.out.println(Converter.toJsonString(data));
        } catch (JsonProcessingException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private String buildRoundString() {
        if (grandFinal) {
            return cmbRound.getSelectedItem().toString();
        } else if (cmbRound.getSelectedItem().toString().equals("Round")) {
            return btnRound.getText() + " Round " + spnRound.getValue().toString();
        } else {
            return btnRound.getText() + " " + cmbRound.getSelectedItem().toString();
        }
    }
}
/*
Entrants in event
https://api.smash.gg/event/667569?expand[]=entrants

Player details
https://api.smash.gg/player/{id}
 */
