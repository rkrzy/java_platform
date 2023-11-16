package LAB_02_review_problem_LMS;

import java.util.concurrent.atomic.AtomicInteger;

public class Student {

    private static final AtomicInteger COUNTER = new AtomicInteger(0);

    private String studentID;

    private String name ;

    private int year ;

    private double GPA ;



    public Student(String name, int year, double GPA) {

        this.studentID = "PNU2023" + COUNTER.incrementAndGet();

        this.name = name;

        this.year = year;

        this.GPA = GPA;

    }

    public String getStudentID()
    {
        return this.getStudentID();
    }
    // implement your cod
    // public ie
    public int getYear()
    {
        return this.year;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID='" + studentID + '\'' +
                ", name='" + name + '\'' +
                ", year=" + year +"grade"+
                  GPA +
                '}';
    }
    public double getGPA()
    {
        return this.GPA;
    }
}