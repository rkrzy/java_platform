package Weekend_7.Generic_class_2;

public abstract class SpecificTypeData<T> {

    protected T data;



    public SpecificTypeData(T data) {

        this.data = data;

    }



    public T getData() {

        return data;

    }



    public abstract void addData(T data);

}