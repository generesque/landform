package com.landform.landscape;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Feature feature = (Feature) o;
        return Objects.equals(type, feature.type) &&
                Objects.equals(properties, feature.properties);
    }

    @Override
    public int hashCode() {

        return Objects.hash(type, properties);
    }

    @Override
    public String toString() {
        return "Feature{" +
                "type='" + type + '\'' +
                ", properties=" + properties +
                '}';
    }
}
