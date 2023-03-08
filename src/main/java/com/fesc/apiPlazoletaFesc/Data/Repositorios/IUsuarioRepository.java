package com.fesc.apiPlazoletaFesc.Data.Repositorios;

import org.springframework.data.repository.CrudRepository;

import com.fesc.apiPlazoletaFesc.Data.Entidades.UsuarioEntity;

public interface IUsuarioRepository extends CrudRepository<UsuarioEntity, Long>{
    
    UsuarioEntity findById(long id);
}
