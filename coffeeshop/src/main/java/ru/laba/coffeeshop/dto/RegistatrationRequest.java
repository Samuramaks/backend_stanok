package ru.laba.coffeeshop.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import ru.laba.coffeeshop.entity.Account;

@Data
public class RegistatrationRequest {
    @NotEmpty
    private String login;

    @NotEmpty
    private String password;



    public String getLogin() { return login; }
    public void setLogin(String login) { this.login = login; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public Account toAccount(){
        Account account = new Account();
        account.setLogin(login);
        account.setPassword(password);

        return account;
    }

}
