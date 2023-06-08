/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posprogra2;

/**
 *
 * @author unicomer
 */

/**
 * Esta clase se utiliza para almacenar los datos de los pedidos 
 */
public class Pedidos {
    private int NumPed;
    private String ComidaPed;
    private String BebidaPed;
    private String DetComidaPed;
    private String DetBebidaPed;
    private String NumMesa;

    
    
    public int getNumPed() {
        return NumPed;
    }

    public void setNumPed(int NumPed) {
        this.NumPed = NumPed;
    }

    public String getComidaPed() {
        return ComidaPed;
    }

    public void setComidaPed(String ComidaPed) {
        this.ComidaPed = ComidaPed;
    }

    public String getBebidaPed() {
        return BebidaPed;
    }

    public void setBebidaPed(String BebidaPed) {
        this.BebidaPed = BebidaPed;
    }

    public String getDetComidaPed() {
        return DetComidaPed;
    }

    public void setDetComidaPed(String DetComidaPed) {
        this.DetComidaPed = DetComidaPed;
    }

    public String getDetBebidaPed() {
        return DetBebidaPed;
    }

    public void setDetBebidaPed(String DetBebidaPed) {
        this.DetBebidaPed = DetBebidaPed;
    }

    public String getNumMesa() {
        return NumMesa;
    }

    public void setNumMesa(String NumMesa) {
        this.NumMesa = NumMesa;
    }

    public Pedidos(int NumPed, String ComidaPed, String BebidaPed, String DetComidaPed, String DetBebidaPed, String NumMesa) {
        this.NumPed = NumPed;
        this.ComidaPed = ComidaPed;
        this.BebidaPed = BebidaPed;
        this.DetComidaPed = DetComidaPed;
        this.DetBebidaPed = DetBebidaPed;
        this.NumMesa = NumMesa;
    }

    public Pedidos(int NumPed) {
        this.NumPed = NumPed;
    }
    
    

    public Pedidos() {
    }
/**
 * Este metodo se utiliza para añadir el numero del pedido a combobox "CmbPedpen" con la frase pedido# y el numero del pedido
 */
    @Override
    public String toString() {
      return "Pedido#" + NumPed;
    }
}
