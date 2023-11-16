package Weekend_7.Nested_class;

public class MidFielder extends Player{

    public MidFielder(String name, int num1,int num2)
    {
        super(name,num1,num2);
    }
    @Override
    protected int getSpeed()
    {
        return this.speed;
    }
    @Override
    public String toString()
    {
        return super.toString() + "MidFielder";
    }
}
