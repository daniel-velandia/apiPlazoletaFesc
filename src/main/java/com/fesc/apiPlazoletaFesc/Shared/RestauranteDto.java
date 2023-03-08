package com.fesc.apiPlazoletaFesc.Shared;

import java.io.Serializable;

public class RestauranteDto implements Serializable{
    
    private static final long serialVersionUID = 1L;

    private long id;

    private String nombre;

    private long nit;

    private String direccion;

    private long telefono;
    
    private String urlLogo;

    private long idPropietario;

    private UsuarioDto usuarioEntity;

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

    public long getIdPropietario() {
        return this.idPropietario;
    }

    public void setIdPropietario(long idPropietario) {
        this.idPropietario = idPropietario;
    }

    public UsuarioDto getUsuarioEntity() {
        return this.usuarioEntity;
    }

    public void setUsuarioEntity(UsuarioDto usuarioEntity) {
        this.usuarioEntity = usuarioEntity;
    }

}
