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
public class Usuarios {
    private String usuario;
    private String contra;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public Usuarios(String usuario, String contra) {
        this.usuario = usuario;
        this.contra = contra;
    }

    public Usuarios() {
    }
    
    
}
