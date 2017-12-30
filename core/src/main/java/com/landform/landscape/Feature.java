package com.landform.landscape;

import java.util.HashMap;
import java.util.Map;

public class Feature {
    private String type;
    private HashMap<String, Object> properties;

    public Feature(String type)
    {
        this.type = type;
        this.properties = new HashMap<>();
    }

    public Feature(String type, Map<String, Object> properties)
    {
        this.type = type;
        this.properties = new HashMap<>(properties);
    }

    public Feature(Feature other)
    {
        this.type = other.type;
        this.properties = new HashMap<>(other.properties);
    }

    public String getType() {
        return type;
    }

    public Map<String, Object> getProperties() {
        return properties;
    }
}
