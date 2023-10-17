package exercise;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
// BEGIN
public class Validator {

    public static List<String> validate(Object obj) {
        List<String> invalidFields = new ArrayList<>();

        // Get all the fields of the class
        Field[] fields = obj.getClass().getDeclaredFields();

        for (Field field : fields) {
            // Make the private fields accessible
            field.setAccessible(true);

            // Check if the field has a @NotNull annotation
            if (field.isAnnotationPresent(NotNull.class)) {
                try {
                    // Get the value of the field
                    Object value = field.get(obj);

                    // If the value is null, add the field name to the list
                    if (value == null) {
                        invalidFields.add(field.getName());
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }

        return invalidFields;
    }
}
// END
