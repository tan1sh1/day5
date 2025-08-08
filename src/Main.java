import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        listNum();
        alphacount();
        dupl();
        sal();
    }

    public static void listNum(){

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(evenNumbers);
    }

    public static void alphacount(){

        List<String> words = Arrays.asList("Apple", "Ball", "Ant");
        long count = words.stream()
                .filter(w -> w.startsWith("A"))
                .count();
        System.out.println(count);
    }

    public static void dupl(){
        List<Integer>list = Arrays.asList(1,2,2,3,3,4,5);
        List<Integer>unique=list.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(unique);
    }
    static List<Employees> employees = Arrays.asList(
       new Employees("rahul",2333330),
       new Employees("tan",9999999),
       new Employees("tej",59483900)

    );


    public static void sal(){
        List<Employees>sorted=employees.stream()
                .sorted(Comparator.comparing(Employees::getSalary))
                .collect(Collectors.toList());
        System.out.println(sorted);
    }

}



