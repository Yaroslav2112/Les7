import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {

    public int compare(Student student1, Student student2) {
        Integer age1 = new Integer(student1.getAge());
        Integer age2 = new Integer(student2.getAge());
        return age1.compareTo(age2);
    }
}

