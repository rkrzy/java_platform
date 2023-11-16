package LAB_02_review_problem_LMS;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SchoolTest {
    enum Command{ADD,REMOVE,FIND,TOP,CLEAR,INVALID,LIST,QUIT};

        private static final Scanner scanner = new Scanner(System.in);

        private static final School school = new School("PNU");



        private static final Map<Command, Runnable> commandMap = new HashMap<>();



        static {

            commandMap.put(Command.ADD, SchoolTest::addStudent);

            commandMap.put(Command.REMOVE, SchoolTest::removeStudent);

            commandMap.put(Command.FIND, SchoolTest::findStudentByYear);

            commandMap.put(Command.TOP, SchoolTest::listTopStudentsByGPA);

            commandMap.put(Command.CLEAR, () -> {

                school.removeAllStudent();

                System.out.println("All students have been removed.");

            });

            commandMap.put(Command.LIST, SchoolTest::listAllStudents);

            commandMap.put(Command.QUIT, () -> System.out.println("Goodbye!"));

            commandMap.put(Command.INVALID, () -> System.out.println("Invalid command!"));

        }



        public static void main(String[] args) {

            while (true) {

                Command cmd = getCommand();

                commandMap.getOrDefault(cmd, commandMap.get(Command.INVALID)).run();

                if (cmd == Command.QUIT) {

                    break;

                }

            }

        }



        private static Command getCommand() {

            System.out.print("Enter command: ");

            String input = scanner.next().toUpperCase();

            try {

                return Command.valueOf(input);

            } catch (IllegalArgumentException e) {

                return Command.INVALID;

            }

        }

    private static void addStudent() {

        String name = scanner.next();
        int year = scanner.nextInt();
        double gpa = scanner.nextDouble();

        Student student = new Student(name,year,gpa);
        school.addStudents(student);
    }

        // implement your code
        private static void removeStudent()
        {
            String studentId = scanner.next();
            school.removeStudent(studentId);
        }
        private static void findStudentByYear(){
            int year = scanner.nextInt();
            school.findAllByYear(year);
        }


        private static void listTopStudentsByGPA()
        {
            int count = scanner.nextInt();
            school.listTopStudentsByGPA(count);
        }
        private static void listAllStudents()
        {
            school.listAllStudents();
        }
}
