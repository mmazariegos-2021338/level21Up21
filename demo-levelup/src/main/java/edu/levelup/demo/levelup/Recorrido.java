/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.levelup.demo.levelup;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author maria
 */
@Data
@Entity
@Table(name="recorrido")
public class Recorrido implements Serializable {
    
    @Id
    @Column(name="id_recorrido")
    private Long idRecorrido;
    
    @Column(name="nombre")
    private String nombre;
    
    @Column(name="descripcion")
    private String descripcion;
    
    @Column(name="duracion")
    private Integer duracion;
    
    @Column(name="pais")
    private String pais;

     // relacion de muchos a muchos
  /*
    @JoinTable(name="bitacora",
            joinColumns = @JoinColumn(name="id_recorrido"),
            inverseJoinColumns = @JoinColumn(name="id_turista")
    )
    @ManyToMany(fetch = FetchType.LAZY)
    @JsonManagedReference
    private List<Recorrido> turistas; */

    
    /*
    public Long getIdRecorrido() {
        return idRecorrido;
    }

    public void setIdRecorrido(Long idRecorrido) {
        this.idRecorrido = idRecorrido;
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

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
*/
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.idRecorrido);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Recorrido other = (Recorrido) obj;
        return Objects.equals(this.idRecorrido, other.idRecorrido);
    }

    @Override
    public String toString() {
        return "Recorrido{" + "idRecorrido=" + idRecorrido + ", nombre=" + 
                nombre + ", descripcion=" + descripcion + ", duracion=" + duracion +
                ", pais=" + pais + '}';
    }

    /*
    public List<Recorrido> getTuristas() {
        return turistas;
    }

    public void setTuristas(List<Recorrido> turistas) {
        this.turistas = turistas;
    }
*/
    
}
