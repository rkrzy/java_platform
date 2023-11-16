package Weekend_6.InstanceofTest;

public class Professor extends Person {
    private String schoolname;
    private String major;

    Professor(String name,int age,String address,String schoolname,String major)
    {
        super(name,age,address);
        this.schoolname = schoolname;
        this.major = major;
    }
    public String schoolName()
    {
        return schoolname;
    }
    public String major()
    {
        return this.major;
    }
    @Override
    public boolean equals(Object o)
    {
        if(o instanceof Professor)
        {
            return true;
        }
        else {
            return false;
        }
    }

}
