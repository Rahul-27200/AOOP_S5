package com.decoupling;

public class DatabaseSource implements DataSource {
    @Override
    public String fetchData() {
        return "Data fetched from the database.";
    }
}