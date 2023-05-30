/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author unicomer
 */
public class VentanaMesero extends javax.swing.JFrame {

    private int contadorPedidos = 0;
    /**
     * Creates new form VentanaEmpleado
     */
    public VentanaMesero() {
        initComponents();
        
       try {
            DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
            BufferedReader br = new BufferedReader(new FileReader("MenuComida.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                for (String value : values) {
                    model.addElement(value);
                }
            }
            br.close();
            PedidoCo.setModel(model);
        } catch (Exception e) {
            e.printStackTrace();
        }
       try {
            DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
            BufferedReader br = new BufferedReader(new FileReader("MenuBebidas.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                for (String value : values) {
                    model.addElement(value);
                }
            }
            br.close();
            PedidoBeb.setModel(model);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
        
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PedidoCo = new javax.swing.JComboBox<>();
        PedidoBeb = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        ModComida = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        ModBebida = new javax.swing.JTextArea();
        EnvPedido = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ConfirmPed = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PedidoCo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        PedidoCo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PedidoCoMouseClicked(evt);
            }
        });
        PedidoCo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PedidoCoActionPerformed(evt);
            }
        });

        PedidoBeb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        ModComida.setColumns(20);
        ModComida.setRows(5);
        jScrollPane3.setViewportView(ModComida);

        ModBebida.setColumns(20);
        ModBebida.setRows(5);
        jScrollPane4.setViewportView(ModBebida);

        EnvPedido.setText("Enviar");
        EnvPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnvPedidoActionPerformed(evt);
            }
        });

        ConfirmPed.setColumns(20);
        ConfirmPed.setRows(5);
        jScrollPane1.setViewportView(ConfirmPed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PedidoCo, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(PedidoBeb, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                                .addComponent(EnvPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PedidoBeb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PedidoCo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EnvPedido)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PedidoCoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PedidoCoActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_PedidoCoActionPerformed

    private void PedidoCoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PedidoCoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_PedidoCoMouseClicked

    private void EnvPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnvPedidoActionPerformed
        // TODO add your handling code here:
        contadorPedidos++;
        String ComidaSelec = PedidoCo.getSelectedItem().toString();
    String BebidaSelec = PedidoBeb.getSelectedItem().toString();
    String DeComida = ModComida.getText();
    String DeBebida = ModBebida.getText();

    String contenido = "Pedido#"+ contadorPedidos + 
                       "\nComida: " + ComidaSelec + 
                       "\nBebida: " + BebidaSelec +
                       "\nDetalles de comida: " + DeComida + 
                       "\nDetalles de bebida: " + DeBebida +
                       "\n  ";
    String archivoSalida = "PedidoCocina.txt";

    try {
        BufferedWriter writer = new BufferedWriter(new FileWriter(archivoSalida, true)); 
        writer.write(contenido);
        writer.newLine();
        writer.close();
        ConfirmPed.setText("Pedido#"+ contadorPedidos + " enviado");
    } catch (Exception e) {
        e.printStackTrace();
    }
    }//GEN-LAST:event_EnvPedidoActionPerformed
    
    
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
            java.util.logging.Logger.getLogger(VentanaMesero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaMesero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaMesero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaMesero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaMesero().setVisible(true);
            }
        });
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea ConfirmPed;
    private javax.swing.JButton EnvPedido;
    private javax.swing.JTextArea ModBebida;
    private javax.swing.JTextArea ModComida;
    private javax.swing.JComboBox<String> PedidoBeb;
    private javax.swing.JComboBox<String> PedidoCo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables

}
