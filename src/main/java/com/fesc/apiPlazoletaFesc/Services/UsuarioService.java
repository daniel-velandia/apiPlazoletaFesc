package com.fesc.apiPlazoletaFesc.Services;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.fesc.apiPlazoletaFesc.Data.Entidades.UsuarioEntity;
import com.fesc.apiPlazoletaFesc.Data.Repositorios.IUsuarioRepository;
import com.fesc.apiPlazoletaFesc.Shared.UsuarioDto;

@Service
public class UsuarioService implements IUsuarioService{

    @Autowired
    ModelMapper modelMapper;

    @Autowired
    IUsuarioRepository iUsuarioRepository;

    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public UsuarioDto crearUsuario(UsuarioDto usuarioCrearDto) {
        
        if (!usuarioCrearDto.getCorreo().contains("@")) {
            throw new RuntimeException("El correo no cumple con el formato correcto...");
        }

        if (usuarioCrearDto.getCelular().length() > 13) {
            throw new RuntimeException("El numero de celular excede la cantidad de digitos permitida...");
        }

        UsuarioEntity usuarioEntity = modelMapper.map(usuarioCrearDto, UsuarioEntity.class);
        usuarioEntity.setClaveEncriptada(bCryptPasswordEncoder.encode(usuarioCrearDto.getClave()));

        UsuarioEntity usuarioRespEntity = iUsuarioRepository.save(usuarioEntity);

        UsuarioDto usuarioDto = modelMapper.map(usuarioRespEntity, UsuarioDto.class);

        return usuarioDto;
        
    }
}
