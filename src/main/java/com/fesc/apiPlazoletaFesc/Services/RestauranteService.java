package com.fesc.apiPlazoletaFesc.Services;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fesc.apiPlazoletaFesc.Data.Entidades.RestauranteEntity;
import com.fesc.apiPlazoletaFesc.Data.Entidades.UsuarioEntity;
import com.fesc.apiPlazoletaFesc.Data.Repositorios.IRestauranteRepository;
import com.fesc.apiPlazoletaFesc.Data.Repositorios.IUsuarioRepository;
import com.fesc.apiPlazoletaFesc.Shared.RestauranteDto;

@Service
public class RestauranteService implements IRestauranteService{

    @Autowired
    ModelMapper modelMapper;

    @Autowired
    IRestauranteRepository iRestauranteRepository;

    @Autowired
    IUsuarioRepository iUsuarioRepository;

    @Override
    public RestauranteDto crearRestaurante(RestauranteDto restauranteCrearDto) {

        UsuarioEntity usuarioEntity = iUsuarioRepository.findById(restauranteCrearDto.getIdPropietario());

        if(usuarioEntity == null) {
            throw new RuntimeException("El propietario no existe...");
        }

        if(usuarioEntity.getCelular().length() > 13) {
            throw new RuntimeException("El numero de celular excede la cantidad de digitos permitida...");
        }

        if(usuarioEntity.getNombre().matches("[0-9]{4}")) {
            throw new RuntimeException("El nombre del restaurante no puede componenser solamente de numeros...");
        }

        RestauranteEntity restauranteCrearEntity = modelMapper.map(restauranteCrearDto, RestauranteEntity.class);
        restauranteCrearEntity.setUsuarioEntity(usuarioEntity);

        RestauranteEntity restauranteEntity = iRestauranteRepository.save(restauranteCrearEntity);

        RestauranteDto restauranteDto = modelMapper.map(restauranteEntity, RestauranteDto.class);
        
        return restauranteDto;
    }
    
}
