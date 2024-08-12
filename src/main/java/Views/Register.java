/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;

/**
 *
 * @author Fabian
 */
public class Register extends javax.swing.JFrame {

    /**
     * Creates new form Register
     */
    public Register() {
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
        LeftBar = new javax.swing.JPanel();
        BankIconLbl = new javax.swing.JLabel();
        TittleBankLbl = new javax.swing.JLabel();
        TittleBankLbl2 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        NamesField = new javax.swing.JTextField();
        LastnamesField = new javax.swing.JTextField();
        lbl5 = new javax.swing.JLabel();
        IdField = new javax.swing.JTextField();
        lbl1 = new javax.swing.JLabel();
        AccountTypeBox = new javax.swing.JComboBox<>();
        lbl6 = new javax.swing.JLabel();
        NumberField = new javax.swing.JTextField();
        lbl4 = new javax.swing.JLabel();
        IdTypeBox = new javax.swing.JComboBox<>();
        lbl7 = new javax.swing.JLabel();
        AddressField = new javax.swing.JTextField();
        lbl8 = new javax.swing.JLabel();
        PasswordField = new javax.swing.JTextField();
        LoginBtn = new javax.swing.JButton();
        CreateBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LeftBar.setBackground(new java.awt.Color(130, 10, 209));

        BankIconLbl.setIcon(new javax.swing.ImageIcon("C:\\Users\\LEIDY\\Documents\\NetBeansProjects\\BankExample\\src\\main\\java\\Resources\\BankIcon.png")); // NOI18N

        TittleBankLbl.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        TittleBankLbl.setForeground(new java.awt.Color(255, 255, 255));
        TittleBankLbl.setText("Bank");

        TittleBankLbl2.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        TittleBankLbl2.setForeground(new java.awt.Color(255, 255, 255));
        TittleBankLbl2.setText("Java");

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
                        .addGap(43, 43, 43)
                        .addComponent(BankIconLbl))
                    .addGroup(LeftBarLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(TittleBankLbl2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        LeftBarLayout.setVerticalGroup(
            LeftBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftBarLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(TittleBankLbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TittleBankLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addComponent(BankIconLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(184, Short.MAX_VALUE))
        );

        jPanel1.add(LeftBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 630));

        lbl2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lbl2.setForeground(new java.awt.Color(130, 10, 209));
        lbl2.setText("Nombres: ");
        jPanel1.add(lbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, -1, -1));

        lbl3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lbl3.setForeground(new java.awt.Color(130, 10, 209));
        lbl3.setText("Apellidos: ");
        jPanel1.add(lbl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, -1, -1));

        NamesField.setBackground(new java.awt.Color(255, 255, 255));
        NamesField.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        NamesField.setForeground(new java.awt.Color(130, 10, 209));
        NamesField.setOpaque(true);
        NamesField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NamesFieldActionPerformed(evt);
            }
        });
        jPanel1.add(NamesField, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 100, 210, -1));

        LastnamesField.setBackground(new java.awt.Color(255, 255, 255));
        LastnamesField.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        LastnamesField.setForeground(new java.awt.Color(130, 10, 209));
        LastnamesField.setOpaque(true);
        LastnamesField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LastnamesFieldActionPerformed(evt);
            }
        });
        jPanel1.add(LastnamesField, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 160, 210, -1));

        lbl5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lbl5.setForeground(new java.awt.Color(130, 10, 209));
        lbl5.setText("Numero Identificación:");
        jPanel1.add(lbl5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 280, -1, -1));

        IdField.setBackground(new java.awt.Color(255, 255, 255));
        IdField.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        IdField.setForeground(new java.awt.Color(130, 10, 209));
        IdField.setOpaque(true);
        IdField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdFieldActionPerformed(evt);
            }
        });
        jPanel1.add(IdField, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 280, 210, -1));

        lbl1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lbl1.setForeground(new java.awt.Color(130, 10, 209));
        lbl1.setText("Tipo de Cuenta:");
        jPanel1.add(lbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, -1, -1));

        AccountTypeBox.setBackground(new java.awt.Color(255, 255, 255));
        AccountTypeBox.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        AccountTypeBox.setForeground(new java.awt.Color(130, 10, 209));
        AccountTypeBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...", "Debito", "Credito" }));
        AccountTypeBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccountTypeBoxActionPerformed(evt);
            }
        });
        jPanel1.add(AccountTypeBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 40, 210, -1));

        lbl6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lbl6.setForeground(new java.awt.Color(130, 10, 209));
        lbl6.setText("Numero de Celular:");
        jPanel1.add(lbl6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 340, -1, -1));

        NumberField.setBackground(new java.awt.Color(255, 255, 255));
        NumberField.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        NumberField.setForeground(new java.awt.Color(130, 10, 209));
        NumberField.setOpaque(true);
        NumberField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumberFieldActionPerformed(evt);
            }
        });
        jPanel1.add(NumberField, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 340, 210, -1));

        lbl4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lbl4.setForeground(new java.awt.Color(130, 10, 209));
        lbl4.setText("Tipo de Identificación:");
        jPanel1.add(lbl4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, -1, -1));

        IdTypeBox.setBackground(new java.awt.Color(255, 255, 255));
        IdTypeBox.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        IdTypeBox.setForeground(new java.awt.Color(130, 10, 209));
        IdTypeBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...", "Cedula de Extranjeria", "Cedula de Ciudadania", "Tarjeta de Identidad" }));
        IdTypeBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdTypeBoxActionPerformed(evt);
            }
        });
        jPanel1.add(IdTypeBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 220, 210, -1));

        lbl7.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lbl7.setForeground(new java.awt.Color(130, 10, 209));
        lbl7.setText("Dirección de Residencia:");
        jPanel1.add(lbl7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 400, -1, -1));

        AddressField.setBackground(new java.awt.Color(255, 255, 255));
        AddressField.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        AddressField.setForeground(new java.awt.Color(130, 10, 209));
        AddressField.setOpaque(true);
        AddressField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddressFieldActionPerformed(evt);
            }
        });
        jPanel1.add(AddressField, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 400, 210, -1));

        lbl8.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lbl8.setForeground(new java.awt.Color(130, 10, 209));
        lbl8.setText("Contraseña:");
        jPanel1.add(lbl8, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 460, -1, -1));

        PasswordField.setBackground(new java.awt.Color(255, 255, 255));
        PasswordField.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        PasswordField.setForeground(new java.awt.Color(130, 10, 209));
        PasswordField.setOpaque(true);
        PasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordFieldActionPerformed(evt);
            }
        });
        jPanel1.add(PasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 460, 210, -1));

        LoginBtn.setBackground(new java.awt.Color(130, 10, 209));
        LoginBtn.setFont(new java.awt.Font("Dialog", 0, 30)); // NOI18N
        LoginBtn.setForeground(new java.awt.Color(255, 255, 255));
        LoginBtn.setText("Iniciar Sesión");
        LoginBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginBtnMouseClicked(evt);
            }
        });
        jPanel1.add(LoginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 550, -1, -1));

        CreateBtn.setBackground(new java.awt.Color(130, 10, 209));
        CreateBtn.setFont(new java.awt.Font("Dialog", 0, 30)); // NOI18N
        CreateBtn.setForeground(new java.awt.Color(255, 255, 255));
        CreateBtn.setText("Crear Cuenta");
        jPanel1.add(CreateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 550, -1, -1));

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

    private void NamesFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NamesFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NamesFieldActionPerformed

    private void LastnamesFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LastnamesFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LastnamesFieldActionPerformed

    private void IdFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IdFieldActionPerformed

    private void AccountTypeBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccountTypeBoxActionPerformed

    }//GEN-LAST:event_AccountTypeBoxActionPerformed

    private void NumberFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumberFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumberFieldActionPerformed

    private void IdTypeBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdTypeBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IdTypeBoxActionPerformed

    private void AddressFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddressFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddressFieldActionPerformed

    private void PasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordFieldActionPerformed

    private void LoginBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginBtnMouseClicked


    }//GEN-LAST:event_LoginBtnMouseClicked

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> AccountTypeBox;
    private javax.swing.JTextField AddressField;
    private javax.swing.JLabel BankIconLbl;
    private javax.swing.JButton CreateBtn;
    private javax.swing.JTextField IdField;
    private javax.swing.JComboBox<String> IdTypeBox;
    private javax.swing.JTextField LastnamesField;
    private javax.swing.JPanel LeftBar;
    private javax.swing.JButton LoginBtn;
    private javax.swing.JTextField NamesField;
    private javax.swing.JTextField NumberField;
    private javax.swing.JTextField PasswordField;
    private javax.swing.JLabel TittleBankLbl;
    private javax.swing.JLabel TittleBankLbl2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lbl5;
    private javax.swing.JLabel lbl6;
    private javax.swing.JLabel lbl7;
    private javax.swing.JLabel lbl8;
    // End of variables declaration//GEN-END:variables
}
