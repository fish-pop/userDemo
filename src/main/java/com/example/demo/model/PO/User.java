package com.example.demo.model.PO;

import com.example.demo.model.PO.base.BaseEntity;
import lombok.Data;

@Data
public class User extends BaseEntity {

    private String username;
    private String password;

    public User(){}

    public User( String username, String password) {
        this.username = username;
        this.password = password;
    }

    public static void main(String[] args) {
        User user = new User();
        user.getUsername();
    }

}
   /* @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }*/

   /* public User(String username, String password) {
        this.username = username;
        this.password = password;
    }*/

   /* public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}*/

