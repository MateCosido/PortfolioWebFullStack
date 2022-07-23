
package com.seba.ArgProg.security.service;

import com.seba.ArgProg.security.entity.Usuario;
import com.seba.ArgProg.security.repo.UsuarioRepo;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UsuarioService{
    
    @Autowired
    UsuarioRepo usuarioRepo;
    
    public Optional<Usuario> getByNombreUsuario(String nombreUsuario){
        return usuarioRepo.findByNombreUsuario(nombreUsuario);
    }
    
    public boolean existsByNombreUsuario(String nombreUsuario){
        return usuarioRepo.existsByNombreUsuario(nombreUsuario);
    }
    
    public boolean existsByEmail(String email){
        return usuarioRepo.existsByEmail(email);
    }
    
    public void save(Usuario usuario){
        usuarioRepo.save(usuario);
    }
}