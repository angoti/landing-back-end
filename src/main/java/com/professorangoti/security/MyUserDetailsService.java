package com.professorangoti.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.professorangoti.domain.User;
import com.professorangoti.repository.UserRepository;

public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository usuarioRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User usuario = usuarioRepository.findByNome(username);
        if (usuario == null) {
            throw new UsernameNotFoundException("User not found");
        }
        return new MyUserDetails(usuario);

    }

}
