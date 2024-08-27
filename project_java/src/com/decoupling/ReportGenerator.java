package com.decoupling;

public class ReportGenerator {
    private final DataSource dataSource;

    public ReportGenerator(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void generateReport() {
        String data = dataSource.fetchData();
        System.out.println("Generating report with the following data: " + data);
    }
}