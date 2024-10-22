package ru.laba.coffeeshop.config.MyuserDetailsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import ru.laba.coffeeshop.entity.Account;
import ru.laba.coffeeshop.service.AccountServiceRe;


@Component
public class CustomUserDetailsService implements UserDetailsService{

    @Autowired
    private AccountServiceRe userService;

    @Override
    public CustomUserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Account user = userService.findByLogin(username);

       return CustomUserDetails.fromUserEntityToCustomUserDetails(user);
    }

   
    
}
