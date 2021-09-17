import java.util.Objects;

public class Student {
    private String name;
    private String group;
    private String studentId;

    public Student(String name, String group, String studentId) {
        this.name = name;
        this.group = group;
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !obj.getClass().equals(Student.class)) {
            return false;
        }
        Student altStudent = (Student) obj;
        return getStudentId().equals(altStudent.getStudentId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId);
    }

    @Override
    public String toString() {
        return "- " + name + ", " + group + ", " + studentId;
    }
}
