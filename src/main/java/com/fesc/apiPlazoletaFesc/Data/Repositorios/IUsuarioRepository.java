package com.fesc.apiPlazoletaFesc.Data.Repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.fesc.apiPlazoletaFesc.Data.Entidades.UsuarioEntity;

@Repository
public interface IUsuarioRepository extends CrudRepository<UsuarioEntity, Long>{
    
}
