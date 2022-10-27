package com.assignment2.hospital;

/**
 *
 * @author madan
 */
public class System {
    
    private String username;
    private String password;

    public String getUsername() {
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

    public System() {
        this.username = "admin";
        this.password = "admin1234";
    }
    

    
}
