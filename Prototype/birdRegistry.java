package Prototype;

import java.util.*;

public class birdRegistry {
    private Map<String, bird> birdMap = new HashMap<>();

    public void registerBird(String name, bird b) {
        birdMap.put(name, b);
    }

    public bird getBird(String name) {
        return birdMap.get(name);
    }
}
