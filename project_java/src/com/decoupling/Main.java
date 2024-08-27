package com.decoupling;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.println("Select data source:");
        System.out.println("1 - Database");
        System.out.println("2 - File");
        System.out.println("3 - Web Service");

        int choice = scanner.nextInt();
        DataSource selectedSource;

        // Choose data source based on user input
        switch (choice) {
            case 1:
                selectedSource = new DatabaseSource();
                break;
            case 2:
                selectedSource = new FileSource();
                break;
            case 3:
                selectedSource = new WebServiceSource();
                break;
            default:
                System.out.println("Invalid choice, defaulting to Database source.");
                selectedSource = new DatabaseSource();
                break;
        }

        // Generate report using the selected data source
        ReportGenerator reportGenerator = new ReportGenerator(selectedSource);
        reportGenerator.generateReport();

        scanner.close();
    }
}