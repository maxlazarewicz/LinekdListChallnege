package org.example;

import java.util.Objects;

public class Town {

    private String placeName;
    private int distanceFromSydney;

    public Town(String placeName, int distanceFromSydney) {
        this.placeName = placeName;
        this.distanceFromSydney = distanceFromSydney;
    }

    public String getPlaceName() {
        return placeName;
    }

    public int getDistanceFromSydney() {
        return distanceFromSydney;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Town town = (Town) o;
        return Double.compare(town.distanceFromSydney, distanceFromSydney) == 0 && Objects.equals(placeName, town.placeName);
    }

    @Override
    public int hashCode() {
        int hash = getClass().hashCode();
        hash = 31 * hash + distanceFromSydney;
        return hash;
    }
}
