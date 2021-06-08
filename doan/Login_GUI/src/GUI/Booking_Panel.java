
package GUI;

import BUS.Booking_BUS;
import BUS.Customer_BUS;
import BUS.Employee_BUS;
import DTO.Booking_DTO;
import DTO.Customer_DTO;
import DTO.Employee_DTO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Huy
 */
public class Booking_Panel extends javax.swing.JFrame {

    /**
     * Creates new form Booking_Panel
     */
    Booking_BUS booking_bus = new Booking_BUS();
    Employee_BUS em_bus = new Employee_BUS();
    Customer_BUS cus_bus = new Customer_BUS();
    public Booking_Panel() {
        
        initComponents();
        
        setLocationRelativeTo(null);
        RoomID_TextField.setText(MainFrame.ID_TextField.getText());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        DOBirth_KH_Textfield = new javax.swing.JTextField();
        RoomID_TextField = new javax.swing.JTextField();
        Name_KH_TextField = new javax.swing.JTextField();
        CCCD_KH_TextField = new javax.swing.JTextField();
        Phone_KH_TextField = new javax.swing.JTextField();
        btnBook = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setTitle("BOOKING INFO");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(250, 249, 248));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DOBirth_KH_Textfield.setFont(new java.awt.Font("UTM Avo", 0, 12)); // NOI18N
        DOBirth_KH_Textfield.setText("Date Of Birth");
        DOBirth_KH_Textfield.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel1.add(DOBirth_KH_Textfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 400, 40));

        RoomID_TextField.setFont(new java.awt.Font("UTM Avo", 0, 12)); // NOI18N
        RoomID_TextField.setText("Room ID");
        RoomID_TextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        RoomID_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RoomID_TextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(RoomID_TextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 400, 40));

        Name_KH_TextField.setFont(new java.awt.Font("UTM Avo", 0, 12)); // NOI18N
        Name_KH_TextField.setText("Full Name");
        Name_KH_TextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel1.add(Name_KH_TextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 400, 40));

        CCCD_KH_TextField.setFont(new java.awt.Font("UTM Avo", 0, 12)); // NOI18N
        CCCD_KH_TextField.setText("CCCD");
        CCCD_KH_TextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel1.add(CCCD_KH_TextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 400, 40));

        Phone_KH_TextField.setFont(new java.awt.Font("UTM Avo", 0, 12)); // NOI18N
        Phone_KH_TextField.setText("Phone Number");
        Phone_KH_TextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel1.add(Phone_KH_TextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 400, 40));

        btnBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/pic/QLP_pic/btnBook1.png"))); // NOI18N
        btnBook.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        btnBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBookMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBookMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBookMouseExited(evt);
            }
        });
        jPanel1.add(btnBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, 120, 50));

        jLabel1.setFont(new java.awt.Font("UTM Avo", 1, 24)); // NOI18N
        jLabel1.setText("BOOKING INFO");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 190, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/pic/QLKH_pic/Phone_Bgr.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 540, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/pic/QLP_pic/ID_Bgr.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 540, 50));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/pic/QLKH_pic/Name_Bgr.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 540, 50));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/pic/QLKH_pic/CCCD_Bgr.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 540, 50));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/pic/QLKH_pic/DateOfBirth_Bgr.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 540, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBookMouseClicked
       cus_bus.Insert(new Customer_DTO("",Name_KH_TextField.getText(),CCCD_KH_TextField.getText(),Phone_KH_TextField.getText(),DOBirth_KH_Textfield.getText()));
       
       List<Customer_DTO> list_cus = new ArrayList<>();
       list_cus=cus_bus.Select("select * from Client where CCCD = '"+CCCD_KH_TextField.getText()+"'");
       Object[] row = new Object[1];
       System.out.println(list_cus.size());
       list_cus.forEach((Customer_DTO cus) -> {
            row[0]=cus.getCustomer_id();
            System.out.println(row[0]);
        });       
     //  booking_bus.Insert(new Booking_DTO("",row[0].toString(),RoomID_TextField.getText(),"",""));
    }//GEN-LAST:event_btnBookMouseClicked

    private void btnBookMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBookMouseEntered
        btnBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/pic/QLP_pic/btnBook2.png")));
    }//GEN-LAST:event_btnBookMouseEntered

    private void btnBookMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBookMouseExited
        btnBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/pic/QLP_pic/btnBook1.png")));
    }//GEN-LAST:event_btnBookMouseExited

    private void RoomID_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RoomID_TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RoomID_TextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(Booking_Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Booking_Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Booking_Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Booking_Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Booking_Panel().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CCCD_KH_TextField;
    private javax.swing.JTextField DOBirth_KH_Textfield;
    private javax.swing.JTextField Name_KH_TextField;
    private javax.swing.JTextField Phone_KH_TextField;
    private javax.swing.JTextField RoomID_TextField;
    private javax.swing.JLabel btnBook;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
