package Task2;

import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;

public class App2 {
        public static void main(String[] args) {
        Student student1 = new Student("Ivan", 18);
        Student student2 = new Student("Petro", 19);
        Student student3 = new Student("Pavlo", 17);
        Student student4 = new Student("Oleg", 21);
        List<Integer> s1 = Arrays.asList(5,4,5,3);
        List<Integer> s2 = Arrays.asList(4,4,4,4);
        List<Integer> s3 = Arrays.asList(5,4,3,3);
        List<Integer> s4 = Arrays.asList(3,4,3,3);
        StudentComparator studentComparator = new StudentComparator();
        TreeMap<Student, List<Integer>> map1 = new TreeMap<>(studentComparator);
        map1.put(student1,s1);
        map1.put(student2,s2);
        map1.put(student3,s3);
        map1.put(student4,s4);
        System.out.println(map1);
    }
}

