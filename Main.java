import java.util.Optional;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Анатолий Миценгендлер", new Address("Лос Анджелес", "Хз"));
        Student student2 = new Student("Obehag");
        printStudentInfo(student1);
        printStudentInfo(student2);

        List<String> namesSetNotCollettion = new ArrayList<>(List.of("ДРЕВНИЕ","РУСЫ","ПРОТИВ","ЯЩЕРОВ","АААААААА","Оклахома"));
        namesSetNotCollettion.add(Collections.singletonList(namesSetNotCollettion.stream().reduce((x, y) -> x +" "+ y).get()).toString());
        System.out.println(namesSetNotCollettion);
    }
    public static void printStudentInfo(Student student) {
        System.out.println("Name: " + student.getName());
        student.getAddress().ifPresent(address ->
                System.out.println("Address: " + address.getCity() + ", " + address.getRegion())
        );
    }
}