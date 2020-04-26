package com.flamephoenix.school.service;

import com.flamephoenix.school.repository.UserEntityRepository;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class UserService{

    private  UserEntityRepository user_repo;

    public UserService(UserEntityRepository user_repo) {
        this.user_repo = user_repo;
    }


    public List findAll(){

        List user = user_repo.findAll();
        return user;
    }
}
