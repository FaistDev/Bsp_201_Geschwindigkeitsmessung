
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ben
 */
public class VelocityDlg extends javax.swing.JDialog {

    private Measurement object;
    private boolean check=false;

    public Measurement getObject() {
        return object;
    }

    public boolean isCheck() {
        return check;
    }
    
    
    /**
     * Creates new form VelocityDlg
     */
    public VelocityDlg(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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
        etDate = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        etTime = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        etKennzeichen = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        etGemessen = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        etErlaubt = new javax.swing.JTextField();
        btConfirm = new javax.swing.JButton();
        btCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(6, 2));

        jLabel1.setText("Datum");
        getContentPane().add(jLabel1);

        etDate.setText("04.05.2018");
        getContentPane().add(etDate);

        jLabel2.setText("Uhrzeit");
        getContentPane().add(jLabel2);

        etTime.setText("14:15");
        getContentPane().add(etTime);

        jLabel3.setText("Kennzeichen");
        getContentPane().add(jLabel3);

        etKennzeichen.setText("DL 658 LO");
        getContentPane().add(etKennzeichen);

        jLabel4.setText("V-Gemessen");
        getContentPane().add(jLabel4);

        etGemessen.setText("50");
        getContentPane().add(etGemessen);

        jLabel5.setText("V-Erlaubt");
        getContentPane().add(jLabel5);

        etErlaubt.setText("30");
        getContentPane().add(etErlaubt);

        btConfirm.setText("Übernehmen");
        btConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConfirmActionPerformed(evt);
            }
        });
        getContentPane().add(btConfirm);

        btCancel.setText("Abbrechen");
        btCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelActionPerformed(evt);
            }
        });
        getContentPane().add(btCancel);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConfirmActionPerformed
        // TODO add your handling code here:
        check=true;
        String date = etDate.getText()+" "+etTime.getText();
        LocalDateTime dateTime = LocalDateTime.parse(date,DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm"));
        object=new Measurement(dateTime, etKennzeichen.getText(), Integer.parseInt(etGemessen.getText()), Integer.parseInt(etErlaubt.getText()));
        this.dispose();
    }//GEN-LAST:event_btConfirmActionPerformed

    private void btCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelActionPerformed
        // TODO add your handling code here:
        check=false;
        this.dispose();
    }//GEN-LAST:event_btCancelActionPerformed

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
            java.util.logging.Logger.getLogger(VelocityDlg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VelocityDlg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VelocityDlg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VelocityDlg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VelocityDlg dialog = new VelocityDlg(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancel;
    private javax.swing.JButton btConfirm;
    private javax.swing.JTextField etDate;
    private javax.swing.JTextField etErlaubt;
    private javax.swing.JTextField etGemessen;
    private javax.swing.JTextField etKennzeichen;
    private javax.swing.JTextField etTime;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
