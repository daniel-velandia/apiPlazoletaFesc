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
    public UsuarioDto crearUsuario(UsuarioDto usuarioDto) {
        
        if (usuarioDto.getCorreo().contains("@") && usuarioDto.getCelular().length() <= 13) {

            UsuarioEntity usuarioEntity = modelMapper.map(usuarioDto, UsuarioEntity.class);
            usuarioEntity.setClaveEncriptada(bCryptPasswordEncoder.encode(usuarioDto.getClave()));

            UsuarioEntity usuarioRespEntity = iUsuarioRepository.save(usuarioEntity);

            UsuarioDto usuarioRespDto = modelMapper.map(usuarioRespEntity, UsuarioDto.class);

            return usuarioRespDto;

        } else {

            return new UsuarioDto();
        }
        
    }
}
