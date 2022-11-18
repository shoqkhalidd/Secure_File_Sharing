import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.nio.file.Files;
import java.nio.file.Paths;
import javax.crypto.SecretKey;
import javax.swing.JFileChooser;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author hp
 */
public class Encrypt extends javax.swing.JFrame {

    String decrypted_file_path;
    String plain_file_path;
    String Public_Key_path;
    String Private_Key_path;
    String encrypted_key_file_path;
    String where_to_save_encrypted_key;
    String Encrypted_File_Path;
    byte[] encrypted_secret_key;
    /**
     * Creates new form Encrypt
     */
    public Encrypt() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        SelectPlainFile1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        Encryption_bttn1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        SelectPublicKey1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        encrypted1 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        send1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        SelectPlainFile = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        Encrypt = new javax.swing.JButton();
        Label_PF = new javax.swing.JLabel();
        SelectPublicKey = new javax.swing.JButton();
        Label_PK = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        SelectEkeyFile = new javax.swing.JButton();
        Label_SKpath = new javax.swing.JLabel();
        send = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(242, 214, 191));
        jPanel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(211, 152, 104));
        jLabel5.setText("Encryption Section");

        SelectPlainFile1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        SelectPlainFile1.setText("Select File");
        SelectPlainFile1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SelectPlainFile1MouseClicked(evt);
            }
        });
        SelectPlainFile1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectPlainFile1ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        jLabel8.setText("Choose The File to be Encrypted:");

        Encryption_bttn1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Encryption_bttn1.setText("Encrypt");
        Encryption_bttn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Encryption_bttn1MouseClicked(evt);
            }
        });
        Encryption_bttn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Encryption_bttn1ActionPerformed(evt);
            }
        });

        jLabel6.setText("Path");

        SelectPublicKey1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        SelectPublicKey1.setText("Select public key ");
        SelectPublicKey1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SelectPublicKey1MouseClicked(evt);
            }
        });

        jLabel9.setText("Path:");

        jLabel12.setText("Choose where to save encrypted secret key");

        encrypted1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        encrypted1.setText("Select encrypted key file");
        encrypted1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                encrypted1MouseClicked(evt);
            }
        });

        jLabel13.setText("Path:");

        send1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        send1.setText("Send");
        send1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                send1MouseClicked(evt);
            }
        });
        send1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                send1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(SelectPlainFile1)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(SelectPublicKey1))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(97, 97, 97)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Encryption_bttn1)
                                .addComponent(send1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(encrypted1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addGap(10, 10, 10)
                .addComponent(SelectPlainFile1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addGap(22, 22, 22)
                .addComponent(SelectPublicKey1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(encrypted1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addGap(69, 69, 69)
                .addComponent(Encryption_bttn1)
                .addGap(42, 42, 42)
                .addComponent(send1)
                .addGap(57, 57, 57))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(242, 214, 191));
        jPanel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(211, 152, 104));
        jLabel7.setText("Encryption Section");

        SelectPlainFile.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        SelectPlainFile.setText("Select File");
        SelectPlainFile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SelectPlainFileMouseClicked(evt);
            }
        });
        SelectPlainFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectPlainFileActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        jLabel10.setText("Choose The File to be Encrypted:");

        Encrypt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Encrypt.setText("Encrypt");
        Encrypt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EncryptMouseClicked(evt);
            }
        });
        Encrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EncryptActionPerformed(evt);
            }
        });

        Label_PF.setText("Path");

        SelectPublicKey.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        SelectPublicKey.setText("Select public key ");
        SelectPublicKey.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SelectPublicKeyMouseClicked(evt);
            }
        });

        Label_PK.setText("Path:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel15.setText("Choose where to save encrypted secret key");

        SelectEkeyFile.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        SelectEkeyFile.setText("Select encrypted key file");
        SelectEkeyFile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SelectEkeyFileMouseClicked(evt);
            }
        });
        SelectEkeyFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectEkeyFileActionPerformed(evt);
            }
        });

        Label_SKpath.setText("Path:");

        send.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        send.setText("Send");
        send.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sendMouseClicked(evt);
            }
        });
        send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(SelectPlainFile)))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(SelectPublicKey))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(97, 97, 97)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Encrypt)
                                .addComponent(send, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(SelectEkeyFile, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(Label_SKpath, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(Label_PK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(Label_PF, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addGap(10, 10, 10)
                .addComponent(SelectPlainFile)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Label_PF)
                .addGap(22, 22, 22)
                .addComponent(SelectPublicKey)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Label_PK)
                .addGap(32, 32, 32)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SelectEkeyFile)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Label_SKpath)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(Encrypt)
                .addGap(42, 42, 42)
                .addComponent(send)
                .addGap(57, 57, 57))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 365, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 525, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SelectPlainFile1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SelectPlainFile1MouseClicked

        // TODO add your handling code here:
    }//GEN-LAST:event_SelectPlainFile1MouseClicked

    private void SelectPlainFile1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectPlainFile1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SelectPlainFile1ActionPerformed

    private void Encryption_bttn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Encryption_bttn1MouseClicked

        //            //
        // TODO add your handling code here:
    }//GEN-LAST:event_Encryption_bttn1MouseClicked

    private void Encryption_bttn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Encryption_bttn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Encryption_bttn1ActionPerformed

    private void SelectPublicKey1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SelectPublicKey1MouseClicked

        // TODO add your handling code here:
    }//GEN-LAST:event_SelectPublicKey1MouseClicked

    private void encrypted1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_encrypted1MouseClicked


    }//GEN-LAST:event_encrypted1MouseClicked

    private void send1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_send1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_send1MouseClicked

    private void send1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_send1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_send1ActionPerformed

    private void SelectPlainFileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SelectPlainFileMouseClicked

        JFileChooser file = new JFileChooser();
        file.setMultiSelectionEnabled(true);
        file.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        file.setFileHidingEnabled(true);
        if (file.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            java.io.File f = file.getSelectedFile();
            plain_file_path = file.getSelectedFile().getPath();
            Label_PF.setText(plain_file_path);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_SelectPlainFileMouseClicked

    private void SelectPlainFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectPlainFileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SelectPlainFileActionPerformed

    private void EncryptMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EncryptMouseClicked

        try {
            //1- generate secret key 
            SecretKey key = AES.generateKey(128);
           

            //2- encrypt the plain file and save Encrypted_file_path
            Encrypted_File_Path = AES.FileIncryption(key, plain_file_path);

            //3-encrypt secret key using rsa , save the encrypted key to  byte[]
            encrypted_secret_key = RSA.encrypt(key, Public_Key_path);
           
            //  write the encrypted secret key to the path choosen 
            FileOutputStream fos = new FileOutputStream(where_to_save_encrypted_key + "\\encryptedSKey.txt");
            fos.write(encrypted_secret_key); //k type = byte 
           

            // TODO add your handling code here:
        } catch (Exception ex) {

        }
    }//GEN-LAST:event_EncryptMouseClicked

    private void EncryptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EncryptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EncryptActionPerformed

    private void SelectPublicKeyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SelectPublicKeyMouseClicked
        JFileChooser file = new JFileChooser();
        file.setMultiSelectionEnabled(true);
        file.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        file.setFileHidingEnabled(true);
        if (file.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {

            Public_Key_path = file.getSelectedFile().getPath();
            Label_PK.setText(Public_Key_path);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_SelectPublicKeyMouseClicked

    private void SelectEkeyFileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SelectEkeyFileMouseClicked

        JFileChooser file = new JFileChooser();
        file.setMultiSelectionEnabled(true);
        file.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        file.setFileHidingEnabled(true);
        if (file.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            where_to_save_encrypted_key = file.getSelectedFile().getPath();
            Label_PF.setText(where_to_save_encrypted_key);
        }

// TODO add your handling code here:
    }//GEN-LAST:event_SelectEkeyFileMouseClicked

    private void sendMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sendMouseClicked
        try {
            
            //send files to receiver
            sender.Send(where_to_save_encrypted_key + "\\encryptedSKey.txt", Encrypted_File_Path);
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(Encrypt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_sendMouseClicked

    private void sendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sendActionPerformed

    private void SelectEkeyFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectEkeyFileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SelectEkeyFileActionPerformed

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
            java.util.logging.Logger.getLogger(Encrypt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Encrypt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Encrypt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Encrypt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Encrypt().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Encrypt;
    private javax.swing.JButton Encryption_bttn1;
    private javax.swing.JLabel Label_PF;
    private javax.swing.JLabel Label_PK;
    private javax.swing.JLabel Label_SKpath;
    private javax.swing.JButton SelectEkeyFile;
    private javax.swing.JButton SelectPlainFile;
    private javax.swing.JButton SelectPlainFile1;
    private javax.swing.JButton SelectPublicKey;
    private javax.swing.JButton SelectPublicKey1;
    private javax.swing.JButton encrypted1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton send;
    private javax.swing.JButton send1;
    // End of variables declaration//GEN-END:variables
}
