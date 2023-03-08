package com.fesc.apiPlazoletaFesc.Data.Repositorios;

import org.springframework.data.repository.CrudRepository;

import com.fesc.apiPlazoletaFesc.Data.Entidades.RestauranteEntity;

public interface IRestauranteRepository extends CrudRepository<RestauranteEntity, Long>{
    
    RestauranteEntity findById(long id);
}
