/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author PORTOMASTER
 */
public class SuperCalculadora extends javax.swing.JFrame {

    /**
     * Creates new form SuperCalculadora
     */
    public SuperCalculadora() { //Construtor
        initComponents();
        jpaCalc.setVisible(false);
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
        jspNum = new javax.swing.JSpinner();
        jbuCalc = new javax.swing.JButton();
        jpaCalc = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jlaResto = new javax.swing.JLabel();
        jlaCubo = new javax.swing.JLabel();
        jlaQuad = new javax.swing.JLabel();
        jlaCub = new javax.swing.JLabel();
        jlaAbs = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("Digite o Valor");

        jspNum.setModel(new javax.swing.SpinnerNumberModel(1, -50, null, 1));

        jbuCalc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/simbolos (3).png"))); // NOI18N
        jbuCalc.setText("Calcular");
        jbuCalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuCalcActionPerformed(evt);
            }
        });

        jLabel3.setText("Resto da Divisão por 2");

        jLabel4.setText("Elevado ao Cubo");

        jLabel5.setText("Raiz Quadrada");

        jLabel6.setText("Raiz Cúbica");

        jLabel7.setText("Valor Absoluto");

        jlaResto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlaResto.setForeground(new java.awt.Color(0, 0, 255));
        jlaResto.setText("0");

        jlaCubo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlaCubo.setForeground(new java.awt.Color(0, 0, 255));
        jlaCubo.setText("0");

        jlaQuad.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlaQuad.setForeground(new java.awt.Color(0, 0, 255));
        jlaQuad.setText("0");

        jlaCub.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlaCub.setForeground(new java.awt.Color(0, 0, 255));
        jlaCub.setText("0");

        jlaAbs.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlaAbs.setForeground(new java.awt.Color(0, 0, 255));
        jlaAbs.setText("0");

        javax.swing.GroupLayout jpaCalcLayout = new javax.swing.GroupLayout(jpaCalc);
        jpaCalc.setLayout(jpaCalcLayout);
        jpaCalcLayout.setHorizontalGroup(
            jpaCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpaCalcLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpaCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpaCalcLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
                        .addComponent(jlaResto))
                    .addGroup(jpaCalcLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlaCubo))
                    .addGroup(jpaCalcLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlaQuad))
                    .addGroup(jpaCalcLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlaCub))
                    .addGroup(jpaCalcLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlaAbs)))
                .addContainerGap())
        );
        jpaCalcLayout.setVerticalGroup(
            jpaCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpaCalcLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpaCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jlaResto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpaCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jlaCubo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpaCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jlaQuad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpaCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlaCub)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpaCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlaAbs)
                    .addComponent(jLabel7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/calc.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpaCalc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jbuCalc, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jspNum)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jspNum, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addComponent(jbuCalc, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel8))
                .addGap(29, 29, 29)
                .addComponent(jpaCalc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbuCalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuCalcActionPerformed
int num = Integer.parseInt(jspNum.getValue().toString());
int res = num %2;
jlaResto.setText(Integer.toString(res));
double Cubo = Math.pow(num,3);
jlaCubo.setText(Double.toString(Cubo));
double raizq = Math.sqrt(num);
jlaQuad.setText(Double.toString(raizq));
double raizc = Math.cbrt(num);
jlaCub.setText(Double.toString(raizc));
int abs = Math.abs(num);
jlaAbs.setText(Integer.toString(abs));
        jpaCalc.setVisible(true);
    }//GEN-LAST:event_jbuCalcActionPerformed

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
            java.util.logging.Logger.getLogger(SuperCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SuperCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SuperCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SuperCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SuperCalculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JButton jbuCalc;
    private javax.swing.JLabel jlaAbs;
    private javax.swing.JLabel jlaCub;
    private javax.swing.JLabel jlaCubo;
    private javax.swing.JLabel jlaQuad;
    private javax.swing.JLabel jlaResto;
    private javax.swing.JPanel jpaCalc;
    private javax.swing.JSpinner jspNum;
    // End of variables declaration//GEN-END:variables
}
