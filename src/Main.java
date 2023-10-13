import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> originalList = Arrays.asList("Оля", "Юлия");


        List<String> result = originalList.stream().map(name -> "->(" + name + " " + name + ", " + name + " " + name + ")").collect(Collectors.toList());
        System.out.println(result);

    }
}