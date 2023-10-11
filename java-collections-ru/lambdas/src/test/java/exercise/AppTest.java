package exercise;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

// BEGIN
public class AppTest {

    @Test
    void testEnlargeArrayImage() {
        // Исходное изображение
        String[][] image = {
                {"A", "B"},
                {"C", "D"}
        };

        // Ожидаемый результат после увеличения
        String[][] expectedEnlargedImage = {
                {"A", "A", "B", "B"},
                {"A", "A", "B", "B"},
                {"C", "C", "D", "D"},
                {"C", "C", "D", "D"}
        };

        String[][] result = App.enlargeArrayImage(image);

        // Проверка
        assertThat(result).isEqualTo(expectedEnlargedImage);
    }
}
// END
