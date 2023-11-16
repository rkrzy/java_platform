package LAB_02_review.problem_book;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class ReflectionUtility {

    public static List<String> getAttributes(Object obj) {

        List<String>list = new ArrayList<>();
        Field[]fields = obj.getClass().getDeclaredFields();
        for(Field field : fields)
        {
            list.add(field.getName());
        }
        return list;
    }

}
