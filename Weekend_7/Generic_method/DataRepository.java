package Weekend_7.Generic_method;

import java.util.ArrayList;
import java.util.List;

public class DataRepository {

    private List<Object> data = new ArrayList<>();



    private static DataRepository instance = new DataRepository();



    public static DataRepository getInstance() {

        return instance;

    }



    public void add(Object data) {

        this.data.add(data);

    }



    public <T> List<T> getData(Class<T> templateClass) {

        List<T> newData = new ArrayList<>();
        for(Object ob : data)
        {
            if(templateClass.isInstance(ob))
            {
                newData.add((T)ob);
            }
        }


        return newData;

    }

}