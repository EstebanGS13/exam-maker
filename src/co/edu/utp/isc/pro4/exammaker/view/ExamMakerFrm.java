package co.edu.utp.isc.pro4.exammaker.view;

/**
 *
 * @author Esteban
 */
public class ExamMakerFrm extends javax.swing.JFrame implements FrameControl {

    /**
     * Creates new form ExamMakerJFrame
     */
    public ExamMakerFrm() {
        initComponents();
        startApp();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPnlLogin = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButtonProfessor = new javax.swing.JButton();
        jButtonStudent = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPnlProfessor = new javax.swing.JPanel();
        btnCreateExam = new javax.swing.JButton();
        btnGradeExam = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPnlCreateExam = new javax.swing.JPanel();
        createExamPnl1 = new co.edu.utp.isc.pro4.exammaker.view.CreateExamPnl();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Exam Maker");
        getContentPane().setLayout(new java.awt.CardLayout());

        jPnlLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPnlLogin.setName(""); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Bienvenido a Exam Maker");

        jButtonProfessor.setText("Profesor");
        jButtonProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProfessorActionPerformed(evt);
            }
        });

        jButtonStudent.setText("Estudiante");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Entrar como:");

        javax.swing.GroupLayout jPnlLoginLayout = new javax.swing.GroupLayout(jPnlLogin);
        jPnlLogin.setLayout(jPnlLoginLayout);
        jPnlLoginLayout.setHorizontalGroup(
            jPnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnlLoginLayout.createSequentialGroup()
                .addGroup(jPnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPnlLoginLayout.createSequentialGroup()
                        .addGap(258, 258, 258)
                        .addComponent(jLabel1))
                    .addGroup(jPnlLoginLayout.createSequentialGroup()
                        .addGap(317, 317, 317)
                        .addComponent(jLabel2))
                    .addGroup(jPnlLoginLayout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(jButtonProfessor)
                        .addGap(172, 172, 172)
                        .addComponent(jButtonStudent)))
                .addContainerGap(208, Short.MAX_VALUE))
        );
        jPnlLoginLayout.setVerticalGroup(
            jPnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnlLoginLayout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(jLabel1)
                .addGap(58, 58, 58)
                .addComponent(jLabel2)
                .addGap(82, 82, 82)
                .addGroup(jPnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonProfessor)
                    .addComponent(jButtonStudent))
                .addContainerGap(275, Short.MAX_VALUE))
        );

        getContentPane().add(jPnlLogin, "login");

        jPnlProfessor.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Profesor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14))); // NOI18N

        btnCreateExam.setText("Crear Examen");
        btnCreateExam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateExamActionPerformed(evt);
            }
        });

        btnGradeExam.setText("Calificar Examen");

        jLabel3.setText("Elija una opción");

        javax.swing.GroupLayout jPnlProfessorLayout = new javax.swing.GroupLayout(jPnlProfessor);
        jPnlProfessor.setLayout(jPnlProfessorLayout);
        jPnlProfessorLayout.setHorizontalGroup(
            jPnlProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnlProfessorLayout.createSequentialGroup()
                .addContainerGap(293, Short.MAX_VALUE)
                .addGroup(jPnlProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPnlProfessorLayout.createSequentialGroup()
                        .addGroup(jPnlProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnGradeExam, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCreateExam, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(276, 276, 276))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPnlProfessorLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(314, 314, 314))))
        );
        jPnlProfessorLayout.setVerticalGroup(
            jPnlProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnlProfessorLayout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(jLabel3)
                .addGap(69, 69, 69)
                .addComponent(btnCreateExam, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(btnGradeExam, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(277, Short.MAX_VALUE))
        );

        getContentPane().add(jPnlProfessor, "professor");

        javax.swing.GroupLayout jPnlCreateExamLayout = new javax.swing.GroupLayout(jPnlCreateExam);
        jPnlCreateExam.setLayout(jPnlCreateExamLayout);
        jPnlCreateExamLayout.setHorizontalGroup(
            jPnlCreateExamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnlCreateExamLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(createExamPnl1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPnlCreateExamLayout.setVerticalGroup(
            jPnlCreateExamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPnlCreateExamLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(createExamPnl1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPnlCreateExam, "create");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProfessorActionPerformed
        switchCard("professor");
    }//GEN-LAST:event_jButtonProfessorActionPerformed

    private void btnCreateExamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateExamActionPerformed
        switchCard("create ");
    }//GEN-LAST:event_btnCreateExamActionPerformed

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
            java.util.logging.Logger.getLogger(ExamMakerFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExamMakerFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExamMakerFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExamMakerFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExamMakerFrm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateExam;
    private javax.swing.JButton btnGradeExam;
    private co.edu.utp.isc.pro4.exammaker.view.CreateExamPnl createExamPnl1;
    private javax.swing.JButton jButtonProfessor;
    private javax.swing.JButton jButtonStudent;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPnlCreateExam;
    private javax.swing.JPanel jPnlLogin;
    private javax.swing.JPanel jPnlProfessor;
    // End of variables declaration//GEN-END:variables

    private void startApp() {
        setLocationRelativeTo(null);
    }
    
    @Override
    public void switchCard(String card) {
        if (card.equals("professor")) {
            this.jPnlLogin.setVisible(false);
            this.jPnlProfessor.setVisible(true);
        }
        else if (card.equals("create")) {
            this.jPnlProfessor.setVisible(false);
            this.jPnlCreateExam.setVisible(true);
        }
    }
    
    

}
