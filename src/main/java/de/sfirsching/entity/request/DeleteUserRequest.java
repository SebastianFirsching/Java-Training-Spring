package de.sfirsching.entity.request;

/**
 * Created by sfirsching on 24.02.2017.
 */
public class DeleteUserRequest {
    private String name;
    private String surname;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
