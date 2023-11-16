package LAB_02_review_problem_LMS;

import java.util.*;

public class School {

    private String name;

    private List<Student> students;

    public School(String name) {

        this.name = name;

        this.students = new ArrayList<>();

    }
    public void removeAllStudent()
    {
        students.clear();
    }
    public void addStudents(Student student)
    {
        this.students.add(student);
    }

    public void removeStudent(String studentId) {
        Student dropout = null;
        for(Student student : students)
        {
            if(student.getStudentID().equals(studentId))
            {
                dropout = student;
                break;
            }
        }
        students.remove(dropout);
    }


    public void findAllByYear(int year) {
        for(Student student : students)
        {
            if(student.getYear()==year)
            {
                System.out.println(student);
            }
        }
    }

    public void listTopStudentsByGPA(int count) {
        List<Student> studentCopy = new ArrayList<>(students);

        Comparator<Student> comparator = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Double.compare(o1.getGPA(),o2.getGPA()) * -1;
            }
        } ;


        Collections.sort(studentCopy,comparator);
        for(int i =0;i<count;i++)
        {
            System.out.println(studentCopy.get(i));
        }
    }

    public void listAllStudents() {
        for(Student student:students)
        {
            System.out.println(student);
        }
    }
}