package Weekend_7.Generic_method_2;

import java.util.ArrayList;
import java.util.List;

public class NumberRepository <T extends Number> {
    private List<Number> data = new ArrayList<>();
    private static NumberRepository instance = new NumberRepository();

    public static NumberRepository getInstance() {
        return instance;
    }

    public <T> void  addAll (List<T> num)
    {
        for(T num1 : num)
        {
            data.add((Number) num1);
        }

    }


    public String toString(){
        return data.toString();
    }
}