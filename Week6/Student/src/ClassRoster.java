import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ClassRoster {

    public static void main(String[] args) {

        List<Student> students = new LinkedList<Student>();

        students.add(new Student("Jaime", "Rodriguez", 101));
        students.add(new Student("Jaime", "Rodriguez", 102));
        students.add(new Student("Kara", "Garcia", 103));
        students.add(new Student("Dylan", "Garcia", 104));
        students.add(new Student("Gunner", "Rodriguez", 105));
        students.add(new Student("Krystal", "Rodriguez", 106));
        students.add(new Student("Cody", "Sawhill", 107));
        students.add(new Student("Felipe", "Carillo", 108));
        students.add(new Student("Sarah", "Carillo", 109));
        students.add(new Student("Jerry", "Hernandez", 110));
        students.add(new Student("Adrian", "Rodriguez", 111));
        students.add(new Student("Mike", "Walsh", 112));
        students.add(new Student("Adam", "Camp", 113));
        students.add(new Student("Steve", "Knitter", 114));
        students.add(new Student("Alex", "Bollinger", 115));
        students.add(new Student("Jimmy", "Stanley", 116));
        students.add(new Student("Clair", "Lawerence", 117));
        students.add(new Student("Eva", "Rodriguez", 118));
        students.add(new Student("Doug", "Duke", 119));
        students.add(new Student("Eric", "Moreno", 120));

        ListIterator<Student> iterator = students.listIterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();

            System.out.println(student.getStudentID() + student.getFirstName() + student.getLastName());
        }

        ListIterator<Student> reverseIterator = students.listIterator(students.size());
        while (reverseIterator.hasPrevious()) {
            Student student = reverseIterator.previous();

            System.out.println(student.getStudentID() + student.getFirstName() + student.getLastName());
        }
    }
}
