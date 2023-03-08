package com.fesc.apiPlazoletaFesc.Controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fesc.apiPlazoletaFesc.Models.Peticiones.PlatoCrearRequestModel;
import com.fesc.apiPlazoletaFesc.Models.Respuestas.PlatoDataRestModel;
import com.fesc.apiPlazoletaFesc.Services.IPlatoService;
import com.fesc.apiPlazoletaFesc.Shared.PlatoDto;

@RestController
@RequestMapping("/plato")
public class PlatoController {
    
    @Autowired
    ModelMapper modelMapper;

    @Autowired
    IPlatoService iPlatoService;

    @GetMapping
    public PlatoDataRestModel leerPlato() {
        return new PlatoDataRestModel();
    }

    @PostMapping
    public PlatoDataRestModel leerPlato(@RequestBody PlatoCrearRequestModel platoCrearRequestModel) {
        
        PlatoDto platoCrearDto = modelMapper.map(platoCrearRequestModel, PlatoDto.class);

        PlatoDto platoDto = iPlatoService.crearPlato(platoCrearDto);

        PlatoDataRestModel platoDataRestModel = modelMapper.map(platoDto, PlatoDataRestModel.class);

        return platoDataRestModel;
    }
}
