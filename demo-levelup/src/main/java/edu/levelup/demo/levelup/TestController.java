/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.levelup.demo.levelup;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author maria
 */
@RestController
@RequestMapping("/recorrido")
public class TestController {
    @Autowired
    RecorridoService recorridoService;
    
    @GetMapping
    public String getMessage(){
        return "Hola Mundo";
    }
    
    @GetMapping("/buscartodo")
    public ResponseEntity<List<Recorrido>> buscarTodo(){
        return ResponseEntity.ok(recorridoService.getRecorridos());
    }
    
    @GetMapping("/buscar/{id1}")
    public ResponseEntity<Recorrido> buscarById(@PathVariable("id1") Long id){
        return ResponseEntity.ok(recorridoService.getRecorridoById(id));
    }
    
    @PostMapping
    public ResponseEntity<Recorrido> saveRecorrido(@RequestBody Recorrido recorrido){
         return ResponseEntity.ok(recorridoService.saveRecorrido(recorrido));
    }
    
    
}
