package ru.laba.coffeeshop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


import lombok.extern.log4j.Log4j2;
import ru.laba.coffeeshop.dao.repository.UserEntityRepository;
import ru.laba.coffeeshop.entity.RoleEntityEnum;
import ru.laba.coffeeshop.entity.Account;

import java.util.List;


@Log4j2
@Service
public class AccountServiceRe {
    @Autowired
    private UserEntityRepository userEntityRepository;


    @Autowired
    private PasswordEncoder passwordEncoder;


    public Account saveUser(Account user){
        user.setRoleEntityEnum(user.getLogin().equals("admin") 
        ? RoleEntityEnum.ADMIN : RoleEntityEnum.USER);
        user.setPassword(passwordEncoder.encode((user.getPassword())));
        return userEntityRepository.save(user);
    }


    public Account findByLogin(String login){
        return userEntityRepository.findByLogin(login);
    }

    public Account findByLoginAndPassword(String login, String password){
        Account user = findByLogin(login);
        if(user != null){
            if(passwordEncoder.matches(password, user.getPassword()));{
                return user;
            }
        }
        return null;
    }


    public List<Account> findAll(){
        return userEntityRepository.findAll();
    }
}
