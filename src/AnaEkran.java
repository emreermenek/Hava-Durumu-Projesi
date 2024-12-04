
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author emree
 */
public class AnaEkran extends javax.swing.JFrame {
    Database database = new Database();
  

    /**
     * Creates new form AnaEkran
     */
    public AnaEkran() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        gunCB = new javax.swing.JComboBox<>();
        ayCB = new javax.swing.JComboBox<>();
        yilCB = new javax.swing.JComboBox<>();
        aramaButonu = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablo = new javax.swing.JTable();
        mesajAlani = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(500, 400, 0, 0));

        jLabel1.setText("Hava Durumunu Öğrenmek İstediğiniz Tarihi Giriniz : ");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Gün");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Ay");

        gunCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gunCBActionPerformed(evt);
            }
        });

        yilCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        yilCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yilCBActionPerformed(evt);
            }
        });

        aramaButonu.setText("Ara");
        aramaButonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aramaButonuActionPerformed(evt);
            }
        });

        jLabel5.setText("Yıl");

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        tablo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Maximum Temperature", "Minimum Temperature", "Average Temperature", "Average Humidity", "Maximum Wind Speed", "Average Visibility", "Rain Possibility", "Snow Possibility", "Sunrise", "Sunset", "Last Update Date", "Current Temperature", "Current State", "Current Wind", "Current Humidity", "Current Feeled Temperature", "Current UV Light"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablo.setToolTipText("");
        tablo.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tablo.setPreferredSize(new java.awt.Dimension(500, 0));
        jScrollPane2.setViewportView(tablo);
        if (tablo.getColumnModel().getColumnCount() > 0) {
            tablo.getColumnModel().getColumn(0).setResizable(false);
            tablo.getColumnModel().getColumn(0).setPreferredWidth(150);
            tablo.getColumnModel().getColumn(1).setResizable(false);
            tablo.getColumnModel().getColumn(1).setPreferredWidth(600);
            tablo.getColumnModel().getColumn(2).setResizable(false);
            tablo.getColumnModel().getColumn(3).setResizable(false);
            tablo.getColumnModel().getColumn(3).setPreferredWidth(600);
            tablo.getColumnModel().getColumn(4).setResizable(false);
            tablo.getColumnModel().getColumn(4).setPreferredWidth(600);
            tablo.getColumnModel().getColumn(5).setResizable(false);
            tablo.getColumnModel().getColumn(5).setPreferredWidth(700);
            tablo.getColumnModel().getColumn(6).setResizable(false);
            tablo.getColumnModel().getColumn(6).setPreferredWidth(600);
            tablo.getColumnModel().getColumn(7).setResizable(false);
            tablo.getColumnModel().getColumn(7).setPreferredWidth(600);
            tablo.getColumnModel().getColumn(8).setResizable(false);
            tablo.getColumnModel().getColumn(8).setPreferredWidth(600);
            tablo.getColumnModel().getColumn(9).setResizable(false);
            tablo.getColumnModel().getColumn(9).setPreferredWidth(400);
            tablo.getColumnModel().getColumn(10).setResizable(false);
            tablo.getColumnModel().getColumn(10).setPreferredWidth(400);
            tablo.getColumnModel().getColumn(11).setResizable(false);
            tablo.getColumnModel().getColumn(11).setPreferredWidth(500);
            tablo.getColumnModel().getColumn(12).setResizable(false);
            tablo.getColumnModel().getColumn(12).setPreferredWidth(600);
            tablo.getColumnModel().getColumn(13).setResizable(false);
            tablo.getColumnModel().getColumn(13).setPreferredWidth(600);
            tablo.getColumnModel().getColumn(14).setResizable(false);
            tablo.getColumnModel().getColumn(14).setPreferredWidth(600);
            tablo.getColumnModel().getColumn(15).setResizable(false);
            tablo.getColumnModel().getColumn(15).setPreferredWidth(600);
            tablo.getColumnModel().getColumn(16).setResizable(false);
            tablo.getColumnModel().getColumn(16).setPreferredWidth(600);
            tablo.getColumnModel().getColumn(17).setResizable(false);
            tablo.getColumnModel().getColumn(17).setPreferredWidth(500);
        }

        jButton1.setText("Eldeki Tüm Verileri Göster");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 647, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(302, 302, 302)
                                .addComponent(gunCB, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ayCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(yilCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(aramaButonu, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(mesajAlani, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(28, 28, 28)
                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(18, 18, 18))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gunCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ayCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yilCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aramaButonu))
                .addGap(5, 5, 5)
                .addComponent(mesajAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void yilCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yilCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yilCBActionPerformed

    private void aramaButonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aramaButonuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aramaButonuActionPerformed

    private void gunCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gunCBActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_gunCBActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tablo.getModel();
        model.setRowCount(0);
        ArrayList<WeatherData> list = new ArrayList<>();
        list = database.getAllData();
        for(WeatherData data : list){
            Object[] eklenecek = {data.getDate(), data.getMaxTemp(), data.getMinTemp(), data.getAvgTemp(), data.getAvgHumidity(), data.getMaxWindSpeed(), data.getAvgVis(), data.getWillItRain(), data.getWillItSnow(), data.getSunrise(), data.getSunset(), data.getLastUpdate(), data.getCurrTemp(), data.getCurrState(), data.getCurrWind(), data.getCurrHumidity(), data.getCurrFeeledTemp(), data.getCurrUV()};
            model.addRow(eklenecek);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(AnaEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AnaEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AnaEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AnaEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AnaEkran().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aramaButonu;
    private javax.swing.JComboBox<String> ayCB;
    private javax.swing.JComboBox<String> gunCB;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel mesajAlani;
    private javax.swing.JTable tablo;
    private javax.swing.JComboBox<String> yilCB;
    // End of variables declaration//GEN-END:variables
}