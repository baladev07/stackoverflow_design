package com.stackoverflow.account_enums;

public enum AccountStatus{
    Active(0, "active"),
    INACTIVE(1, "inactive");

    private final int code;

    private final String name;


    AccountStatus(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
}
