package com.fesc.apiPlazoletaFesc.Controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fesc.apiPlazoletaFesc.Models.Peticiones.RestauranteCrearRequestModel;
import com.fesc.apiPlazoletaFesc.Models.Respuestas.RestauranteDataRestModel;
import com.fesc.apiPlazoletaFesc.Services.IRestauranteService;
import com.fesc.apiPlazoletaFesc.Shared.RestauranteDto;

@RestController
@RequestMapping("/restaurante")
public class RestauranteController {
    
    @Autowired
    ModelMapper modelMapper;

    @Autowired
    IRestauranteService iRestauranteService;

    @GetMapping
    public RestauranteDataRestModel leerRestaurante() {
        return new RestauranteDataRestModel();
    }

    @PostMapping
    public RestauranteDataRestModel leerRestaurante(@RequestBody RestauranteCrearRequestModel restauranteCrearRequestModel) {

        RestauranteDto restauranteCrearDto = modelMapper.map(restauranteCrearRequestModel, RestauranteDto.class);

        RestauranteDto restauranteDto = iRestauranteService.crearRestaurante(restauranteCrearDto);

        RestauranteDataRestModel restauranteDataRestModel = modelMapper.map(restauranteDto, RestauranteDataRestModel.class);

        return restauranteDataRestModel;
    }
}
