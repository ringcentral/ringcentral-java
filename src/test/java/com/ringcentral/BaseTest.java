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
        try {
            loadDotEnv();
        } catch (IOException e) {
            try {
                loadSysEnv();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
        restClient = new RestClient(config.get("appKey"), config.get("appSecret"), config.get("server"));
        try {
            restClient.authorize(config.get("username"), config.get("extension"), config.get("password"));
        } catch (IOException | RestException e) {
            e.printStackTrace();
        }
    }

    private void loadDotEnv() throws IOException {
        String content = new String(Files.readAllBytes(Paths.get("./src/test/resources/.env")));
        for (String line : content.split("\n")) {
            String[] tokens = line.split("=");
            if (tokens.length > 1) {
                config.put(tokens[0], tokens[1]);
            } else {
                config.put(tokens[0], "");
            }
        }
    }

    private void loadSysEnv() throws IOException {
        String content = new String(Files.readAllBytes(Paths.get("./src/test/resources/.env.sample")));
        for (String line : content.split("\n")) {
            String[] tokens = line.split("=");
            String value = System.getenv(tokens[0]);
            config.put(tokens[0], value == null ? "" : value);
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
