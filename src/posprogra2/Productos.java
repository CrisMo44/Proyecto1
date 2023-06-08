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
 * Esta clase se utiliza para almacenar los datos de los productos del inventario
 */
public class Productos {
    private String Nproducto;
    private int cantidad;

    public String getNproducto() {
        return Nproducto;
    }

    public void setNproducto(String Nproducto) {
        this.Nproducto = Nproducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Productos(String Nproducto, int cantidad) {
        this.Nproducto = Nproducto;
        this.cantidad = cantidad;
    }

    public Productos() {
    }
/**
 * Este metodo se utiliza para restar la cantidad de productos del inventario
 */
    public void RCantidad(int cantidad) {
        this.cantidad -= cantidad;
    }
/**
 * Este metodo se utiliza para sumar la cantidad de productos del inventario
 */
  public void ACantidad(int cantidad) {
        this.cantidad += cantidad;
    }
    
}
