/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package edu.levelup.managed;


import edu.levelup.jsftest.pojo.Usuario;
import jakarta.enterprise.context.RequestScoped;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author maria
 */
@Named(value = "usuarioManagedBean")
@RequestScoped
public class UsuarioManagedBean implements Serializable {

    private String nombre;
     List<Usuario> lista;
    /**
     * Creates a new instance of UsuarioManagedBean
     */
    public UsuarioManagedBean() {
        nombre = "Ingrese su nombre";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public List<Usuario> getUsuarios(){
        System.out.println("------------- ejecuta");
        lista = new ArrayList<>();
        lista.add(new Usuario("Jose", 25 ));
        lista.add(new Usuario("Lucia", 22 ));
        lista.add(new Usuario("Carlos", 27 ));
        System.out.println("lista "+lista);
        return lista;
    }
    
}
