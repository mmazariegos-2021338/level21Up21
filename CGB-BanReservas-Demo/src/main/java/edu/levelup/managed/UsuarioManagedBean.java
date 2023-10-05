/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package edu.levelup.managed;


import edu.levelup.domain.Usuario;
import jakarta.enterprise.context.RequestScoped;
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
    String codigo;
    String email;
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

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Usuario> getLista() {
        return lista;
    }

    public void setLista(List<Usuario> lista) {
        this.lista = lista;
    }
    
    public List<Usuario> getUsuarios(){
        //codigo, nombre, puesto, correo, sucursal, unidadNegocio
        System.out.println("------------- ejecuta");
        lista = new ArrayList<>();
        lista.add(new Usuario("USUARIO1", "Usuario 1", "Programador" , "programador@gmail.com", "Central", " Unidad de NEgocio 1",
                                1, "test123".toCharArray()));
        lista.add(new Usuario("USUARIO2", "Usuario 1", "Programador" , "programador@gmail.com", "Central", " Unidad de NEgocio 1",
                                1, "test123".toCharArray()));
        lista.add(new Usuario("USUARIO3", "Usuario 1", "Programador" , "programador@gmail.com", "Central", " Unidad de NEgocio 1",
                                1, "test123".toCharArray()));
        System.out.println("lista "+lista);
        return lista;
    }
    
}
