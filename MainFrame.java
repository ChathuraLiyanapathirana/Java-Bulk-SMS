/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pfcsmsclient;

import com.mysql.jdbc.Connection;
import gnu.io.CommPortIdentifier;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

import org.smslib.OutboundMessage;

/**
 *
 * @author SUMIRAX
 */
public class MainFrame extends javax.swing.JFrame {

//    MessageConfig
    private String port = null;

    List<OutboundMessage> numberList = null;

    public MainFrame() {
        initComponents();
        initUiElementStyles();
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
        heademessPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        retriveDataBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        sendBtn = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pendingListComp = new javax.swing.JList();
        pendingCountLbl = new javax.swing.JPanel();
        countPending = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        sentUiComp = new javax.swing.JList();
        sentCountLbl = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        msgAreaContainer = new javax.swing.JScrollPane();
        msgArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PFC SMS CLIENT");
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1000, 600));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        heademessPanel.setBackground(new java.awt.Color(51, 51, 51));
        heademessPanel.setForeground(new java.awt.Color(255, 255, 255));
        heademessPanel.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(102, 102, 102));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SMS CLIENT");
        jLabel1.setOpaque(true);
        heademessPanel.add(jLabel1);
        jLabel1.setBounds(10, 10, 180, 32);

        retriveDataBtn.setBackground(new java.awt.Color(0, 204, 255));
        retriveDataBtn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        retriveDataBtn.setForeground(new java.awt.Color(255, 255, 255));
        retriveDataBtn.setText("Retrive Data");
        retriveDataBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retriveDataBtnActionPerformed(evt);
            }
        });
        heademessPanel.add(retriveDataBtn);
        retriveDataBtn.setBounds(280, 10, 150, 31);

        jButton1.setBackground(new java.awt.Color(255, 153, 0));
        jButton1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Find Port");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        heademessPanel.add(jButton1);
        jButton1.setBounds(440, 10, 120, 30);

        sendBtn.setBackground(new java.awt.Color(102, 204, 0));
        sendBtn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        sendBtn.setForeground(new java.awt.Color(255, 255, 255));
        sendBtn.setText("Send");
        sendBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendBtnActionPerformed(evt);
            }
        });
        heademessPanel.add(sendBtn);
        sendBtn.setBounds(690, 10, 141, 31);

        exitBtn.setBackground(new java.awt.Color(255, 102, 102));
        exitBtn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        exitBtn.setForeground(new java.awt.Color(255, 255, 255));
        exitBtn.setText("EXIT");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });
        heademessPanel.add(exitBtn);
        exitBtn.setBounds(950, 10, 83, 31);

        jComboBox1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(102, 102, 102));
        jComboBox1.setPreferredSize(new java.awt.Dimension(32, 30));
        heademessPanel.add(jComboBox1);
        jComboBox1.setBounds(570, 10, 110, 32);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pending List", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(51, 51, 51))); // NOI18N
        jPanel3.setOpaque(false);

        pendingListComp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        pendingListComp.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(pendingListComp);

        pendingCountLbl.setBackground(new java.awt.Color(255, 153, 153));
        pendingCountLbl.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        countPending.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        countPending.setForeground(new java.awt.Color(102, 102, 102));
        countPending.setText("Member Count : ");

        javax.swing.GroupLayout pendingCountLblLayout = new javax.swing.GroupLayout(pendingCountLbl);
        pendingCountLbl.setLayout(pendingCountLblLayout);
        pendingCountLblLayout.setHorizontalGroup(
            pendingCountLblLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pendingCountLblLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(countPending)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pendingCountLblLayout.setVerticalGroup(
            pendingCountLblLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pendingCountLblLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(countPending, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
                    .addComponent(pendingCountLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pendingCountLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Send Status", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(51, 51, 51))); // NOI18N
        jPanel4.setOpaque(false);

        sentUiComp.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jScrollPane2.setViewportView(sentUiComp);

        sentCountLbl.setBackground(new java.awt.Color(153, 255, 153));
        sentCountLbl.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Member Count : ");

        javax.swing.GroupLayout sentCountLblLayout = new javax.swing.GroupLayout(sentCountLbl);
        sentCountLbl.setLayout(sentCountLblLayout);
        sentCountLblLayout.setHorizontalGroup(
            sentCountLblLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sentCountLblLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        sentCountLblLayout.setVerticalGroup(
            sentCountLblLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sentCountLblLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
                    .addComponent(sentCountLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sentCountLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2)
                .addContainerGap())
        );

        msgArea.setColumns(20);
        msgArea.setRows(5);
        msgAreaContainer.setViewportView(msgArea);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(heademessPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(msgAreaContainer)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(heademessPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(msgAreaContainer, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        Object[] options1 = {"Cancel", "Exit"};
        JOptionPane jop = new JOptionPane("Do you really want to exit?", JOptionPane.WARNING_MESSAGE, JOptionPane.YES_NO_OPTION, null, options1, options1[0]);
        JDialog dialog = jop.createDialog(null, "Warning!");
        dialog.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        dialog.setVisible(true);
        String a3 = (String) jop.getValue();
        if (a3.equals("Exit")) {
            this.dispose();
        }
        dialog.dispose();
    }//GEN-LAST:event_exitBtnActionPerformed

    private void retriveDataBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retriveDataBtnActionPerformed
        retriveData();
    }//GEN-LAST:event_retriveDataBtnActionPerformed

    private void sendBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendBtnActionPerformed
        sendMessages();
    }//GEN-LAST:event_sendBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        @SuppressWarnings("unchecked")
        Enumeration<CommPortIdentifier> portEnum = CommPortIdentifier.getPortIdentifiers();
        jComboBox1.removeAllItems();
        while (portEnum.hasMoreElements()) {
            CommPortIdentifier currPortId = portEnum.nextElement();
            jComboBox1.addItem(currPortId.getName());
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
                if ("windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
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
    private javax.swing.JLabel countPending;
    private javax.swing.JButton exitBtn;
    private javax.swing.JPanel heademessPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea msgArea;
    private javax.swing.JScrollPane msgAreaContainer;
    private javax.swing.JPanel pendingCountLbl;
    private javax.swing.JList pendingListComp;
    private javax.swing.JButton retriveDataBtn;
    private javax.swing.JButton sendBtn;
    private javax.swing.JPanel sentCountLbl;
    private javax.swing.JList sentUiComp;
    // End of variables declaration//GEN-END:variables

//    Initialize some ui stuff
    private void initUiElementStyles() {
        this.setSize(1050, 650);
        this.setLocationRelativeTo(null);
        msgArea.setVisible(false);
        msgAreaContainer.setVisible(false);
    }

//    Connect to database
    private Connection connectDatabase() {
        try {
            Connection connection = Conn.getDbConnection().getConnection();
            if (connection != null) {
                return connection;
            }
        } catch (SQLException ex) {
            messagePopUper("Database connection error\n please check mysql is working.", "Database Error Occured!", "error");
        }
        return null;
    }

//    Change here as you want 
//    retrive data from db
    private void retriveData() {
        Connection conn = connectDatabase();
        numberList = new ArrayList();
        DefaultListModel dlm = new DefaultListModel();
        try {
            if (conn != null) {
                try {
                    String query = "SELECT * FROM testtbl";
                    Statement st = conn.createStatement();
                    ResultSet rs = st.executeQuery(query);
                    dlm.clear();
                    // iterate through the java resultset
                    while (rs.next()) {
//                        int id = rs.getInt("code");
//                        String mName = rs.getString("name");
//                        String mPhoneNum = rs.getString("mobiletel");
//                        dlm.addElement(id + " - " + mName + " - " + mPhoneNum);
                        int id = rs.getInt("id");
                        String mName = rs.getString("name");
                        String mPhoneNum = rs.getString("number");
                        dlm.addElement(id + " - " + mName + " - " + mPhoneNum);
                        numberList.add(new OutboundMessage(mPhoneNum, mName));
                    }
                    st.close();
                    pendingListComp.setModel(dlm);
                    countPending.setText("Member Count : " + numberList.size());
//            messagePopUper("Data retriving please wait!", "In Progress!", "info");
                } catch (SQLException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } finally {
        }
    }

//    Method for popup messages
    private void messagePopUper(String message, String title, String type) {
        JOptionPane jop;
        JDialog dialog;
        switch (type) {
            case "info":
                jop = new JOptionPane(message, JOptionPane.INFORMATION_MESSAGE);
                dialog = jop.createDialog(null, title);
                dialog.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
                dialog.setVisible(true);
                dialog.dispose();
                break;
            case "error":
                jop = new JOptionPane(message, JOptionPane.ERROR_MESSAGE);
                dialog = jop.createDialog(null, title);
                dialog.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
                dialog.setVisible(true);
                dialog.dispose();
                break;
        }
    }

//    Call SMSLIB class method
//    More info use smslib api 
    private void sendMessages() {
        try {
            port = jComboBox1.getSelectedItem().toString();
            if (port != null && numberList != null) {
                new SmsLib().sendMessage(numberList, port);
            } else {
                messagePopUper("Please follow the steps!", "Missing Detail!", "error");
            }
        } catch (Exception ex) {
            messagePopUper("Please follow the steps!", "Missing Detail!", "error");
        }
    }

}
