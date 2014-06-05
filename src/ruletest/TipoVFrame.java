/*
 * TipoVFrame.java
 *
 * Created on 25 de marzo de 2008, 08:20 AM
 */
package ruletest;

import javax.swing.JOptionPane;

/**
 *
 * 
 */
public class TipoVFrame extends javax.swing.JInternalFrame
{

    Principal objP;
    String Numr, Motor;
    public String tipoV="";
    
    public String uso;
    public String Precio_cel;

    /** Creates new form TipoVFrame */
    public TipoVFrame(Principal objP)
    {
        this.objP = objP;
        initComponents();
    }
    
    public void setUse(String uso){
        this.uso = uso;
    }
    
    public void setInvestment(String Precio_cel){
        this.Precio_cel = Precio_cel;
    }
    
    public void setPhone(String tipoV){
        this.tipoV = tipoV;        
    }
    

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MotorGrup = new javax.swing.ButtonGroup();
        BAcep = new javax.swing.JButton();
        BCancel = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Precio = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jRBPregunta2Op1 = new javax.swing.JRadioButton();
        jRBPregunta2Op3 = new javax.swing.JRadioButton();
        jRBPregunta2Op2 = new javax.swing.JRadioButton();

        setClosable(true);
        setTitle("Preguntas");
        setToolTipText("");

        BAcep.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BAcep.setIcon(new javax.swing.ImageIcon("C:\\Users\\christian\\Documents\\GitHub\\UAEH\\Inteligencia Artificial\\Proyecto final\\recommender\\img\\iconh_64.png")); // NOI18N
        BAcep.setText("Recomiéndame");
        BAcep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAcepActionPerformed(evt);
            }
        });

        BCancel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BCancel.setText("Salir");
        BCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCancelActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Por favor responda las siguientes preguntas:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("1. ¿Cuánto le gustaría invertir en su teléfono nuevo?");

        jLabel5.setText("Me gustaría invertir $");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("2. ¿Qué uso piensa darle al celular?");

        jRBPregunta2Op1.setText("Solo voy a recibir llamadas y enviar mensajes (SMS)");
        jRBPregunta2Op1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBPregunta2Op1ActionPerformed(evt);
            }
        });

        jRBPregunta2Op3.setText("Busco lo último en tecnología");
        jRBPregunta2Op3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBPregunta2Op3ActionPerformed(evt);
            }
        });

        jRBPregunta2Op2.setText("Lo quiero para enviar correos, recibir whatpsapps, estar en internet y escuchar música");
        jRBPregunta2Op2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBPregunta2Op2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel5)
                        .addGap(1, 1, 1)
                        .addComponent(Precio, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRBPregunta2Op2)
                            .addComponent(jRBPregunta2Op1)
                            .addComponent(jRBPregunta2Op3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BAcep, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRBPregunta2Op1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRBPregunta2Op2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRBPregunta2Op3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BAcep))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCancelActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_BCancelActionPerformed

    private void BAcepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAcepActionPerformed
        // TODO add your handling code here:
        /*En 
         * esta parte llamar a formulario Resultados y hacer calculos
         */
        Precio_cel = Precio.getText();
        System.out.println("Resultado ----> " + Precio_cel);
        tipoV = objP.objBR.getTipoCel(Precio_cel, uso);
        System.out.println("Resultado ----> " + tipoV);
        if (tipoV==null)
        {
            JOptionPane.showMessageDialog(this, "Ocurrió un error, ¿podría ingresar datos diferentes?", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            JOptionPane.showMessageDialog(this, "El tipo de celular que le conviene de acuerdo al presupuesto, es el " + tipoV);
            //objP.lanzaFrame(tipoV);
            this.setVisible(false);
            new Resultados().setVisible(true);
        }        
        
    }//GEN-LAST:event_BAcepActionPerformed

    private void jRBPregunta2Op1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBPregunta2Op1ActionPerformed
        // TODO add your handling code here:
        if (jRBPregunta2Op1.isSelected()){
            uso = "basico";
            System.out.println("Resultado ----> " + uso);
            jRBPregunta2Op2.setSelected(false);
            jRBPregunta2Op3.setSelected(false);
        }
    }//GEN-LAST:event_jRBPregunta2Op1ActionPerformed

    private void jRBPregunta2Op2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBPregunta2Op2ActionPerformed
        // TODO add your handling code here:
        if (jRBPregunta2Op2.isSelected()){
           
            uso = "intermedio";
             System.out.println("Resultado ----> " + uso);
            jRBPregunta2Op1.setSelected(false);
            jRBPregunta2Op3.setSelected(false);
        }
    }//GEN-LAST:event_jRBPregunta2Op2ActionPerformed

    private void jRBPregunta2Op3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBPregunta2Op3ActionPerformed
        // TODO add your handling code here:
        if (jRBPregunta2Op3.isSelected()){ //generar
            uso = "superior";
             System.out.println("Resultado ----> " + uso);
            jRBPregunta2Op1.setSelected(false);
            jRBPregunta2Op2.setSelected(false);
        }
    }//GEN-LAST:event_jRBPregunta2Op3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BAcep;
    private javax.swing.JButton BCancel;
    private javax.swing.ButtonGroup MotorGrup;
    private javax.swing.JTextField Precio;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton jRBPregunta2Op1;
    private javax.swing.JRadioButton jRBPregunta2Op2;
    private javax.swing.JRadioButton jRBPregunta2Op3;
    // End of variables declaration//GEN-END:variables
}
