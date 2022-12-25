package org.tms.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class User {

    private String login = "m05vea@mail2run.com";
    private String password = "Lenovo2910";

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

}
