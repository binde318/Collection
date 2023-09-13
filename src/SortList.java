import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortList {
    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//        list.add("James");
//        list.add("Mike");
//        list.add("Nulius");
//        list.add("Kack");
//        list.add("Lala");
//        Collections.sort(list);
//
//        System.out.println(list); //by default it will be sorted in ascending order
//
//        Collections.reverse(list); //sorting in descending order
//        System.out.println(list);
        List<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee(50,"Binde", 23, 3000000L));
        employees.add(new Employee(45, "Dicko", 56, 6000000L));
        employees.add(new Employee(23,"Abel", 30, 70000L));
        employees.add(new Employee(70,"Osmond",31, 20000L));


        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (int) (o2.getSalary() - o1.getSalary());
            }
        });
        Collections.sort(employees, ( (o1, o2) -> (int) (o2.getSalary() - o1.getSalary())));
        System.out.println(employees); // ascending order

//        Collections.sort(employees, new Mysort());//ascending order
//        System.out.println(employees);

//        Collections.sort(employees, new Mysort());
//        System.out.println(employees);
    }

     static class Mysort implements Comparator<Employee> {

        @Override
        public int compare(Employee o1, Employee o2) {
            return (int) (o2.getSalary() - o1.getSalary());
        }
    }
}
