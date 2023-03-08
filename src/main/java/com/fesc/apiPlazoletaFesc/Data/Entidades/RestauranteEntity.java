package com.fesc.apiPlazoletaFesc.Data.Entidades;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Index;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity(name = "restaurante")
@Table(indexes = {
    @Index(columnList = "nit", name = "index_nit", unique = true)
}) 
public class RestauranteEntity implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private long nit;

    @Column(nullable = false)
    private String direccion;

    @Column(nullable = false)
    private long telefono;
    
    @Column(nullable = false)
    private String urlLogo;

    @ManyToOne
    @JoinColumn(name = "id_usuarioEntity")
    private UsuarioEntity usuarioEntity;

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getNit() {
        return this.nit;
    }

    public void setNit(long nit) {
        this.nit = nit;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public long getTelefono() {
        return this.telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public String getUrlLogo() {
        return this.urlLogo;
    }

    public void setUrlLogo(String urlLogo) {
        this.urlLogo = urlLogo;
    }

    public UsuarioEntity getUsuarioEntity() {
        return this.usuarioEntity;
    }

    public void setUsuarioEntity(UsuarioEntity usuarioEntity) {
        this.usuarioEntity = usuarioEntity;
    }
}
