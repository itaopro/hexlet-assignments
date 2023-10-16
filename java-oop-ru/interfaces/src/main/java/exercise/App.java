package exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// BEGIN
public class App {
    public static List<String> buildApartmentsList(List<Home> homes, int n) {
        List<String> sortedHomesStringList = new ArrayList<>();

        // Сортировка списка объектов недвижимости по площади по возрастанию
        Collections.sort(homes, new Comparator<Home>() {
            @Override
            public int compare(Home o1, Home o2) {
                return o1.compareTo(o2);
            }
        });

        // Берем первые n элементов
        for (int i = 0; i < Math.min(n, homes.size()); i++) {
            sortedHomesStringList.add(homes.get(i).toString());
        }

        return sortedHomesStringList;
    }
}
// END
