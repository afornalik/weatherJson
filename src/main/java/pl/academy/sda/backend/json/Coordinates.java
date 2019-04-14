package pl.academy.sda.backend.json;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Coordinates {

    private final Double longitude;
    private final Double latitude;

    @JsonCreator
    public Coordinates(
            @JsonProperty("lon") Double longitude,
            @JsonProperty("lat") Double latitude) {
        this.longitude = longitude;
        this.latitude = latitude;
    }
}
