/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.levelup.service;

import edu.levelup.domain.Recorrido;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.GenericType;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author maria
 */
public class RecorridoService{
    
    Client cliente;
    WebTarget webTarget;
    
    public RecorridoService(){
        cliente = ClientBuilder.newClient();
        webTarget = cliente.target("http://localhost:8081/demo/recorrido/");
    }
    
    public Recorrido getById(Long id){
        Response response = webTarget.path("buscar/"+id)
                .request(MediaType.APPLICATION_JSON)
                .get();
        
        if (response.getStatus() == Response.Status.OK.getStatusCode()){
            return response.readEntity(Recorrido.class);
        }else{
            throw new RuntimeException("Error al obtener recorrido");
        }
    }
    public List<Recorrido> getRecorridos(){
        Response response = webTarget.path("buscartodo")
                .request(MediaType.APPLICATION_JSON)
                .get();
        if (response.getStatus() == Response.Status.OK.getStatusCode()){
            return response.readEntity(new GenericType<List<Recorrido>>(){});
        }else{
            throw new RuntimeException("Error al obtener recorridos");
        }
    }
}
