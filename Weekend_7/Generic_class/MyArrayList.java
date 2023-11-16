package Weekend_7.Generic_class;

import java.util.ArrayList;
import java.util.List;

public class MyArrayList<T> {

    // your code here
    List<T> list = null;

    public MyArrayList(int capacity) {
        list = new ArrayList<>(capacity);


    }



    public void add(T data) {

        list.add(data);

    }



    public T get(int index) {

        return list.get(index);

    }

}