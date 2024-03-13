package com.WebstaurantStore.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class configReader {
    public static Properties properties;

    public static void readPropertyFile() {
        properties = new Properties();
        try {
            FileInputStream file = new FileInputStream("config.properties");
            properties.load(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Unable to find file at given path");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getProperty(String keyword) {
        return properties.getProperty(keyword);
    }

}
