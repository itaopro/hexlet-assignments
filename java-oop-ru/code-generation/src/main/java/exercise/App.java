package exercise;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class App {

    public static void save(Path filePath, Car car) {
        String json = car.serialize();
        try {
            Files.write(filePath, json.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Car extract(Path filePath) {
        Car car = null;
        try {
            String json = new String(Files.readAllBytes(filePath));
            car = Car.unserialize(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return car;
    }
}
