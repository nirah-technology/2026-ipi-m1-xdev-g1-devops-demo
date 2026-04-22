package fr.nirahtech.devopsdemo.domain;

import java.io.Serializable;

public class User implements Serializable {
    private int id;
    private String username;

    public User() { }

    public User(int id, String username) {
        this.id = id;
        this.username = username;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }
    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }
    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    
}
