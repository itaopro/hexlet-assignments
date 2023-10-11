package exercise;

import java.util.stream.Collectors;
import java.util.Arrays;

// BEGIN
public class App {

    public static String getForwardedVariables(String content) {
        return Arrays.stream(content.split("\n")) // Разделяем строку на строки
                .filter(line -> line.startsWith("environment")) // Фильтруем строки, начинающиеся с "environment"
                .flatMap(line -> Arrays.stream(line.split("\"")[1].split(","))) // Разделяем переменные на отдельные элементы
                .filter(var -> var.startsWith("X_FORWARDED_")) // Отбираем только переменные с префиксом X_FORWARDED_
                .map(var -> var.replaceFirst("X_FORWARDED_", "")) // Убираем префикс
                .collect(Collectors.joining(",")); // Объединяем все переменные в одну строку, разделенную запятыми
    }
}
//END
