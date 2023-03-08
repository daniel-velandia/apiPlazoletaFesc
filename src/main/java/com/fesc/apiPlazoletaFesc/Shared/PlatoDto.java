package com.fesc.apiPlazoletaFesc.Shared;

import java.io.Serializable;

public class PlatoDto implements Serializable{
    
    private static final long serialVersionUID = 1L;

    private long id;

    private String nombrePlato;
    
    private long precio;

    private String descripción;

    private String urlImagen;

    private String categoria;

    private boolean activo;

    private long idRestaurante;

    private RestauranteDto restauranteEntity;

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

    public long getIdRestaurante() {
        return this.idRestaurante;
    }

    public void setIdRestaurante(long idRestaurante) {
        this.idRestaurante = idRestaurante;
    }

    public RestauranteDto getRestauranteEntity() {
        return this.restauranteEntity;
    }

    public void setRestauranteEntity(RestauranteDto restauranteEntity) {
        this.restauranteEntity = restauranteEntity;
    }

}
