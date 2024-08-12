/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;

import Classes.BankUser;
import java.sql.ResultSet;
import java.sql.Connection;
import Classes.DbConnection;
import Classes.UserSession;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Fabian
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
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

        Base = new javax.swing.JPanel();
        LeftBar = new javax.swing.JPanel();
        BankIconLbl = new javax.swing.JLabel();
        TittleBankLbl = new javax.swing.JLabel();
        TittleBankLbl1 = new javax.swing.JLabel();
        OpenEyeIcon = new javax.swing.JLabel();
        IdUndrLine = new javax.swing.JSeparator();
        PassIconLbl = new javax.swing.JLabel();
        PassUndrLine = new javax.swing.JSeparator();
        IdField = new javax.swing.JTextField();
        LoginBtn = new javax.swing.JButton();
        CreateBtn = new javax.swing.JButton();
        PassField = new javax.swing.JPasswordField();
        UserIconLbl1 = new javax.swing.JLabel();
        DocumentTypeBox = new javax.swing.JComboBox<>();
        UserIconLbl2 = new javax.swing.JLabel();
        CloseEyeIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Base.setBackground(new java.awt.Color(255, 255, 255));
        Base.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LeftBar.setBackground(new java.awt.Color(130, 10, 209));

        BankIconLbl.setIcon(new javax.swing.ImageIcon("C:\\Users\\LEIDY\\Documents\\NetBeansProjects\\BankExample\\src\\main\\java\\Resources\\BankIcon.png")); // NOI18N

        TittleBankLbl.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        TittleBankLbl.setForeground(new java.awt.Color(255, 255, 255));
        TittleBankLbl.setText("Bank");

        TittleBankLbl1.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        TittleBankLbl1.setForeground(new java.awt.Color(255, 255, 255));
        TittleBankLbl1.setText("Java");

        javax.swing.GroupLayout LeftBarLayout = new javax.swing.GroupLayout(LeftBar);
        LeftBar.setLayout(LeftBarLayout);
        LeftBarLayout.setHorizontalGroup(
            LeftBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LeftBarLayout.createSequentialGroup()
                .addContainerGap(95, Short.MAX_VALUE)
                .addComponent(TittleBankLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(LeftBarLayout.createSequentialGroup()
                .addGroup(LeftBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LeftBarLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(TittleBankLbl1))
                    .addGroup(LeftBarLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(BankIconLbl)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        LeftBarLayout.setVerticalGroup(
            LeftBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftBarLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(TittleBankLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TittleBankLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addComponent(BankIconLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(184, Short.MAX_VALUE))
        );

        Base.add(LeftBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 630));

        OpenEyeIcon.setIcon(new javax.swing.ImageIcon("C:\\Users\\LEIDY\\Documents\\NetBeansProjects\\BankExample\\src\\main\\java\\Resources\\eye.png")); // NOI18N
        OpenEyeIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OpenEyeIconMouseClicked(evt);
            }
        });
        Base.add(OpenEyeIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 370, -1, -1));

        IdUndrLine.setForeground(new java.awt.Color(130, 10, 209));
        Base.add(IdUndrLine, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 290, 430, 10));

        PassIconLbl.setIcon(new javax.swing.ImageIcon("C:\\Users\\LEIDY\\Documents\\NetBeansProjects\\BankExample\\src\\main\\java\\Resources\\PassIcon.png")); // NOI18N
        Base.add(PassIconLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 370, -1, -1));

        PassUndrLine.setForeground(new java.awt.Color(130, 10, 209));
        Base.add(PassUndrLine, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 430, 430, 10));

        IdField.setBackground(new java.awt.Color(255, 255, 255));
        IdField.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        IdField.setForeground(new java.awt.Color(152, 18, 240));
        IdField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        IdField.setText("Identificación");
        IdField.setBorder(null);
        IdField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IdFieldMouseClicked(evt);
            }
        });
        IdField.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                IdFieldInputMethodTextChanged(evt);
            }
        });
        IdField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdFieldActionPerformed(evt);
            }
        });
        Base.add(IdField, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 240, 410, -1));

        LoginBtn.setBackground(new java.awt.Color(130, 10, 209));
        LoginBtn.setFont(new java.awt.Font("Dialog", 0, 34)); // NOI18N
        LoginBtn.setForeground(new java.awt.Color(255, 255, 255));
        LoginBtn.setText("Iniciar Sesión");
        LoginBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginBtnMouseClicked(evt);
            }
        });
        Base.add(LoginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 510, -1, -1));

        CreateBtn.setBackground(new java.awt.Color(130, 10, 209));
        CreateBtn.setFont(new java.awt.Font("Dialog", 0, 34)); // NOI18N
        CreateBtn.setForeground(new java.awt.Color(255, 255, 255));
        CreateBtn.setText("Crear Cuenta");
        Base.add(CreateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 510, -1, -1));

        PassField.setBackground(new java.awt.Color(255, 255, 255));
        PassField.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        PassField.setForeground(new java.awt.Color(152, 18, 240));
        PassField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        PassField.setText("****");
        PassField.setToolTipText("Clave");
        PassField.setBorder(null);
        PassField.setName(""); // NOI18N
        PassField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PassFieldMouseClicked(evt);
            }
        });
        PassField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PassFieldKeyTyped(evt);
            }
        });
        Base.add(PassField, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 380, 410, -1));
        PassField.getAccessibleContext().setAccessibleName("");

        UserIconLbl1.setIcon(new javax.swing.ImageIcon("C:\\Users\\LEIDY\\Documents\\NetBeansProjects\\BankExample\\src\\main\\java\\Resources\\IdTypeIcon.png")); // NOI18N
        Base.add(UserIconLbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, -1, -1));

        DocumentTypeBox.setBackground(new java.awt.Color(255, 255, 255));
        DocumentTypeBox.setFont(new java.awt.Font("Dialog", 0, 34)); // NOI18N
        DocumentTypeBox.setForeground(new java.awt.Color(152, 18, 240));
        DocumentTypeBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tipo de Documento...", "Cedula de Ciudadania", "Tarjeta de Identidad", "Cedula de Extranjeria" }));
        DocumentTypeBox.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(130, 10, 209), 1, true));
        DocumentTypeBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DocumentTypeBoxActionPerformed(evt);
            }
        });
        Base.add(DocumentTypeBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, 410, -1));

        UserIconLbl2.setIcon(new javax.swing.ImageIcon("C:\\Users\\LEIDY\\Documents\\NetBeansProjects\\BankExample\\src\\main\\java\\Resources\\IdIcon.png")); // NOI18N
        Base.add(UserIconLbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, -1, -1));

        CloseEyeIcon.setIcon(new javax.swing.ImageIcon("C:\\Users\\LEIDY\\Documents\\NetBeansProjects\\BankExample\\src\\main\\java\\Resources\\eyeClose.png")); // NOI18N
        CloseEyeIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseEyeIconMouseClicked(evt);
            }
        });
        Base.add(CloseEyeIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 370, -1, -1));
        CloseEyeIcon.setVisible(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Base, javax.swing.GroupLayout.PREFERRED_SIZE, 1040, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Base, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IdFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdFieldActionPerformed
  
    }//GEN-LAST:event_IdFieldActionPerformed

    private void IdFieldInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_IdFieldInputMethodTextChanged

    }//GEN-LAST:event_IdFieldInputMethodTextChanged

    private void IdFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IdFieldMouseClicked
        IdField.setText("");
    }//GEN-LAST:event_IdFieldMouseClicked

    private void PassFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PassFieldMouseClicked
        PassField.setText("");
    }//GEN-LAST:event_PassFieldMouseClicked

    private void LoginBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginBtnMouseClicked
        
        try (Connection connection = DbConnection.getConnection()) {
            // Obtener datos del formulario
            String documentType = DocumentTypeBox.getItemAt(DocumentTypeBox.getSelectedIndex());
            String idUser = IdField.getText();
            String passUser = PassField.getText();

            // Verificar si el ID de usuario es un número válido
            long idUserLong;
            try {
                idUserLong = Long.parseLong(idUser);
            } catch (NumberFormatException e) {
                System.out.println("El ID de usuario debe ser un número válido.");
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, "ID de usuario no válido", e);
                return; // Salir del método si el ID no es válido
            }

            // Query para encontrar el usuario en bd
            String query = "SELECT * FROM bank_user WHERE document_type = ? AND document_id = ? AND password = ?";
            try (PreparedStatement pstmt = connection.prepareStatement(query)) {
                pstmt.setString(1, documentType); // Primer parametro
                pstmt.setLong(2, idUserLong); // Segundo parametro
                pstmt.setString(3, passUser); // Tercer parametro

                try (ResultSet rs = pstmt.executeQuery()) {
                    if (rs.next()) {
                        // Si hay resultados, el usuario ha iniciado sesión correctamente
                        System.out.println("Inició Correctamente");

                        long document_id = rs.getLong("document_id");
                        String document_type = rs.getString("document_type");
                        String names = rs.getString("names");
                        String lastnames = rs.getString("lastnames");
                        String password = rs.getString("password");
                        long number = rs.getLong("number");
                        String address = rs.getString("address");
                        String account_type = rs.getString("account_type");
                        long account_id = rs.getLong("account_id");
                        long cash = rs.getLong("cash");
                        
                        BankUser currentBankUser = new BankUser(document_id, document_type, names, lastnames, password, number, address, account_type, account_id, cash);
                        
                        UserSession.setCurrentBankUser(currentBankUser);
                        
                        switch(account_type){
                            case "Credito" -> {
                                CreditUserMenu crdtUsrMnu = new CreditUserMenu();
                                crdtUsrMnu.pack();
                                crdtUsrMnu.setLocationRelativeTo(null);
                                this.dispose();
                                crdtUsrMnu.setVisible(true);
                            }
                            case "Debito" -> {
                                DebitUserMenu DbtUsrMnu = new DebitUserMenu();
                                DbtUsrMnu.pack();
                                DbtUsrMnu.setLocationRelativeTo(null);
                                this.dispose();
                                DbtUsrMnu.setVisible(true);
                            }
                        }
                    } else {
                        // Si no hay resultados, las credenciales son incorrectas
                        System.out.println("Campos Erróneos");
                    }
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, "Error de base de datos", ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, "Driver no encontrado", ex);
        }
        
    }//GEN-LAST:event_LoginBtnMouseClicked

    private void PassFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PassFieldKeyTyped
        
    }//GEN-LAST:event_PassFieldKeyTyped

    private void DocumentTypeBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DocumentTypeBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DocumentTypeBoxActionPerformed

    private void OpenEyeIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OpenEyeIconMouseClicked
       
        PassField.setEchoChar((char) 0);
        OpenEyeIcon.setVisible(false);
        CloseEyeIcon.setVisible(true);
        
    }//GEN-LAST:event_OpenEyeIconMouseClicked

    private void CloseEyeIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseEyeIconMouseClicked
        
        PassField.setEchoChar('*');
        OpenEyeIcon.setVisible(true);
        CloseEyeIcon.setVisible(false);
        
    }//GEN-LAST:event_CloseEyeIconMouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
                BankUser currentBankUser = new BankUser();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BankIconLbl;
    private javax.swing.JPanel Base;
    private javax.swing.JLabel CloseEyeIcon;
    private javax.swing.JButton CreateBtn;
    private javax.swing.JComboBox<String> DocumentTypeBox;
    private javax.swing.JTextField IdField;
    private javax.swing.JSeparator IdUndrLine;
    private javax.swing.JPanel LeftBar;
    private javax.swing.JButton LoginBtn;
    private javax.swing.JLabel OpenEyeIcon;
    private javax.swing.JPasswordField PassField;
    private javax.swing.JLabel PassIconLbl;
    private javax.swing.JSeparator PassUndrLine;
    private javax.swing.JLabel TittleBankLbl;
    private javax.swing.JLabel TittleBankLbl1;
    private javax.swing.JLabel UserIconLbl1;
    private javax.swing.JLabel UserIconLbl2;
    // End of variables declaration//GEN-END:variables
}
