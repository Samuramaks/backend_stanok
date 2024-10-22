package ru.laba.coffeeshop.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "users_table")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    
    @Column(name = "login", unique = true)
    private String login;

    @Column(name = "password")
    private String password;


    @Enumerated(EnumType.STRING)
    @Column(name = "roleEntityEnum")
    private RoleEntityEnum roleEntityEnum;


    public void setId(long id){
        this.id = id;
    }

    public Long getId(){
        return this.id;
    }


    public void setLogin(String login){
        this.login = login;
    }

    public String getLogin(){
        return this.login;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String getPassword(){
        return this.password;
    }

    public void setRoleEntityEnum(RoleEntityEnum roleEntityEnum){
        this.roleEntityEnum = roleEntityEnum;
    }

    public RoleEntityEnum getRoleEntityEnum(){
        return this.roleEntityEnum;
    }


}
