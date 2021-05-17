import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Practice {


    public static void main(String[] args) {
        ArrayList <Integer> arrayList = new ArrayList<>();
        arrayList.add(30);
        arrayList.add(31);
        arrayList.add(32);
        arrayList.add(33);
        Supplier<String> stringSupplier = ()->"Hello World!";
        System.out.println(stringSupplier.get());
        Predicate<String> stringPredicate = str-> str.length()>5;
        System.out.println(stringPredicate.test("ham"));
        Function <Integer,Integer> addByFive = (s)-> s+5;
        System.out.println(addByFive.apply(6));




    }
}
