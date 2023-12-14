package com.demo.sauce.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    private Properties sauceProperties;

    public Properties loadPropertiesFile() {
        sauceProperties = new Properties();
        File file = new File("./src/test/resources/config/config.properties");
        try {
            FileInputStream fis = new FileInputStream(file);
            sauceProperties.load(fis);
        } catch (FileNotFoundException e) {
           e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
        return sauceProperties;
    }
}