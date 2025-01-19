package com.example.dockerTest.Entity;

import com.example.dockerTest.Enum.StatusEnum;
import com.example.dockerTest.Enum.UserRoleEnum;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "tbl_usr")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String name,username,password;

    @Enumerated(EnumType.ORDINAL)
    @Column(name = "role")
    UserRoleEnum userRoleEnum;

    @Enumerated(EnumType.ORDINAL)
    @Column(name = "status")
    StatusEnum statusEnum;

    @Temporal(TemporalType.TIMESTAMP)
    Date created,modified;
    int createdBy;
    Integer modifiedBy;

    public UserEntity() {
    }

    public UserEntity(String name, String username, String password, UserRoleEnum userRoleEnum, StatusEnum statusEnum, int createdBy) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.userRoleEnum = userRoleEnum;
        this.statusEnum = statusEnum;
        this.created = new Date();
        this.createdBy = createdBy;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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

    public UserRoleEnum getUserRoleEnum() {
        return userRoleEnum;
    }

    public void setUserRoleEnum(UserRoleEnum userRoleEnum) {
        this.userRoleEnum = userRoleEnum;
    }

    public StatusEnum getStatusEnum() {
        return statusEnum;
    }

    public void setStatusEnum(StatusEnum statusEnum) {
        this.statusEnum = statusEnum;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public int getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    public Integer getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(Integer modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", userRoleEnum=" + userRoleEnum +
                ", statusEnum=" + statusEnum +
                ", created=" + created +
                ", modified=" + modified +
                ", createdBy=" + createdBy +
                ", modifiedBy=" + modifiedBy +
                '}';
    }
}
