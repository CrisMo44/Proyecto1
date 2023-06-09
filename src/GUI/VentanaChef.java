/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import posprogra2.Pedidos;
import posprogra2.Productos;

/**
 *
 * @author unicomer
 */


public class VentanaChef extends javax.swing.JFrame {

    ArrayList<Pedidos> listaPedidos = new ArrayList<>();
    
    DefaultComboBoxModel<Pedidos> modeloComboBox = new DefaultComboBoxModel<>();
    ArrayList<Productos> ListInv = new ArrayList<>();

    /**
     * Creates new form VentanaChef
     */
    public VentanaChef() {
        initComponents();
        cargarPedidos();
        cargarInventario();
        mostrarInventarioEnComboBox();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CmbPedpen = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        PedComplete = new javax.swing.JButton();
        BtnEnv = new javax.swing.JButton();
        CmbInvDis = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TxfCantidad = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CmbPedpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmbPedpenActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        PedComplete.setText("Pedido listo");
        PedComplete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PedCompleteActionPerformed(evt);
            }
        });

        BtnEnv.setText("Enviar");
        BtnEnv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEnvActionPerformed(evt);
            }
        });

        CmbInvDis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tomate", "Lechuga", "Repollo", "Cebolla", "Chile", "Culantro", "Ajo", "Cebollino", "Papa", "Chayote", "Limones", "Frijoles" }));

        jLabel1.setText("Producto utilizado");

        jLabel2.setText("Cantidad utilizada");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(CmbPedpen, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BtnEnv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CmbInvDis, 0, 125, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel1))
                            .addComponent(TxfCantidad))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(PedComplete, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(CmbPedpen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(PedComplete))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CmbInvDis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxfCantidad, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(BtnEnv)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
 * Este metodo es para cuando se de click en el botton se elimine el numero del pedido del combobox y su descripcion del textarea
 */
    private void PedCompleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PedCompleteActionPerformed
        // TODO add your handling code here:   
    String seleccion = CmbPedpen.getSelectedItem().toString();
    String numeroPedidoString = seleccion.substring(seleccion.indexOf("#") + 1);
    int numeroPedidoSeleccionado = Integer.parseInt(numeroPedidoString);
    
   
    Pedidos pedidoSeleccionado = buscarPedido(numeroPedidoSeleccionado);
    
    if (pedidoSeleccionado != null) {
       
        listaPedidos.remove(pedidoSeleccionado);
        
       
        CmbPedpen.removeItemAt(CmbPedpen.getSelectedIndex());
        
        actualizarArchivoPedidos();
        
        int indiceSeleccionado = CmbPedpen.getSelectedIndex();
        if (indiceSeleccionado != -1) {
            String seleccionActual = CmbPedpen.getItemAt(indiceSeleccionado).toString();
            String numeroPedidoActualString = seleccionActual.substring(seleccionActual.indexOf("#") + 1);
            int numeroPedidoActual = Integer.parseInt(numeroPedidoActualString);
            mostrarDescripcionPedidoSeleccionado(numeroPedidoActual);
        } else {
            jTextArea1.setText("");
        }
    }

    }//GEN-LAST:event_PedCompleteActionPerformed
/**
 * Este metodo lo que hace es que al seleccionar el numero de pedido, se va mostrar la descripcion de dicho pedido
 */
    private void CmbPedpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmbPedpenActionPerformed
        // TODO add your handling code here:
        String seleccion = CmbPedpen.getSelectedItem().toString();
        String numeroPedidoString = seleccion.substring(seleccion.indexOf("#") + 1);
        int numeroPedidoSeleccionado = Integer.parseInt(numeroPedidoString);
        mostrarDescripcionPedidoSeleccionado(numeroPedidoSeleccionado);
    }//GEN-LAST:event_CmbPedpenActionPerformed
/**
 * Este metodo al presionar el boton enviar, le resta al inventario la cantidad del producto que selecciono en el combobox
 */
    private void BtnEnvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEnvActionPerformed
        // TODO add your handling code here:
    String Nproducto = CmbInvDis.getSelectedItem().toString();
    int CantidadP = Integer.parseInt(TxfCantidad.getText());
    
        restarCantidadDelInventario(Nproducto, CantidadP);
    }//GEN-LAST:event_BtnEnvActionPerformed

/**
 * Carga los pedidos desde el archivo "PedidoCocina.txt" y los agrega a la lista de pedidos y al ComboBox de pedidos pendientes.
 */
    public void cargarPedidos() {

        try (BufferedReader br = new BufferedReader(new FileReader("PedidoCocina.txt"))) {
            String linea;
            Pedidos pedido = null;
            while ((linea = br.readLine()) != null) {
                if (linea.startsWith("Pedido#")) {
                    if (pedido != null) {
                        listaPedidos.add(pedido);
                    }
                    int numeroPedido = Integer.parseInt(linea.split(",")[0].replace("Pedido#", "").trim());
                    pedido = new Pedidos(numeroPedido);
                } else if (pedido != null) {
                    if (linea.startsWith("Comida:")) {
                        pedido.setComidaPed(linea.replace("Comida:", "").trim());
                    } else if (linea.startsWith("Bebida:")) {
                        pedido.setBebidaPed(linea.replace("Bebida:", "").trim());
                    } else if (linea.startsWith("Detalles de comida:")) {
                        pedido.setDetComidaPed(linea.replace("Detalles de comida:", "").trim());
                    } else if (linea.startsWith("Detalles de bebida:")) {
                        pedido.setDetBebidaPed(linea.replace("Detalles de bebida:", "").trim());
                    } else if (linea.startsWith("Numero de mesa:")) {
                        pedido.setNumMesa(linea.replace("Numero de mesa:", "").trim());
                    }
                }
            }
            if (pedido != null) {
                listaPedidos.add(pedido);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (Pedidos pedido : listaPedidos) {
            CmbPedpen.addItem(pedido.toString());
        }

    }
/**
 * Este metodo muestra la descripcion del pedido que recibe como parametro
 */
    public void mostrarDescripcionPedidoSeleccionado(int numeroPedido) {

        Pedidos pedidoSeleccionado = buscarPedido(numeroPedido);

        if (pedidoSeleccionado != null) {

            String descripcionPedido = obtenerDescripcionPedido(pedidoSeleccionado);

            jTextArea1.setText(descripcionPedido);
        }
    }
/**
 * Este metodo busca el numero del pedido recibido como parametro en la lista de pedidos 
 */
    public Pedidos buscarPedido(int numeroPedido) {

        for (Pedidos pedido : listaPedidos) {
            if (pedido.getNumPed() == numeroPedido) {
                return pedido;
            }
        }
        return null;
    }
/**
 * Este metodo describe la descripcion del pedido 
 */
    public String obtenerDescripcionPedido(Pedidos pedido) {

        StringBuilder descripcion = new StringBuilder();
        descripcion.append("Comida: ").append(pedido.getComidaPed()).append("\n");
        descripcion.append("Bebida: ").append(pedido.getBebidaPed()).append("\n");
        descripcion.append("Detalles de comida: ").append(pedido.getDetComidaPed()).append("\n");
        descripcion.append("Detalles de bebida: ").append(pedido.getDetBebidaPed()).append("\n");
        descripcion.append("Numero de mesa: ").append(pedido.getNumMesa()).append("\n");
        return descripcion.toString();
    }
/**
 * Carga la lista de ListInv con los datos InventarioDis.txt
 */
    public void cargarInventario() {
        try (BufferedReader br = new BufferedReader(new FileReader("inventarioDis.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] elementos = linea.split(":");
                if (elementos.length == 2) {
                    String producto = elementos[0].trim();
                    int cantidad = Integer.parseInt(elementos[1].trim());
                    Productos p = new Productos(producto, cantidad);
                    ListInv.add(p);
                    
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
/**
 * Este metodo muestra el numero del pedido en el combobox 
 */
    public void mostrarInventarioEnComboBox() {
        CmbInvDis.removeAllItems();
        for (Productos producto : ListInv) {
            CmbInvDis.addItem(producto.getNproducto());
        }
    }
/**
 * Este metodo actualiza el archivo txt de inventario
 */
     public void actualizarArchivoInventario() {
        try (FileWriter writer = new FileWriter("InventarioDis.txt")) {
            for (Productos producto : ListInv) {
                writer.write(producto.getNproducto()+ ": " + producto.getCantidad() + System.lineSeparator());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
/**
 * Este metodo resta la cantidad del producto seleccionado 
 */
    public void restarCantidadDelInventario(String producto, int cantidad) {
        for (Productos p : ListInv) {
            if (p.getNproducto().equals(producto)) {
                p.RCantidad(cantidad);
                break;
            }
        }
        actualizarArchivoInventario();
    } 
/**
 * Este metodo suma a la cantidad del producto seleccionado 
 */
    public void agregarCantidadAlInventario(String producto, int cantidad) {
    for (Productos p : ListInv) {
        if (p.getNproducto().equals(producto)) {
            p.ACantidad(cantidad);
            break;
        }
    }
    actualizarArchivoInventario();
}
/**
 * Este metodo verifica que el producto exista en la lista 
 */
    public boolean existeProducto(String nombreProducto) {
    for (Productos producto : ListInv) {
        if (producto.getNproducto().equals(nombreProducto)) {
            return true;
        }
    }
    return false;
}
/**
 * Este metodo agrega un nuevo producto a la lista del inventario
 */
    public void agregarNuevoProducto(String nombreProducto, int cantidad) {
    if (!existeProducto(nombreProducto)) {
        Productos nuevoProducto = new Productos(nombreProducto, cantidad);
        ListInv.add(nuevoProducto);
    }
    actualizarArchivoInventario();
}
/**
 * Este metodo actualiza el archivo txt de pedidos
 */
    public void actualizarArchivoPedidos() {
    try (FileWriter writer = new FileWriter("PedidoCocina.txt")) {
        for (Pedidos pedido : listaPedidos) {
            writer.write("Pedido#" + pedido.getNumPed() + "\n");
            writer.write("Comida: " + pedido.getComidaPed() + "\n");
            writer.write("Bebida: " + pedido.getBebidaPed() + "\n");
            writer.write("Detalles de comida: " + pedido.getDetComidaPed() + "\n");
            writer.write("Detalles de bebida: " + pedido.getDetBebidaPed() + "\n");
            writer.write("Numero de mesa: " + pedido.getNumMesa() + "\n");
            writer.write("\n");
        }
    } catch (IOException e) {
        e.printStackTrace();
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
            java.util.logging.Logger.getLogger(VentanaChef.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaChef.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaChef.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaChef.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaChef().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnEnv;
    private javax.swing.JComboBox<String> CmbInvDis;
    private javax.swing.JComboBox<String> CmbPedpen;
    private javax.swing.JButton PedComplete;
    private javax.swing.JTextField TxfCantidad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
