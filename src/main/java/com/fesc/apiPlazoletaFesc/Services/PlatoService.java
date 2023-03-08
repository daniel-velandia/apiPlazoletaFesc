package com.fesc.apiPlazoletaFesc.Services;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fesc.apiPlazoletaFesc.Data.Entidades.PlatoEntity;
import com.fesc.apiPlazoletaFesc.Data.Entidades.RestauranteEntity;
import com.fesc.apiPlazoletaFesc.Data.Repositorios.IPlatoRepository;
import com.fesc.apiPlazoletaFesc.Data.Repositorios.IRestauranteRepository;
import com.fesc.apiPlazoletaFesc.Shared.PlatoDto;

@Service
public class PlatoService implements IPlatoService {

    @Autowired
    ModelMapper modelMapper;

    @Autowired
    IPlatoRepository IPlatoRepository;

    @Autowired
    IRestauranteRepository iRestauranteRepository;

    @Override
    public PlatoDto crearPlato(PlatoDto platoCrearDto) {
        
        RestauranteEntity restauranteEntity = iRestauranteRepository.findById(platoCrearDto.getIdRestaurante());

        if(restauranteEntity == null) {
            throw new RuntimeException("El restaurante no existe...");
        }

        PlatoEntity platoCrearEntity = modelMapper.map(platoCrearDto, PlatoEntity.class);
        platoCrearEntity.setRestauranteEntity(restauranteEntity);
        platoCrearEntity.setActivo(true);

        PlatoEntity platoEntity = IPlatoRepository.save(platoCrearEntity);

        PlatoDto platoDto = modelMapper.map(platoEntity, PlatoDto.class);

        return platoDto;
    }
    
}
