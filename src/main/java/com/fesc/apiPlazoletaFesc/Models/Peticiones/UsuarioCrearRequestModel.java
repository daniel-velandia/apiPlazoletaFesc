package com.fesc.apiPlazoletaFesc.Models.Peticiones;

public class UsuarioCrearRequestModel {
    
    private String nombre;

    private String apellido;

    private long documentoIdentidad;

    private String celular;

    private String correo;
    
    private String clave;

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public long getDocumentoIdentidad() {
        return this.documentoIdentidad;
    }

    public void setDocumentoIdentidad(long documentoIdentidad) {
        this.documentoIdentidad = documentoIdentidad;
    }

    public String getCelular() {
        return this.celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCorreo() {
        return this.correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getClave() {
        return this.clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
}
