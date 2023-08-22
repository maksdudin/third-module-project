package com.third;





import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONObject;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Player {
    private String name;
    private String value;
    private String vin;
    private String lose;
    private static Map<String, Object> playerMaps = new HashMap<>();

    public Player(String name) throws IOException {
        this.name = name;
        this.value = "0";
        this.vin = "0";
        this.lose = "0";
        playerMaps = deserMap();
    }


    public static Player setPlayer(String playerName) throws IOException {
        Player player;
        {
            player = new Player(playerName);

            if (playerMaps.containsKey(player.name)) {
            player.setValue();
            Map<String,Player> playerMap = (Map<String, Player>) playerMaps.get(playerName);
            player.setVin(String.valueOf(playerMap.get("vin")));
            player.setLose(String.valueOf(playerMap.get("lose")));
            } else {
                putOnTheMap(player);
                //сериализуем обновлённую карту
            }
            return player;
        }
    }

        static void serMap(Player p) {
            putOnTheMap(p);
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("1", playerMaps);
            System.out.println(jsonObject.toString());
            //должно писать, если что есть рабочий вариант на PrintWriter
            try (BufferedWriter writer = Files.newBufferedWriter(Paths.get("F:\\JavaRush\\third module project" +
                    "\\third module project\\src\\main\\resources\\customer.json"))) {
                writer.write(jsonObject.toString());
            } catch (IOException e) {

            }
        }

        public static Map<String, Object> deserMap() {
            Map jsonMap = new HashMap();
            File file = new File("F:\\JavaRush\\third module project\\third module project\\src\\main\\resources\\customer.json");
            try (JsonReader jsReader = Json.createReader(new FileReader(file))) {
                JsonObject jsObj = jsReader.readObject();
                String str = jsObj.toString();
                JSONObject jsonOb = new JSONObject(str);
                jsonMap = jsonOb.toMap();
            } catch (IOException e) {
                System.out.println("что-то не так");

            }
            Map<String, Object> playerMap = new HashMap<>();

            playerMap = (Map<String, Object>) jsonMap.get("1");
            return playerMap;
        }

    public static Map<String, Object> getPlayerMaps() {
        return playerMaps;
    }

    public static void putOnTheMap(Player p){
        playerMaps.put(p.getName(), p);
        }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }
    public void setValue() {
        Integer value1 = Integer.parseInt(getValue());
        value1++;
        this.value = value1.toString();

    }


    public String getVin() {
        return vin;
    }
    public void setVin (Integer i) {
        Integer vin1 = Integer.parseInt(getVin());
        vin1+=i;
        this.vin = vin1.toString();
    }
    public void setVin (String vin) {
       this.vin = vin;
    }


    public String getLose() {
        return lose;
    }
    public void setLose (Integer i) {
        Integer lose1 = Integer.parseInt(getLose());
        lose1+=i;
        this.lose = lose1.toString();

    }
    public void setLose (String  lose) {

        this.lose = lose;
    }



}