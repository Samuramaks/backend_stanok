package ru.laba.coffeeshop.dto;

import lombok.Data;
import ru.laba.coffeeshop.entity.Account;


@Data
public class AccountDTO {
    private long id;
    private String login;
    private String password;


    public static AccountDTO from(Account user){
        AccountDTO userDTO = new AccountDTO();
        userDTO.setId(user.getId());
        userDTO.setLogin(user.getLogin());
        userDTO.setPassword(user.getPassword());

        return userDTO;
    }
}
