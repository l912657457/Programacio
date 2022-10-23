/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linzhihanlijunjie_l4.vista;

import java.io.File;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

import linzhihanlijunjie_l4.controlador.Controlador;


/**
 *
 * @author Zhihan_Lin i Junjie_Li
 */
public class AppMercatUB extends javax.swing.JFrame {

    /**
     * Creates new form AppMercatUB
     */
    private Controlador controlador;
    public AppMercatUB() {
        ImageIcon icon = new ImageIcon("images\\Icono.png");
        this.setIconImage(icon.getImage());
        initComponents();
        controlador = new Controlador();
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

        Label_MercatUbMenu = new javax.swing.JLabel();
        btnGestioClients = new javax.swing.JButton();
        btnGestioArticles = new javax.swing.JButton();
        btnGestioComandes = new javax.swing.JButton();
        btnGuardar_Dades = new javax.swing.JButton();
        btn_Salir = new javax.swing.JButton();
        btnCarregar_Dades = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(700, 540));
        setSize(new java.awt.Dimension(700, 540));

        Label_MercatUbMenu.setFont(new java.awt.Font("Forte", 0, 48)); // NOI18N
        Label_MercatUbMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_MercatUbMenu.setText("MERCAT UB MENU");

        btnGestioClients.setText("Gestió Clients");
        btnGestioClients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestioClientsActionPerformed(evt);
            }
        });

        btnGestioArticles.setText("Gestió Articles");
        btnGestioArticles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestioArticlesActionPerformed(evt);
            }
        });

        btnGestioComandes.setText("Gestió Comandes");
        btnGestioComandes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestioComandesActionPerformed(evt);
            }
        });

        btnGuardar_Dades.setText("Guardar Dades");
        btnGuardar_Dades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardar_DadesActionPerformed(evt);
            }
        });

        btn_Salir.setText("Salir");
        btn_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SalirActionPerformed(evt);
            }
        });

        btnCarregar_Dades.setText("Carregar Dades");
        btnCarregar_Dades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarregar_DadesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnGestioArticles, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(btnGuardar_Dades, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(btnGestioComandes, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(btnCarregar_Dades, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(btnGestioClients, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(311, 311, 311)
                        .addComponent(btn_Salir, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                        .addGap(76, 76, 76)))
                .addGap(250, 250, 250))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(Label_MercatUbMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(38, 38, 38))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(Label_MercatUbMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 62, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGestioClients, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGestioArticles, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGestioComandes, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGuardar_Dades, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                .addGap(12, 12, 12)
                .addComponent(btnCarregar_Dades, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_Salir, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    
    /**
    * metode per saltar al JFrame de GestioClient quan prenem el butó GestioClient
    * @param evt Action event
    */
    private void btnGestioClientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestioClientsActionPerformed
        FrmGestioClients frameGestioClients = new FrmGestioClients(controlador);
        frameGestioClients.setTitle("Gestio Clients");
        frameGestioClients.pack(); 
        frameGestioClients.setVisible(true);
        
    }//GEN-LAST:event_btnGestioClientsActionPerformed
   
    /**
    * metode per saltar al JFrame de GestioArticle quan prenem el butó GestioArticles
    * @param evt Action event
    */
    private void btnGestioArticlesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestioArticlesActionPerformed
        FrmGestioArticles frmGestioArticles = new FrmGestioArticles(controlador);
        frmGestioArticles.setTitle("Gestió Articles");
        frmGestioArticles.pack();
        frmGestioArticles.setVisible(true);
        
    }//GEN-LAST:event_btnGestioArticlesActionPerformed

    /**
    * metode per saltar al JFrame de GestioComandes quan prenem el butó GestioComandes
    * @param evt Action event
    */
    private void btnGestioComandesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestioComandesActionPerformed
        FrmGestioComandes frmGestioComandes = new FrmGestioComandes(controlador);
        frmGestioComandes.setTitle("Gestió Comandes");
        frmGestioComandes.pack();
        frmGestioComandes.setVisible(true);
    }//GEN-LAST:event_btnGestioComandesActionPerformed
    
    /**
    * metode per obrir un JOptionPane per guardar les dates quan prenem el butó Guardar dades
    * @param evt Action event
    */
    private void btnGuardar_DadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardar_DadesActionPerformed
        try{
            String fileName = JOptionPane.showInputDialog(this,"Introdueix el nom de l'arxiu: ", "Guardar Dades", JOptionPane.QUESTION_MESSAGE);
            controlador.GuardarDades(fileName);
            JOptionPane.showMessageDialog(this,"Guardat correctament","Information",JOptionPane.INFORMATION_MESSAGE);
        }catch(MercatException ex){
            JOptionPane.showMessageDialog(this,ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }catch(IOException ex){
            JOptionPane.showMessageDialog(this,ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }catch(Exception ex){
            //Exception per cancelar el procés de guardar dades.
        }  
    }//GEN-LAST:event_btnGuardar_DadesActionPerformed

    /**
    * metode per sortir de la finestra actual quan prenem butó salir
    * @param evt Action event
    */
    private void btn_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SalirActionPerformed
       this.dispose();
    }//GEN-LAST:event_btn_SalirActionPerformed

    /**
    * metode per carregar les date quan prenem el butó Carregar dades
    * @param evt Action event
    */
    private void btnCarregar_DadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarregar_DadesActionPerformed
        try{
            File fitxer; 
            JFileChooser seleccio = new JFileChooser(); 
            int resultat = seleccio.showOpenDialog(this);
            if (resultat == JFileChooser.APPROVE_OPTION) { 
                fitxer = seleccio.getSelectedFile(); 
                String fileName = fitxer.getName();
                controlador.CarregaDades(fileName);
                JOptionPane.showMessageDialog(this,"Carregat correctament","Information",JOptionPane.INFORMATION_MESSAGE);
            }
        }catch(MercatException ex){
            JOptionPane.showMessageDialog(this,ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }catch(ClassNotFoundException ex){
            JOptionPane.showMessageDialog(this,ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }catch(IOException ex){
            JOptionPane.showMessageDialog(this,ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnCarregar_DadesActionPerformed
   
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
            java.util.logging.Logger.getLogger(AppMercatUB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppMercatUB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppMercatUB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppMercatUB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppMercatUB().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label_MercatUbMenu;
    private javax.swing.JButton btnCarregar_Dades;
    private javax.swing.JButton btnGestioArticles;
    private javax.swing.JButton btnGestioClients;
    private javax.swing.JButton btnGestioComandes;
    private javax.swing.JButton btnGuardar_Dades;
    private javax.swing.JButton btn_Salir;
    // End of variables declaration//GEN-END:variables
}
