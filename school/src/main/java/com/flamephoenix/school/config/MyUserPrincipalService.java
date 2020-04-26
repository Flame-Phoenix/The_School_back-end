package com.flamephoenix.school.config;

import com.flamephoenix.school.model.UserEntity;
import com.flamephoenix.school.repository.UserEntityRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class MyUserPrincipalService implements UserDetailsService {

    private UserEntityRepository userEntityRepository;

    public MyUserPrincipalService(UserEntityRepository userEntityRepository) {
        this.userEntityRepository = userEntityRepository;
    }

    @Override
    @Transactional
    public UserDetails loadUserByUsername(String username)
            throws UsernameNotFoundException {

        UserEntity userEntity = userEntityRepository.findByUsername(username);
        if (userEntity == null) {
            throw new UsernameNotFoundException("User not found with username " +username);
        }
        return MyUserPrincipal.create(userEntity);
    }

    @Transactional
    public UserDetails loadUserById(Long id) {
        UserEntity user = userEntityRepository.findById(id).orElseThrow(
                () -> new UsernameNotFoundException("User not found with id : " + id)
        );

        return MyUserPrincipal.create(user);
    }

}
