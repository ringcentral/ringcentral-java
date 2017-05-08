package com.ringcentral;

import org.junit.jupiter.api.AfterEach;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;

class BaseTest {
    HashMap<String, String> config = new HashMap<String, String>();
    RestClient restClient;

    BaseTest() {
        // read config file
        String content = "";
        try {
            content = new String(Files.readAllBytes(Paths.get("./src/test/resources/.env")));
        } catch (IOException e) {
            e.printStackTrace();
        }

        // parse config file
        for (String line : content.split("\n")) {
            String[] tokens = line.split("=");
            if (tokens.length > 1) {
                config.put(tokens[0], tokens[1]);
            } else {
                config.put(tokens[0], "");
            }
        }

        restClient = new RestClient(config.get("appKey"), config.get("appSecret"), config.get("server"));
        try {
            restClient.authorize(config.get("username"), config.get("extension"), config.get("password"));
        } catch (IOException | RestException e) {
            e.printStackTrace();
        }
    }

    @AfterEach
    void tearDown() {
        try {
            Thread.sleep(16000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
