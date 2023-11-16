package berlesapp;

import javax.swing.ImageIcon;

public class BerlesApp extends javax.swing.JFrame {
    int autoAlapAr = -1;
    int db = 1;
    int extrak;
    double vegsoAr;
    double tagsag;
    public BerlesApp() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        lblValaszthato = new javax.swing.JLabel();
        cmbValaszthatoAutok = new javax.swing.JComboBox<>();
        pnlTagsag = new javax.swing.JPanel();
        rdbTagsagNincs = new javax.swing.JRadioButton();
        rdbTagsagVan = new javax.swing.JRadioButton();
        pnlFizetendo = new javax.swing.JPanel();
        lblfizNap = new javax.swing.JLabel();
        lblFizFt = new javax.swing.JLabel();
        lblAr = new javax.swing.JLabel();
        numNap = new javax.swing.JSpinner();
        pnlExtrak = new javax.swing.JPanel();
        chbSzemely = new javax.swing.JCheckBox();
        chbBaleset = new javax.swing.JCheckBox();
        chbKülföld = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaOsszesito = new javax.swing.JTextArea();
        btnRendel = new javax.swing.JButton();
        lblOsszesito = new javax.swing.JLabel();
        lbKep = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PizzApp");
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        lblValaszthato.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblValaszthato.setText("Választható autók:");

        cmbValaszthatoAutok.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Suzuki Swift (ferdehátú)", "Fiat Panda (ferdehátú)", "Renault Laguna (szedán)", "Opel Astra H (kombi)", "Renault Master (Teherautó)" }));
        cmbValaszthatoAutok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbValaszthatoAutokActionPerformed(evt);
            }
        });

        pnlTagsag.setBorder(javax.swing.BorderFactory.createTitledBorder("Tagság"));

        buttonGroup1.add(rdbTagsagNincs);
        rdbTagsagNincs.setSelected(true);
        rdbTagsagNincs.setText("Nincs");
        rdbTagsagNincs.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rdbTagsagNincsStateChanged(evt);
            }
        });

        buttonGroup1.add(rdbTagsagVan);
        rdbTagsagVan.setText("Van");
        rdbTagsagVan.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rdbTagsagVanStateChanged(evt);
            }
        });

        javax.swing.GroupLayout pnlTagsagLayout = new javax.swing.GroupLayout(pnlTagsag);
        pnlTagsag.setLayout(pnlTagsagLayout);
        pnlTagsagLayout.setHorizontalGroup(
            pnlTagsagLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTagsagLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTagsagLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdbTagsagNincs, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdbTagsagVan, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(111, Short.MAX_VALUE))
        );
        pnlTagsagLayout.setVerticalGroup(
            pnlTagsagLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTagsagLayout.createSequentialGroup()
                .addComponent(rdbTagsagNincs)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdbTagsagVan)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlFizetendo.setBorder(javax.swing.BorderFactory.createTitledBorder("Fizetendő"));

        lblfizNap.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblfizNap.setText("Nap:");

        lblFizFt.setText("Ft");

        lblAr.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        numNap.setModel(new javax.swing.SpinnerNumberModel(1, 1, 7, 1));
        numNap.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                numNapStateChanged(evt);
            }
        });

        javax.swing.GroupLayout pnlFizetendoLayout = new javax.swing.GroupLayout(pnlFizetendo);
        pnlFizetendo.setLayout(pnlFizetendoLayout);
        pnlFizetendoLayout.setHorizontalGroup(
            pnlFizetendoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFizetendoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFizetendoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlFizetendoLayout.createSequentialGroup()
                        .addComponent(lblfizNap, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numNap, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(119, 119, 119))
                    .addGroup(pnlFizetendoLayout.createSequentialGroup()
                        .addComponent(lblAr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblFizFt, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39))))
        );
        pnlFizetendoLayout.setVerticalGroup(
            pnlFizetendoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFizetendoLayout.createSequentialGroup()
                .addGroup(pnlFizetendoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numNap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblfizNap))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlFizetendoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAr, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFizFt, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pnlExtrak.setBorder(javax.swing.BorderFactory.createTitledBorder("Extrák"));

        chbSzemely.setText("Személy biztosítás");
        chbSzemely.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                chbSzemelyStateChanged(evt);
            }
        });

        chbBaleset.setText("Baleset biztosítás");
        chbBaleset.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                chbBalesetStateChanged(evt);
            }
        });

        chbKülföld.setText("Külföldi út");
        chbKülföld.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                chbKülföldStateChanged(evt);
            }
        });

        javax.swing.GroupLayout pnlExtrakLayout = new javax.swing.GroupLayout(pnlExtrak);
        pnlExtrak.setLayout(pnlExtrakLayout);
        pnlExtrakLayout.setHorizontalGroup(
            pnlExtrakLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlExtrakLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlExtrakLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(chbSzemely, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                    .addComponent(chbBaleset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chbKülföld, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(142, Short.MAX_VALUE))
        );
        pnlExtrakLayout.setVerticalGroup(
            pnlExtrakLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlExtrakLayout.createSequentialGroup()
                .addComponent(chbSzemely)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chbBaleset)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chbKülföld)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txaOsszesito.setColumns(20);
        txaOsszesito.setRows(5);
        jScrollPane1.setViewportView(txaOsszesito);

        btnRendel.setText("Megrendelem");

        lblOsszesito.setText("Összestő:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblOsszesito, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblValaszthato, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbValaszthatoAutok, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(pnlTagsag, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(pnlFizetendo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnRendel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(pnlExtrak, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbKep, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 19, Short.MAX_VALUE))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnRendel, cmbValaszthatoAutok, pnlFizetendo, pnlTagsag});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblValaszthato)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbValaszthatoAutok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlTagsag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlFizetendo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRendel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(pnlExtrak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(lbKep, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(2, 2, 2)
                .addComponent(lblOsszesito)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmbValaszthatoAutokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbValaszthatoAutokActionPerformed
        osszesito();
        fizetendo();
        kep();
    }//GEN-LAST:event_cmbValaszthatoAutokActionPerformed

    private void rdbTagsagNincsStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rdbTagsagNincsStateChanged
        fizetendo();
        osszesito();
    }//GEN-LAST:event_rdbTagsagNincsStateChanged

    private void rdbTagsagVanStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rdbTagsagVanStateChanged
        fizetendo();
        osszesito();
    }//GEN-LAST:event_rdbTagsagVanStateChanged

    private void chbSzemelyStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_chbSzemelyStateChanged
        fizetendo();
        osszesito();
    }//GEN-LAST:event_chbSzemelyStateChanged

    private void chbBalesetStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_chbBalesetStateChanged
        fizetendo();
        osszesito();
    }//GEN-LAST:event_chbBalesetStateChanged

    private void numNapStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_numNapStateChanged
        fizetendo();
        osszesito();
    }//GEN-LAST:event_numNapStateChanged

    private void chbKülföldStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_chbKülföldStateChanged
        fizetendo();
        osszesito();
    }//GEN-LAST:event_chbKülföldStateChanged

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BerlesApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BerlesApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BerlesApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BerlesApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BerlesApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRendel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox chbBaleset;
    private javax.swing.JCheckBox chbKülföld;
    private javax.swing.JCheckBox chbSzemely;
    private javax.swing.JComboBox<String> cmbValaszthatoAutok;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbKep;
    private javax.swing.JLabel lblAr;
    private javax.swing.JLabel lblFizFt;
    private javax.swing.JLabel lblOsszesito;
    private javax.swing.JLabel lblValaszthato;
    private javax.swing.JLabel lblfizNap;
    private javax.swing.JSpinner numNap;
    private javax.swing.JPanel pnlExtrak;
    private javax.swing.JPanel pnlFizetendo;
    private javax.swing.JPanel pnlTagsag;
    private javax.swing.JRadioButton rdbTagsagNincs;
    private javax.swing.JRadioButton rdbTagsagVan;
    private javax.swing.JTextArea txaOsszesito;
    // End of variables declaration//GEN-END:variables

            
    private void fizetendo() {
        tagsag();
        extrak();
        autoAlapAr();
        darabszam();
                
        vegsoAr = autoAlapAr() * tagsag() + extrak();
        vegsoAr *= darabszam();
        
        lblAr.setText(String.format("%.0f", vegsoAr));
    }

    private int extrak() {
        int ar = 0;
        if (chbSzemely.isSelected() == true){
        ar += 5000;
        }
        if (chbKülföld.isSelected()) {
            ar += 2000;
        }
        if (chbBaleset.isSelected()) {
            ar += 5000;
        }
        return ar;
    }

    private double tagsag() {
        double tagsagAr = 1;
        if (rdbTagsagVan.isSelected()) {
            tagsagAr *= 0.75;
        }
        return tagsagAr;
    }

    private int autoAlapAr() {
        int ar = 0;
        int autoIndex = cmbValaszthatoAutok.getSelectedIndex();
        
        switch (autoIndex) {
            case 0:
                ar = 5000;
                break;
            case 1:
                ar = 5000;
                break;
            case 2:
                ar = 5000;
                break;
            case 3:
                ar = 5000;
                break;
            default:
                break;
            case 4:
                ar = 6000;
                break;
        }
        return ar ;
    }

    private int darabszam() {
        int segitdb = 1;
        int darab = (int) numNap.getValue();
        return segitdb * darab;
    }

    private void osszesito() {
        String leiras = "";
        Tagsag();
        int darab = (int) numNap.getValue();
        ValasztottAuto();
        ValasztottExtra();
        txaOsszesito.setText("");
        
        leiras += "A választott autó: " + ValasztottAuto() + " ";
        leiras += "(" + darab + " nap)\n";
        leiras += "Tagság: " + Tagsag() + "\n";
        leiras += "Extrák:\n" + ValasztottExtra();
        
        txaOsszesito.setText(leiras);
                
    }

    private String Tagsag() {
        String tagsag = "Nincs";
        if(rdbTagsagVan.isSelected()){
             tagsag = "Van";
        }
        return tagsag;
    }

    private String ValasztottAuto() {
        String auto = "";
        int kivalasztottAuto = cmbValaszthatoAutok.getSelectedIndex();
        switch (kivalasztottAuto) {
            case 0 :
                auto = "Suzuki Swift (ferdehátú)";
                break;
            case 1 :
                auto = "Fiat Panda (ferdehátú)";
                break;
            case 2 :
                auto = "Renault Laguna (szedán)";
                break;
            case 3 :
                auto = "Opel Astra H (kombi)";
                break;
            case 4 :
                auto = "Renault Master (Teherautó)";
                break;





                
    };
        return auto;
}

    private String ValasztottExtra() {
        String feltet = "";
        boolean kulfoldKivalasztva = chbKülföld.isSelected() == true;
        boolean szemelyKivalasztva = chbSzemely.isSelected() == true;
        boolean balesetKivalasztva = chbBaleset.isSelected() == true;
        if (kulfoldKivalasztva) {
            feltet += " - Külföldi út";
            if (szemelyKivalasztva && balesetKivalasztva) {
                feltet += "\n - Személy biztosítás\n - Baleset biztosítás";
            }
            else if (szemelyKivalasztva) {
                feltet += "\n - Személy biztosítás";
            }
            else if (balesetKivalasztva) {
                feltet += "\n - Baleset biztosítás";
            }
        }
        else if (szemelyKivalasztva) {
            feltet += " - Személy biztosítás";
            if (balesetKivalasztva) {
                feltet += "\n - Baleset biztosítás";
            }
        }
        else if (balesetKivalasztva) {
            feltet += " - Baleset biztosítás";
        }
        return feltet;}

    private void kep() {
    ImageIcon icon = new ImageIcon("swift.png");
    int kivalasztottAuto = cmbValaszthatoAutok.getSelectedIndex();
    if (kivalasztottAuto == 0){
            icon = new ImageIcon("swift.png");
            lbKep.setIcon(icon);
    }

            
    }
    }

