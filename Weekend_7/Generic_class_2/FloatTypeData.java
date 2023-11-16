package Weekend_7.Generic_class_2;

public class FloatTypeData extends SpecificTypeData<Float> {

    public FloatTypeData(Float num)
    {
        super(num);
    }
    public void addData(Float data)
    {
        super.data += data;
    }

}