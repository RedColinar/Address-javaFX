package com.pq.address.fx.util;

import javafx.fxml.FXMLLoader;

import java.io.IOException;

public class XLoader {
    FXMLLoader loader;

    public <T> XLoader(T clazz, String location) {
        loader = new FXMLLoader(clazz.getClass().getResource(location));
    }

    public <T> T load() {
        try {
            return loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    public <T> T controller() {
        return loader.getController();
    }
}
