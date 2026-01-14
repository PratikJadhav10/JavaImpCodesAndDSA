import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,0,44,30,80,77);

        List<String> remoeZero =  list.stream()
                .map( n -> n.toString().replace("0", "_"))
                .collect(Collectors.toList());

        System.out.println(remoeZero);

        }
    }
