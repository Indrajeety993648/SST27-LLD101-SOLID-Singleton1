package com.example.config;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Properties;

/**
 * Thread-safe Singleton: private constructor, lazy init, blocks
 * reflection/serialization.
 */
public class AppSettings implements Serializable {
    private static final long serialVersionUID = 1L;
    private static final AppSettings instance = new AppSettings();
    private final Properties props = new Properties();

    private AppSettings() {
        if (instance != null) {
            throw new RuntimeException("Use getInstance()");
        }
    }

    public static AppSettings getInstance() {
        return instance;
    }

    // Preserve singleton on deserialization
    protected Object readResolve() {
        return getInstance();
    }

    public synchronized void loadFromFile(Path file) {
        try (InputStream in = Files.newInputStream(file)) {
            props.load(in);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    public synchronized String get(String key) {
        return props.getProperty(key);
    }
}