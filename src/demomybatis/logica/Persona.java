/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package demomybatis.logica;

import javax.swing.ImageIcon;

/**
 *
 * @author Estudiante
 */
public class Persona {
    
    
    private Integer cedula;
    private String nombres;
    private byte foto[];

    public Persona() {
    }

    public Persona(Integer cedula) {
        this.cedula = cedula;
    }

    public Persona(Integer cedula, String nombres) {
        this.cedula = cedula;
        this.nombres = nombres;
    }

    public Persona(Integer cedula, String nombres, byte foto[]) {
        this.cedula = cedula;
        this.nombres = nombres;
        this.foto = foto;
    }

    public Integer getCedula() {
        return cedula;
    }

    public void setCedula(Integer cedula) {
        this.cedula = cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte foto[]) {
        this.foto = foto;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombres=" + nombres + '}';
    }
}
