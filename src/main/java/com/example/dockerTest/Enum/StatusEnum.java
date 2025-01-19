package com.example.dockerTest.Enum;

public enum StatusEnum {
    Inactive(0,"Inactive"),
    Active(1, "Active");

    int status;
    String value;

    StatusEnum(int status, String value) {
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
