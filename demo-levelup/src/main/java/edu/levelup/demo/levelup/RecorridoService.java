/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.levelup.demo.levelup;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author maria
 */
@Service
public class RecorridoService {
    @Autowired
    RecorridoRepository recorridoRepository;
    
   
    public List<Recorrido> getRecorridos(){
        
        return recorridoRepository.findAll();
    }
    
    public Recorrido getRecorridoById(Long id){
        return recorridoRepository.findById(id).orElse(null);
    }
    
    public Recorrido saveRecorrido(Recorrido recorrido){
        return recorridoRepository.save(recorrido);
    }
}
