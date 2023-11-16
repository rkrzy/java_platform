package Weekend_6.Polymorphism;

public class Professor extends Person{
    String schoolname;
    String major;

    public Professor(String name,int age,String address,String schoolname,String major)
    {
        super(name,age,address);
        this.schoolname = schoolname;
        this.major = major;
    }
    public String getSchoolname()
    {
        return schoolname;
    }
    public String getmajor()
    {
        return major;
    }
    @Override
    public boolean equals(Object o )
    {
        if(o instanceof Professor)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
