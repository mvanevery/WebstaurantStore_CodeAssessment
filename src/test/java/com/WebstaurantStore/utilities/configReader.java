package com.WebstaurantStore.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class configReader {
    private static Properties properties = new Properties();

    static {
        try {
            FileInputStream file = new FileInputStream("config.properties");
            properties.load(file);
            //this is to close the file in memory
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Unable to find file at given path");
        }
    }

    public static String getProperty(String keyword) {
        return  properties.getProperty(keyword);
    }

}
