/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package edu.levelup.managed;

import javax.inject.Named;
import jakarta.faces.view.ViewScoped;
import java.io.Serializable;

/**
 *
 * @author maria
 */
@Named(value = "recorridoManagedBean")
@ViewScoped
public class RecorridoManagedBean implements Serializable {


    private String duracion;
    private String nombre;

    private String descripcion;

    private String pais;
    private Long idRecorrido;
    /**
     * Creates a new instance of RecorridoManagedBean
     */
    public RecorridoManagedBean() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Long getIdRecorrido() {
        return idRecorrido;
    }

    public void setIdRecorrido(Long idRecorrido) {
        this.idRecorrido = idRecorrido;
    }
    
}
