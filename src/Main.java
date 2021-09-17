import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static Set<Student> students = new HashSet<>();
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        getStudents();
        showStudents();
    }

    public static void getStudents() {
        while(true) {
            System.out.println("Введите информацию о студенте (для завершения работы программы введите \"end\")");
            String input = scanner.nextLine();
            if ("end".equals(input)) {
                break;
            }
            String[] splittedInput = input.split(", ");
            String name = splittedInput[0];
            String group = splittedInput[1];
            String studentId = splittedInput[2];
            Student student = new Student(name, group, studentId);
            while (students.contains(student)) {
                System.out.println("Студент с данным номером студенческого билета уже зарегистрирован в системе! Повторите ввод");
                studentId = scanner.nextLine();
                student.setStudentId(studentId);
            }
            students.add(student);
        }
    }

   public static void showStudents() {
       System.out.println("Список студентов:");
       for (Student st : students) {
           System.out.println(st);
       }
   }
}
