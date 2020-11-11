package org.vktestiguess.models;

public class AccountData {
    public AccountData(String name, String password) {
    this.name = name;
    this.password = password;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        AccountData.name = name;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        AccountData.password = password;
    }

    private static String name;
    private static String password;
}
