package org.fall23.ui.config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    private static Properties properties;

    private ConfigReader(){
        //Singleton pattern --> чтобы не создавать экземпляры(об'екты) данного класса
    }
    static {
        try{
            String path ="src/main/resources/application.properties";
            FileInputStream inputStream = new FileInputStream(path); // take dostup
            properties = new Properties();
            properties.load(inputStream);
            inputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static String getValue(String key){
        return properties.getProperty(key).trim();
    }

    public static void main(String[] args) {
        System.out.println(getValue("name"));
    }
}
