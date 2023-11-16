package Weekend_7.Nested_class;


public class Forward extends Player{

    public Forward(String str,int num1,int num2)
    {
        super(str,num1,num2);
    }
    @Override
    protected int getSpeed()
    {
        return this.speed;
    }
    @Override
    public String toString()
    {
        return super.toString() + "Forward";
    }
}
