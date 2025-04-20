package github.rafael.models;

import java.util.UUID;

public class UserModel {
    private UUID id;
    private String nmUser;
    private String dsEmail;

    public UserModel(String nmUser, String dsEmail) {
        this.id = UUID.randomUUID();
        this.dsEmail = dsEmail;
        this.nmUser = nmUser;
    }

    public UserModel(UUID id, String nmUser, String dsEmail) {
        this.id = id;
        this.nmUser = nmUser;
        this.dsEmail = dsEmail;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNmUser() {
        return nmUser;
    }

    public void setNmUser(String nmUser) {
        this.nmUser = nmUser;
    }

    public String getDsEmail() {
        return dsEmail;
    }

    public void setDsEmail(String dsEmail) {
        this.dsEmail = dsEmail;
    }

    @Override
    public String toString() {
        return "UserModel{" +
                "id=" + id +
                ", nmUser='" + nmUser + '\'' +
                ", dsEmail='" + dsEmail + '\'' +
                '}';
    }
}
