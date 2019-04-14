package pl.academy.sda.backend.json;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WeatherCity {

   private final Integer id;
   private final String name;
   private final String country;
   private final Coordinates coordinates;

    public WeatherCity(
            @JsonProperty("id") Integer id,
            @JsonProperty("name") String name,
            @JsonProperty("country") String country,
            @JsonProperty("coord") Coordinates coordinates) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.coordinates = coordinates;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }
}

/*
{
        "id": 707860,
        "name": "Hurzuf",
        "country": "UA",
        "coord": {
        "lon": 34.283333,
        "lat": 44.549999
        }
        }*/
