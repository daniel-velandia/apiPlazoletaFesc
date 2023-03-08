package com.fesc.apiPlazoletaFesc.Data.Entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity(name = "plato")
public class PlatoEntity {
    
    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false)
    private String nombrePlato;
    
    @Column(nullable = false)
    private long precio;

    @Column(nullable = false)
    private String descripción;

    @Column(nullable = false)
    private String urlImagen;

    @Column(nullable = false)
    private String categoria;

    @Column(nullable = false)
    private boolean activo;

    @ManyToOne
    @JoinColumn(name = "id_restauranteEntity")
    private RestauranteEntity restauranteEntity;

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombrePlato() {
        return this.nombrePlato;
    }

    public void setNombrePlato(String nombrePlato) {
        this.nombrePlato = nombrePlato;
    }

    public long getPrecio() {
        return this.precio;
    }

    public void setPrecio(long precio) {
        this.precio = precio;
    }

    public String getDescripción() {
        return this.descripción;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }

    public String getUrlImagen() {
        return this.urlImagen;
    }

    public void setUrlImagen(String urlImagen) {
        this.urlImagen = urlImagen;
    }

    public String getCategoria() {
        return this.categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public boolean isActivo() {
        return this.activo;
    }

    public boolean getActivo() {
        return this.activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public RestauranteEntity getRestauranteEntity() {
        return this.restauranteEntity;
    }

    public void setRestauranteEntity(RestauranteEntity restauranteEntity) {
        this.restauranteEntity = restauranteEntity;
    }

}
