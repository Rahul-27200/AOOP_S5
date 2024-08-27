package com.decoupling;

public class FileSource implements DataSource {
    @Override
    public String fetchData() {
        return "Data fetched from a file.";
    }
}