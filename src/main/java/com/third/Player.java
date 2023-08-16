package com.third;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Player {
private String name;
private String value;
private final Integer count =1;
private Properties prop;
    public Player(String name) {
        this.name = name;
        prop = new Properties();
try(FileInputStream fis = new FileInputStream("F:\\JavaRush\\third module project\\third module project\\src\\main\\resources\\player.properties");
    FileOutputStream fout = new FileOutputStream("F:\\JavaRush\\third module project\\third module project\\src\\main\\resources\\player.properties")){
prop.load(fis);
this.value = work(prop);
prop.setProperty(name,value);
prop.store(fout,null);
}catch (IOException e)
{
    System.out.println("неверный формат записей");
}

        }
    public String work(Properties prop){
        String value;
        if (prop.isEmpty()){
           value=count.toString();
           return value;
        }else{
            try{
                Integer val =Integer.parseInt(prop.getProperty(name))+count;
                value=val.toString();
                return value;
            }catch (NumberFormatException e){
                System.out.println("Не верный формат записи значения");
            }
        }
     return "1";
    }

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }
}
