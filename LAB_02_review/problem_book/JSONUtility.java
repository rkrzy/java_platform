package LAB_02_review.problem_book;

import java.lang.reflect.Field;
import java.util.List;

public class JSONUtility {


    public static String toJSON(Object obj) throws NoSuchFieldException, IllegalAccessException {

        List<String> list = ReflectionUtility.getAttributes(obj);
        StringBuilder sb = new StringBuilder();
        sb.append('{');
        for (String fieldString : list) {
            Field field = obj.getClass().getDeclaredField(fieldString);
            field.setAccessible(true);
            Object value = field.get(obj);

            if (value instanceof String) {
                sb.append(String.format("\"%s\":\"%s\",", fieldString, fieldString));
            } else {
                sb.append(String.format("\"%s\":\"%d\",", fieldString, field));
            }
            sb.deleteCharAt(sb.length() - 1);
            sb.append('}');

        }
        return sb.toString();
    }
}
