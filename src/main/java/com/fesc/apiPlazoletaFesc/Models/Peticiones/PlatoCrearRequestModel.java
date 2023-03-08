package com.fesc.apiPlazoletaFesc.Models.Peticiones;

public class PlatoCrearRequestModel {
    
    private String nombrePlato;
    
    private long precio;

    private String descripción;

    private String urlImagen;

    private String categoria;

    private long idRestaurante;

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

    public long getIdRestaurante() {
        return this.idRestaurante;
    }

    public void setIdRestaurante(long idRestaurante) {
        this.idRestaurante = idRestaurante;
    }
    
}
