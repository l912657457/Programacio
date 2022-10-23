/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linzhihanlijunjie_l4.vista;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import linzhihanlijunjie_l4.controlador.Controlador;
import java.awt.event.KeyEvent;

/**
 * @author Zhihan_Lin i Junjie_Li
 */
public class FrmAfegirClient extends javax.swing.JDialog {

    /**
     * Creates new form FrmAfegirClient
     */
    private Controlador controlador;
    private java.awt.Frame parent;
    public FrmAfegirClient(java.awt.Frame parent, boolean modal, Controlador controlador) {
        super(parent, modal);
        ImageIcon icon =new ImageIcon("images\\Icono.png");
        this.setIconImage(icon.getImage());
        this.controlador = controlador;
        this.parent = parent;
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_correu = new javax.swing.JLabel();
        textfield_CorreuInput = new javax.swing.JTextField();
        label_nom = new javax.swing.JLabel();
        label_correupostal = new javax.swing.JLabel();
        textfield_NomInput = new javax.swing.JTextField();
        textfield_CorreuPostalInput = new javax.swing.JTextField();
        checkbox_ClientPremium = new javax.swing.JCheckBox();
        btn_Acceptar = new javax.swing.JButton();
        btn_Cancellar = new javax.swing.JButton();
        labal_dadesClient = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(700, 540));
        setSize(new java.awt.Dimension(700, 540));

        label_correu.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        label_correu.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        label_correu.setText("Correu:");

        label_nom.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        label_nom.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        label_nom.setText("Nom:");

        label_correupostal.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        label_correupostal.setText("Correu postal:");

        textfield_NomInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textfield_NomInputKeyPressed(evt);
            }
        });

        textfield_CorreuPostalInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textfield_CorreuPostalInputKeyPressed(evt);
            }
        });

        checkbox_ClientPremium.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        checkbox_ClientPremium.setText("Client premium");
        checkbox_ClientPremium.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                checkbox_ClientPremiumKeyPressed(evt);
            }
        });

        btn_Acceptar.setText("Acceptar");
        btn_Acceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AcceptarActionPerformed(evt);
            }
        });

        btn_Cancellar.setText("Cancel·lar");
        btn_Cancellar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CancellarActionPerformed(evt);
            }
        });

        labal_dadesClient.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        labal_dadesClient.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labal_dadesClient.setText("Dades Client");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(labal_dadesClient, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label_nom, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_correu, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_correupostal, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textfield_CorreuInput, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
                            .addComponent(textfield_NomInput, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
                            .addComponent(textfield_CorreuPostalInput, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
                            .addComponent(checkbox_ClientPremium))))
                .addContainerGap(66, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(btn_Acceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 197, Short.MAX_VALUE)
                .addComponent(btn_Cancellar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(labal_dadesClient, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(textfield_CorreuInput, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(label_correu, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_nom, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textfield_NomInput, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_correupostal, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textfield_CorreuPostalInput, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(checkbox_ClientPremium, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Acceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Cancellar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Mètode que accepta de afegir un client quan pulsem el butó acceptar
     * @param evt ActionEvent
     */
    private void btn_AcceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AcceptarActionPerformed
        
        String correu = textfield_CorreuInput.getText();
        String nom = textfield_NomInput.getText();
        String adreca = textfield_CorreuPostalInput.getText();
        boolean esPremium = checkbox_ClientPremium.isSelected();
        
        if(correu.equals("") || nom.equals("") || adreca.equals("")){
            JOptionPane.showMessageDialog(this,"No pots deixar en blanc algun apartat!","Error",JOptionPane.ERROR_MESSAGE);
        }else{ 
            try{
                controlador.AfegirClient(correu,nom,adreca,esPremium);
                FrmGestioClients frmGestioClients = (FrmGestioClients) parent;
                frmGestioClients.omplirLlistaClients();
                this.dispose();
            }catch (MercatException ex){
                JOptionPane.showMessageDialog(this,ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
            }
        }

    }//GEN-LAST:event_btn_AcceptarActionPerformed

    /**
    * Mètode que tanca el finestre de dialog quan cliquem el botó cancelar
    * @param evt el teclat que hem apretat
    */
    private void btn_CancellarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CancellarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_CancellarActionPerformed
        
    /**
     * Mètode per tal de que quan prenem el teclat ens fa el click automaticament al butó
     * @param evt el teclat que hem apretat
     */
    private void checkbox_ClientPremiumKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_checkbox_ClientPremiumKeyPressed
        PressKeyToClickButton(evt);
    }//GEN-LAST:event_checkbox_ClientPremiumKeyPressed

        /**
     * Mètode per tal de que quan prenem el teclat ens fa el click automaticament al butó
     * @param evt el teclat que hem apretat
     */
    private void textfield_NomInputKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textfield_NomInputKeyPressed
        PressKeyToClickButton(evt);
    }//GEN-LAST:event_textfield_NomInputKeyPressed

    /**
     * Mètode per tal de que quan prenem el teclat ens fa el click automaticament al butó
     * @param evt el teclat que hem apretat
     */
    private void textfield_CorreuPostalInputKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textfield_CorreuPostalInputKeyPressed
        PressKeyToClickButton(evt);
    }//GEN-LAST:event_textfield_CorreuPostalInputKeyPressed
      
    /**
     * Mètode de suport per tal de que quan prenem el teclat ens fa el click automaticament al butó
     * @param evt el teclat que hem apretat
     */
    private void PressKeyToClickButton(java.awt.event.KeyEvent evt){
        if(evt.getKeyChar() == KeyEvent.VK_ENTER){
            btn_Acceptar.doClick();
        }else if(evt.getKeyChar() == KeyEvent.VK_ESCAPE){
            btn_Cancellar.doClick();
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Acceptar;
    private javax.swing.JButton btn_Cancellar;
    private javax.swing.JCheckBox checkbox_ClientPremium;
    private javax.swing.JLabel labal_dadesClient;
    private javax.swing.JLabel label_correu;
    private javax.swing.JLabel label_correupostal;
    private javax.swing.JLabel label_nom;
    private javax.swing.JTextField textfield_CorreuInput;
    private javax.swing.JTextField textfield_CorreuPostalInput;
    private javax.swing.JTextField textfield_NomInput;
    // End of variables declaration//GEN-END:variables
}
