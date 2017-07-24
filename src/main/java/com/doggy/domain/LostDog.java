package com.doggy.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;


import javax.persistence.*;
import java.io.Serializable;
import java.util.*;

@Entity
@Inheritance
@Table(name = "doggyperdidos")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)

public class LostDog {

    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.AUTO)
    private Long IdLostDog;

    @Column(name = "Nombre")
    private String nombre;

    @Column(name = "UltimaUbicacion")
    private String ultimaUbicacion;

    @Column(name = "Descripcion")
    private String descripcion;

    @Column(name = "ContactoNombre")
    private String contactoNombre;

    @Column(name = "ContactoTelefono")
    private String contactoTelefono;

    @Column(name = "Color")
    private String color;

    @Column(name = "Raza")
    private String raza;


    public Long getIdLostDog() {
        return IdLostDog;
    }

    public void setIdLostDog(Long idLostDog) {
        IdLostDog = idLostDog;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        nombre = nombre;
    }

    public String getUltimaUbicacion() {
        return ultimaUbicacion;
    }

    public void setUltimaUbicacion(String ultimaUbicacion) {
        this.ultimaUbicacion = ultimaUbicacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getContactoNombre() {
        return contactoNombre;
    }

    public void setContactoNombre(String contactoNombre) {
        this.contactoNombre = contactoNombre;
    }

    public String getContactoTelefono() {
        return contactoTelefono;
    }

    public void setContactoTelefono(String contactoTelefono) {
        this.contactoTelefono = contactoTelefono;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public boolean equals(Object o){
        if(this == o){
            return true;
        }
        if (o == null || getClass() != o.getClass()){
            return false;
        }

        LostDog lostDog = (LostDog) o;
        if(lostDog.IdLostDog == null || IdLostDog == null){
            return false;
        }
        return Objects.equals(IdLostDog, lostDog.IdLostDog);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(IdLostDog);
    }

    @Override
    public String toString(){
        return "LostDog{ "+
                "id=" + IdLostDog + "'" +
                ", nombre=" + nombre + "'" +
                ", ultimaUbicacion ='" + ultimaUbicacion + "'" +
                ", descripcion ='" +descripcion + "'" +
                ", dontactoNombre ='" + contactoNombre + "'" +
                ", dontactoTelefono ='" + contactoTelefono + "'" +
                ", color ='" + color + "'" +
                ", raza ='" + raza + "'" +
                '}';

    }
}
