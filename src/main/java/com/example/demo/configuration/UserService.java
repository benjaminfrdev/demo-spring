package com.example.demo.configuration;

import com.example.demo.dto.UserDTO;
import com.example.demo.entity.UserEntity;
import com.example.demo.repository.IUserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class UserService implements UserDetailsService {
    private IUserRepository userRepository;
    public UserService(IUserRepository userRepository){
        this.userRepository = userRepository;
    }
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity user = userRepository.findByUsername(username);
        if(user == null) {
            throw new UsernameNotFoundException(username);
        }
        return new CustomUserDetails(user);

    }
    public UserDetails loadUserById(Long id) {
        Optional<UserEntity> user = userRepository.findById(id);
        if(user != null) {
            return new CustomUserDetails(user.get());
        }
        return null;
    }
}
