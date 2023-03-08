package com.fesc.apiPlazoletaFesc.Models.Respuestas;

public class RestauranteDataRestModel {
    
    private String nombre;

    private long nit;

    private UsuarioDataRestModel usuarioEntity;

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

    public UsuarioDataRestModel getUsuarioEntity() {
        return this.usuarioEntity;
    }

    public void setUsuarioEntity(UsuarioDataRestModel usuarioEntity) {
        this.usuarioEntity = usuarioEntity;
    }
    
}
