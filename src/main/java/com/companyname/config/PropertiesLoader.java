package com.companyname.config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesLoader {

    // Static Properties object to hold the loaded properties
    private static final Properties properties = new Properties();

    // Static block to load properties from the "application.properties" file when the class is loaded
    static {
        try (InputStream input = PropertiesLoader.class
                .getClassLoader()
                .getResourceAsStream("application.properties")) {

            // Throw an exception if the properties file is not found
            if (input == null) throw new RuntimeException("Application properties not found under resources package.");

            // Load the properties from the input stream
            properties.load(input);
        } catch (IOException e) {
            // Throw a runtime exception if an error occurs during the loading process
            throw new RuntimeException("Failed to load the application properties.");
        }
    }

    // Method to retrieve a property value by its key
    // If the key doesn't exist, it returns null
    public static String get(String key) {
        return properties.getProperty(key);
    }

    // Method to retrieve a property value by its key with a default value
    // If the key doesn't exist, the provided default value is returned
    public static String get(String key, String defaultValue) {
        return properties.getProperty(key, defaultValue);
    }

}
