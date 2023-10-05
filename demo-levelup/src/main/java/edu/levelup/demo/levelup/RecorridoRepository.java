/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.levelup.demo.levelup;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author maria
 * incluye todas las operaciones de crud, findAll
 */
@Repository
public interface RecorridoRepository extends JpaRepository<Recorrido, Long>{
    
}
