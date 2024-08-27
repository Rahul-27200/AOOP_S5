package com.decoupling;

public class WebServiceSource implements DataSource {
    @Override
    public String fetchData() {
        return "Data fetched from a web service.";
    }
}