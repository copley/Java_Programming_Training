package com.example;

import java.io.InputStream;
import java.util.Properties;

public class App {
    public static void main(String[] args) {
        try (InputStream input = App.class.getClassLoader().getResourceAsStream("config.properties")) {
            Properties prop = new Properties();
            prop.load(input);
            System.out.println("Hello, " + prop.getProperty("user.name") + "!");
        } catch (Exception e) {
            System.out.println("Could not read config: " + e.getMessage());
        }
    }
}
