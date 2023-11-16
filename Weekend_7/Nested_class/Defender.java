package Weekend_7.Nested_class;

public class Defender extends Player{

    public Defender(String str, int num, int num2)
    {
        super(str, num,num2);
    }
    @Override
    protected int getSpeed()
    {
        return this.speed;
    }
    @Override
    public String toString()
    {
        return super.toString() + "Defender";
    }


}