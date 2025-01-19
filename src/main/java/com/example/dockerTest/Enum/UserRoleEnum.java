package com.example.dockerTest.Enum;

public enum UserRoleEnum {
    User(0,"User"),
    Admin(1, "Admin");

    int status;
    String value;

    UserRoleEnum(int status, String value) {
        this.status = status;
        this.value = value;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
