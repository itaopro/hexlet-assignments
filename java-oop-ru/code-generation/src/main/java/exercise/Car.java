package exercise;

import java.io.IOException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Value;

@Value
public class Car {
    int id;
    String brand;
    String model;
    String color;
    User owner;

    public String serialize() {
        ObjectMapper objectMapper = new ObjectMapper();
        String json = "";
        try {
            json = objectMapper.writeValueAsString(this);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return json;
    }


    public static Car unserialize(String jsonString) {
        ObjectMapper objectMapper = new ObjectMapper();
        Car car = null;
        try {
            car = objectMapper.readValue(jsonString, Car.class);
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        } catch (IOException e) {  // Now this should compile
            e.printStackTrace();
        }
        return car;
    }
}