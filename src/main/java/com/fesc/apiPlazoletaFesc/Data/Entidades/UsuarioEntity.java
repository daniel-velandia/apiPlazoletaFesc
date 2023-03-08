package com.fesc.apiPlazoletaFesc.Data.Entidades;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Index;
import jakarta.persistence.Table;

@Entity(name = "usuario")
@Table(indexes = {
    @Index(columnList = "documentoIdentidad", name = "index_documentoIdentidad", unique = true)
})
public class UsuarioEntity implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String apellido;
    
    @Column(nullable = false)
    private long documentoIdentidad;
    
    @Column(nullable = false, length = 13)
    private String celular;
    
    @Column(nullable = false)
    private String correo;
    
    @Column(nullable = false)
    private String claveEncriptada;

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

    public String getClaveEncriptada() {
        return this.claveEncriptada;
    }

    public void setClaveEncriptada(String claveEncriptada) {
        this.claveEncriptada = claveEncriptada;
    }
}
