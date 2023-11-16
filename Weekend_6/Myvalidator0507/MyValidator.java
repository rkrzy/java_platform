package Weekend_6.Myvalidator0507;

// Annotations

// @interface NotNull

// @interface Size

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.*;



// Validation Framework

public class MyValidator {


    public static Set<String> validate(Object obj) {

     Set<String> violations = new HashSet<>();
     Class <?> cl = obj.getClass();
     Field[] fields = cl.getDeclaredFields();
     for(Field fi : fields)
     {
         if(fi.isAnnotationPresent(NotNull.class))
         {
             NotNull Not = fi.getAnnotation(NotNull.class);
             fi.setAccessible(true);
             try{
                 if(fi.get(obj)==null)
                 {
                     violations.add(Not.message());
                 }
             }
             catch (Exception e)
             {
                 e.printStackTrace();
             }
         }
         if(fi.isAnnotationPresent(Size.class))
         {
             Size si = fi.getAnnotation(Size.class);
             fi.setAccessible(true);
             try
             {
                 String str = (String)fi.get(obj);
                 if(str!=null&&(str.length()>si.max()||str.length()<si.min()))
                 {
                     violations.add(si.message());
                 }
             }
             catch (Exception e)
             {
                 e.printStackTrace();
             }
         }

     }





        return violations;

    }

}






class Student {

    private String id;



    @NotNull(message = "Name cannot be null")
    @Size(min = 3, max = 50, message = "Name should be between 3 to 50 characters")
    private String name;



    public Student(String id, String name) {

        this.id = id;

        this.name = name;

    }



    public String getId() {

        return id;

    }



    public String getName() {

        return name;

    }



    @Override

    public boolean equals(Object o) {

        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        return id.equals(student.id);

    }



    @Override

    public int hashCode() {

        return Objects.hash(id);

    }

}



class StudentRepository {

    private Map<String, Student> students = new HashMap<>();



    public Student save(Student student) {

        Set<String> violations = MyValidator.validate(student);

        if (!violations.isEmpty()) {
            System.out.println("Validation errors: " + violations);
            return null;
        }
        return students.put(student.getId(), student);

    }

}



class ValidatorTest {

    public static void main(String[] args) {

        StudentRepository repo = new StudentRepository();



        Student student1 = new Student("S001", "Jo");

        repo.save(student1);

        Student student2 = new Student("S002", null);

        repo.save(student2);

        Student student3 = new Student("S003", "John");

        repo.save(student3);

    }

}