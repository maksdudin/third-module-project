package com.third;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class PlayerTest extends TestCase {
    Map<String, Object> playerMaps = new HashMap<>();
    String name;
    String value;
    String vin;
    String lose;

@Test
    public void testSetValue() throws IOException {
    Player player = new Player("ban");
    player.setValue();
    String value= player.getValue();
    assertEquals("1",value);

    }
    @Test
    public void testSetPlayer() throws IOException {
    Player player= Player.setPlayer("bag");
        assertEquals("bag" ,player.getName() );
    }

    @Test
    public void testPutOnTheMap() throws IOException {

        Player player = new Player("dad");
        this.playerMaps=Player.getPlayerMaps();
        Player.putOnTheMap(player);
        assertTrue(playerMaps.containsKey("dad"));

    }
    @Test
    public void testSetVin() throws IOException {
        Player player = new Player("nad");
        player.setVin(1);
        String vin = player.getVin();
        assertEquals("1",vin);
    }
    @Test
    public void testSetLose() throws IOException {
        Player player = new Player("nad");
        player.setLose(1);
        String lose = player.getLose();
        assertEquals("1",lose);

    }
    @Test
    public void testDeserMap() throws IOException {
        Player player = new Player("dad");
        this.playerMaps=Player.getPlayerMaps();
        Player.putOnTheMap(player);
        assertTrue(playerMaps.containsKey("dad"));
        player = (Player) playerMaps.get("dad");
        assertEquals("dad", player.getName());
        assertEquals("0", player.getValue());
        assertEquals("0", player.getLose());
        assertEquals("0", player.getVin());
    }
}