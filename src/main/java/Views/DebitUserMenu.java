/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;
import Classes.UserSession;

/**
 *
 * @author Fabian
 */
public class DebitUserMenu extends javax.swing.JFrame {

    /**
     * Creates new form DebitUserMenu
     */
    public DebitUserMenu() {
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
        TittleBankLbl3 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TittleBankLbl4 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TittleBankLbl1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TittleBankLbl6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1064, 628));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
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

        TittleBankLbl3.setFont(new java.awt.Font("Dialog", 1, 44)); // NOI18N
        TittleBankLbl3.setForeground(new java.awt.Color(130, 10, 209));
        TittleBankLbl3.setText("Bienvenid@ " + UserSession.getCurrentBankUser().getNames());
        jPanel1.add(TittleBankLbl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, -1, 60));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\LEIDY\\Documents\\NetBeansProjects\\BankExample\\src\\main\\java\\Resources\\EditProfileIcon.png")); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, -1, -1));

        TittleBankLbl4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        TittleBankLbl4.setForeground(new java.awt.Color(164, 59, 233));
        TittleBankLbl4.setText("Editar Perfil");
        jPanel1.add(TittleBankLbl4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, -1, 60));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\LEIDY\\Documents\\NetBeansProjects\\BankExample\\src\\main\\java\\Resources\\AddCashIcon.png")); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 250, -1, -1));

        TittleBankLbl1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        TittleBankLbl1.setForeground(new java.awt.Color(164, 59, 233));
        TittleBankLbl1.setText("Consignar Dinero");
        jPanel1.add(TittleBankLbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 390, -1, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\LEIDY\\Documents\\NetBeansProjects\\BankExample\\src\\main\\java\\Resources\\SendCashIcon.png")); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 250, -1, -1));

        TittleBankLbl6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        TittleBankLbl6.setForeground(new java.awt.Color(164, 59, 233));
        TittleBankLbl6.setText("Enviar Dinero");
        jPanel1.add(TittleBankLbl6, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 390, -1, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1054, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(DebitUserMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DebitUserMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DebitUserMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DebitUserMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DebitUserMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BankIconLbl;
    private javax.swing.JPanel LeftBar;
    private javax.swing.JLabel TittleBankLbl;
    private javax.swing.JLabel TittleBankLbl1;
    private javax.swing.JLabel TittleBankLbl2;
    private javax.swing.JLabel TittleBankLbl3;
    private javax.swing.JLabel TittleBankLbl4;
    private javax.swing.JLabel TittleBankLbl6;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
