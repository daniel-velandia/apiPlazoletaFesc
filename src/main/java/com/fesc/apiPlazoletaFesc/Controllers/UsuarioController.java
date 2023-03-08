package com.fesc.apiPlazoletaFesc.Controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fesc.apiPlazoletaFesc.Models.Peticiones.UsuarioCrearRequestModel;
import com.fesc.apiPlazoletaFesc.Models.Respuestas.UsuarioDataRestModel;
import com.fesc.apiPlazoletaFesc.Services.IUsuarioService;
import com.fesc.apiPlazoletaFesc.Shared.UsuarioDto;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    
    @Autowired
    ModelMapper modelMapper;

    @Autowired
    IUsuarioService iUsuarioService;

    @GetMapping
    public String leerUsuario() {
        return "leer usuario";
    }

    @PostMapping
    public UsuarioDataRestModel CrearUsuario(@RequestBody UsuarioCrearRequestModel usuarioCrearRequestModel) {
        
        UsuarioDto usuarioCrearDto = modelMapper.map(usuarioCrearRequestModel, UsuarioDto.class);

        UsuarioDto usuarioDto = iUsuarioService.crearUsuario(usuarioCrearDto);

        UsuarioDataRestModel usuarioDataRestModel = modelMapper.map(usuarioDto, UsuarioDataRestModel.class);
        
        return usuarioDataRestModel;
    }
}
