/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author unicomer
 */
public class VentanaMeseroMe extends javax.swing.JFrame {
    
    String mesaSeleccionada;

    /**
     * Creates new form VentanaMeseroMe
     */
    public VentanaMeseroMe() {
        initComponents();
        actualizarComboBoxMesasOcu();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        BtnAtras = new javax.swing.JButton();
        Mesa8 = new javax.swing.JLabel();
        Mesa7 = new javax.swing.JLabel();
        Mesa6 = new javax.swing.JLabel();
        Mesa5 = new javax.swing.JLabel();
        Mesa4 = new javax.swing.JLabel();
        Mesa3 = new javax.swing.JLabel();
        Mesa2 = new javax.swing.JLabel();
        Mesa1 = new javax.swing.JLabel();
        CmbNmesasO = new javax.swing.JComboBox<>();
        ButtonLibMesa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\unicomer\\OneDrive\\Documentos\\NetBeansProjects\\POSProgra2\\IconMesas.png")); // NOI18N
        jLabel2.setText("jLabel2");

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\unicomer\\OneDrive\\Documentos\\NetBeansProjects\\POSProgra2\\IconMesas.png")); // NOI18N
        jLabel4.setText("jLabel4");

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\unicomer\\OneDrive\\Documentos\\NetBeansProjects\\POSProgra2\\IconMesas.png")); // NOI18N
        jLabel7.setText("jLabel4");

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\unicomer\\OneDrive\\Documentos\\NetBeansProjects\\POSProgra2\\IconMesas.png")); // NOI18N
        jLabel8.setText("jLabel4");

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\unicomer\\OneDrive\\Documentos\\NetBeansProjects\\POSProgra2\\IconMesas.png")); // NOI18N
        jLabel9.setText("jLabel2");

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\unicomer\\OneDrive\\Documentos\\NetBeansProjects\\POSProgra2\\IconMesas.png")); // NOI18N
        jLabel10.setText("jLabel2");

        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\unicomer\\OneDrive\\Documentos\\NetBeansProjects\\POSProgra2\\IconMesas.png")); // NOI18N
        jLabel11.setText("jLabel2");

        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\unicomer\\OneDrive\\Documentos\\NetBeansProjects\\POSProgra2\\IconMesas.png")); // NOI18N
        jLabel12.setText("jLabel2");

        BtnAtras.setText("Atras");
        BtnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAtrasActionPerformed(evt);
            }
        });

        Mesa8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Mesa8.setText("M8");

        Mesa7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Mesa7.setText("M7");
        Mesa7.setToolTipText("");

        Mesa6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Mesa6.setText("M6");

        Mesa5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Mesa5.setText("M5");

        Mesa4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Mesa4.setText("M4");

        Mesa3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Mesa3.setText("M3");

        Mesa2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Mesa2.setText("M2");

        Mesa1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Mesa1.setText("M1");

        CmbNmesasO.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        ButtonLibMesa.setText("Liberar mesa");
        ButtonLibMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLibMesaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(Mesa1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Mesa2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CmbNmesasO, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ButtonLibMesa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(Mesa7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Mesa8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(Mesa5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Mesa6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(Mesa3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Mesa4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Mesa1)
                    .addComponent(Mesa2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Mesa3)
                    .addComponent(Mesa4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Mesa5)
                    .addComponent(Mesa6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Mesa7)
                    .addComponent(Mesa8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnAtras)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CmbNmesasO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ButtonLibMesa)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
 * Este metodo devuelve a la ventana de meseroPed
 */
    private void BtnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAtrasActionPerformed
        // TODO add your handling code here:
        VentanaMeseroPed VerPed = new VentanaMeseroPed();
        VerPed.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_BtnAtrasActionPerformed
/**
 * Este metodo hace un llamado al metodo eliminar mesa ocupada  
 */
    private void ButtonLibMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLibMesaActionPerformed
        // TODO add your handling code here:
        try {
            eliminarMesaSelecOcu();
            BorrarNumPedMe();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_ButtonLibMesaActionPerformed
/**
 * Este metodo actualiza el combobox de las mesas ocupadas
 */
    public void actualizarComboBoxMesasOcu() {
        try {

            File archivoOcu = new File("NmesasOcu.txt");
            BufferedReader br = new BufferedReader(new FileReader(archivoOcu));

            List<String> mesasOcupadas = new ArrayList<>();
            String linea;
            while ((linea = br.readLine()) != null) {
                mesasOcupadas.add(linea);
            }
            br.close();

            DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>(mesasOcupadas.toArray(new String[0]));
            CmbNmesasO.setModel(model);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
/**
 * Este metodo elimina la mesa seleccionada del combobox de mesas ocupadas
 */
    public void eliminarMesaSelecOcu() throws IOException {
        mesaSeleccionada = CmbNmesasO.getSelectedItem().toString();

        List<String> mesasActualizadas = new ArrayList<>();

        File archivoOcu = new File("NmesasOcu.txt");
        BufferedReader br = new BufferedReader(new FileReader(archivoOcu));
        String linea;
        while ((linea = br.readLine()) != null) {
            if (!linea.equals(mesaSeleccionada)) {
                mesasActualizadas.add(linea);
            }
        }
        br.close();

        BufferedWriter bw = new BufferedWriter(new FileWriter(archivoOcu));
        for (String mesa : mesasActualizadas) {
            bw.write(mesa);
            bw.newLine();
        }
        bw.close();

        actualizarComboBoxMesasOcu();

        File archivoDis = new File("NmesasDis.txt");
        BufferedWriter bwDis = new BufferedWriter(new FileWriter(archivoDis, true));
        bwDis.write(mesaSeleccionada);
        bwDis.newLine();
        bwDis.close();

    }
/**
 * Este metodo elimina el numero de pedido del label de la mesa seleccionada en el combobox de mesas ocupadas
 */
    public void BorrarNumPedMe(){
        if (mesaSeleccionada.equals("Mesa1")) {
            Mesa1.setText("M1");
        }
        if (mesaSeleccionada.equals("Mesa2")) {
            Mesa2.setText("M2");
        }
       if (mesaSeleccionada.equals("Mesa3")) {
            Mesa3.setText("M3");
        }
        if (mesaSeleccionada.equals("Mesa4")) {
            Mesa4.setText("M4");
        }
        if (mesaSeleccionada.equals("Mesa5")) {
            Mesa5.setText("M5");
        }
        if (mesaSeleccionada.equals("Mesa6")) {
            Mesa6.setText("M6");
        }
        if (mesaSeleccionada.equals("Mesa7")) {
            Mesa7.setText("M7");
        }
        if (mesaSeleccionada.equals("Mesa8")) {
            Mesa8.setText("M8");
        }
        System.out.println(mesaSeleccionada);
    }
/**
 * Este metodo reemplaza el texto del label con el numero del pedido que se le asigno a dicha mesa 
 */
    public void setNumeroPedido(String numeroPedido, String NumMesa) {
        if (NumMesa.equals("Mesa1")) {
            Mesa1.setText(numeroPedido);
        }
        if (NumMesa.equals("Mesa2")) {
            Mesa2.setText(numeroPedido);
        }
        if (NumMesa.equals("Mesa3")) {
            Mesa3.setText(numeroPedido);
        }
        if (NumMesa.equals("Mesa4")) {
            Mesa4.setText(numeroPedido);
        }
        if (NumMesa.equals("Mesa5")) {
            Mesa5.setText(numeroPedido);
        }
        if (NumMesa.equals("Mesa6")) {
            Mesa6.setText(numeroPedido);
        }
        if (NumMesa.equals("Mesa7")) {
            Mesa7.setText(numeroPedido);
        }
        if (NumMesa.equals("Mesa8")) {
            Mesa8.setText(numeroPedido);
        }
    }

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
            java.util.logging.Logger.getLogger(VentanaMeseroMe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaMeseroMe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaMeseroMe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaMeseroMe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaMeseroMe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAtras;
    private javax.swing.JButton ButtonLibMesa;
    private javax.swing.JComboBox<String> CmbNmesasO;
    private javax.swing.JLabel Mesa1;
    private javax.swing.JLabel Mesa2;
    private javax.swing.JLabel Mesa3;
    private javax.swing.JLabel Mesa4;
    private javax.swing.JLabel Mesa5;
    private javax.swing.JLabel Mesa6;
    private javax.swing.JLabel Mesa7;
    private javax.swing.JLabel Mesa8;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
