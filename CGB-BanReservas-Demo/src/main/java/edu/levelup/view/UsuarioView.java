/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package edu.levelup.view;

import edu.levelup.domain.Usuario;
import edu.levelup.service.RecorridoService;
import jakarta.inject.Named;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author maria
 */
@Named(value = "usuarioView")
@ViewScoped
public class UsuarioView implements Serializable {
    private List<Usuario> products;

    private Usuario selectedProduct;

    private List<Usuario> selectedProducts;

    @Inject
    transient private  RecorridoService recorridoService;
    private String mensaje;


    /**
     * Creates a new instance of UsuarioView
     */
    public UsuarioView() {
    }

    public String getMensaje() {
        return recorridoService.getById(100L).toString();
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    

}
