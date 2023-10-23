package org.leanpoker.player;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Player {

    static final String VERSION = "Default Java folding player";

    static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    public static int betRequest(JsonNode request) {
        try {
            GameState gameState = OBJECT_MAPPER.treeToValue(request, GameState.class);
            

            PlayerStrategy playerStrategy = new PlayerStrategy();
            return playerStrategy.doSomething(gameState);
        } catch (Exception e) {
            return 100;
        }
    }

    public static void showdown(JsonNode game) {
    }
}
