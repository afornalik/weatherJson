import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import pl.academy.sda.backend.json.WeatherCity;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class ParseJsonTest {


    @Test
    @DisplayName("should convert from json to WeatherCity list")
    void shouldConvertFromJsonToWeatherCityList() throws IOException {
        File file = new File("src/test/resources/json/test-city-list.json");
        ObjectMapper objectMapper = new ObjectMapper();
        TypeReference<List<WeatherCity>> typeReference = new TypeReference<List<WeatherCity>>(){};
        List<WeatherCity> weatherCities = objectMapper.readValue(file,typeReference);

        assertEquals(2,weatherCities.size());


        assertEquals("Hurzuf",weatherCities.get(0).getName());
    }
}
