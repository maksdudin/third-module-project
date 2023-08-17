package com.third;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

public class Player {
private String name;
private String value;
private final Integer count =1;

    public Player(String name) {
        this.name = name;
        Properties property = new Properties();
try(FileInputStream fis = new FileInputStream("F:\\JavaRush\\third module project\\third module project" +
        "\\src\\main\\resources\\player.properties")){
    property.load(fis);
this.value = work(property);

}catch (IOException e)
{
    System.out.println("неверный формат записей");
}
try(FileOutputStream fout = new FileOutputStream("F:\\JavaRush\\third module project\\third module project\\src\\main" +
        "\\resources\\player.properties")){
    property.setProperty(name,value);
    property.store(fout,null);
} catch (FileNotFoundException e) {
    throw new RuntimeException(e);
} catch (IOException e) {
    throw new RuntimeException(e);
}

    }
    public String work(Properties prop){
        String value;
        if (prop.isEmpty()){
           value=count.toString();
           return value;
        }else if(prop.containsKey(name)){
            try{
                Integer val =Integer.parseInt(prop.getProperty(name))+count;
                value=val.toString();
                return value;
            }catch (NumberFormatException e){
                System.out.println("Не верный формат записи значения");
            }
        }
     return count.toString();
    }

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }
}
