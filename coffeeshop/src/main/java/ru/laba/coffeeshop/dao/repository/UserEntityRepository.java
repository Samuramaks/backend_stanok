package ru.laba.coffeeshop.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ru.laba.coffeeshop.entity.Account;


@Repository
public interface UserEntityRepository extends JpaRepository<Account, Long>{
    Account findByLogin(String login);
    
} 