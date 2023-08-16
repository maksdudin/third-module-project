package com.third;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class Questions {
    private Map<String,String> map;
    private Queue<String> queue;
    private Integer countOfReqwest =0;

    public int getCountOfReqwest() {
        return countOfReqwest;
    }

    public Map<String, String> getMap() {
      return map;
    }

    public Queue<String> getQueue() {
        return queue;
    }

    public Questions() {
        this.map = new TreeMap<>();
        Properties property = new Properties();
        try (FileInputStream fis = new FileInputStream("F:\\JavaRush\\third module project\\third module project" +
                "\\src\\main\\resources\\questions.properties")){
            property.load(fis);
            Set<String> keySet =property.stringPropertyNames();
            for (String str:keySet) {
                map.put(str, property.getProperty(str));
            }
            this.queue = getFirtsQueue();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public Queue<String> getFirtsQueue(){
        Queue<String> queue = new ArrayDeque<>();
        for(Map.Entry<String,String> entry: map.entrySet()){
            queue.add(entry.getValue());
        }
        return queue;
    }


}

