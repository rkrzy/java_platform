package Weekend_7.Generic_class_2;

public class IntTypeData extends SpecificTypeData<Integer> {

    public IntTypeData(Integer num)
    {
        super(num);
    }
    public void addData(Integer num)
    {
        super.data += num;
    }

}

