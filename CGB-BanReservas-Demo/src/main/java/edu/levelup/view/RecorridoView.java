/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package edu.levelup.view;

import edu.levelup.domain.Recorrido;
import edu.levelup.service.RecorridoService;
import jakarta.inject.Named;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.primefaces.event.ToggleEvent;
import org.primefaces.model.Visibility;
import org.primefaces.poseidon.domain.Product;

/**
 *
 * @author maria
 */
@Named(value = "recorridoView")
@ViewScoped
public class RecorridoView implements Serializable {

    private List<Recorrido> recorridos;
    private List<Recorrido> selectedRecorridos;

    private Recorrido selectedRecorrido;

    @Inject
    transient private RecorridoService recorridoService;

    
    
    /**
     * Creates a new instance of RecorridoView
     */
    public RecorridoView() {
        selectedRecorrido = new Recorrido();
        selectedRecorridos = new ArrayList<>();
    }

    public List<Recorrido> getRecorridos() {
        recorridos = recorridoService.getRecorridos();
        //System.out.println("recorridos: "+recorridos);
        return recorridos;
 
    }

    public void setRecorridos(List<Recorrido> recorridos) {
        this.recorridos = recorridos;
    }

    public Recorrido getSelectedRecorrido() {
        return selectedRecorrido;
    }

    public void setSelectedRecorrido(Recorrido selectedRecorrido) {
        this.selectedRecorrido = selectedRecorrido;
    }

    public String save(){
        System.out.println("--------> form "+selectedRecorrido);
        Recorrido temp = recorridoService.getById(selectedRecorrido.getIdRecorrido());
                System.out.println("--------> db "+temp);
        
        return "crud";
    }

    public List<Recorrido> getSelectedRecorridos() {
        return selectedRecorridos;
    }

    public void setSelectedRecorridos(List<Recorrido> selectedRecorridos) {
        this.selectedRecorridos = selectedRecorridos;
    }

    public RecorridoService getRecorridoService() {
        return recorridoService;
    }

    public void setRecorridoService(RecorridoService recorridoService) {
        this.recorridoService = recorridoService;
    }
    
     public void onRowToggle(ToggleEvent event) {
    }
}
