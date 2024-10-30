package com.enigma.java_error_exeption_handling.custom;

public class DatabaseConnection {
    private String dbName = null;
    private String username = null;
    private String password = null;

    public DatabaseConnection(String dbName, String username, String password) {
        this.dbName = dbName;
        this.username = username;
        this.password = password;
    }

    public void connect() {
        if (dbName == null || username == null || password == null) {
            throw new DatabaseConnectionError("Credentials is null");
        }
    }
}
