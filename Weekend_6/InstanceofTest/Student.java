package Weekend_6.InstanceofTest;

public class Student extends Person {
    private String schoolName ;
    private Grade grade = new Grade();
    public Student(String name, int age, String address, String schoolName)
    { super(name, age, address) ;
        this.schoolName = schoolName;
    }
    public String getSchoolName() { return schoolName ; }
    public void setSchoolName(String schoolName) {
    }
    public Grade getGrade() { return grade ; } public void upGrade() { grade.upGrade() ; } @Override
    public String toString() {
        return String.format("");
    }
    @Override
    public boolean equals(Object o )
    {
        if(o instanceof Student)
        {
            return true;
        }
        else {
            return false;
        }
    }
}
// override hashCode() and equals()