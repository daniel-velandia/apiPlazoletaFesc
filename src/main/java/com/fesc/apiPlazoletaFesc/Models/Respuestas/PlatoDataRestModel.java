package com.fesc.apiPlazoletaFesc.Models.Respuestas;

public class PlatoDataRestModel {
    
    private String nombrePlato;
    
    private long precio;

    private RestauranteDataRestModel restauranteEntity;

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

    public RestauranteDataRestModel getRestauranteEntity() {
        return this.restauranteEntity;
    }

    public void setRestauranteEntity(RestauranteDataRestModel restauranteEntity) {
        this.restauranteEntity = restauranteEntity;
    }

}
