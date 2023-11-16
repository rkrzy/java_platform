package Weekend_6.Polymorphism;

public class Student extends Person {
    private String schoolName ;
    private Grade grade = Grade.SENIOR;
    public Student(String name, int age, String address, String schoolName) {
        super(name, age, address) ;
    }
    public String getSchoolName() { return schoolName ; }
    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
    public Grade getGrade() { return grade ; }
    public void upGrade() { grade.upGrade() ; }
    @Override
    public String toString() {
        return super.toString() + schoolName + grade;

    }
    @Override
    public boolean equals(Object o)
    {
        if(o instanceof Student)
        {
            return true;
        }
        return false;
    }
}
// override hashCode() and equals()