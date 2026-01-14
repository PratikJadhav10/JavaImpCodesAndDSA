import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class HashMapNew {
    public static void main(String[] args) {
        HashMap<String, List<String>> map = new HashMap<>();
        map.put("fruits", Arrays.asList("Apple","Orange","Banana"));
        map.put("vegetables", Arrays.asList("Carrot","Brocolli","Spinach"));

        List<String> combineMapValues = new ArrayList<>();
        for (List<String> values: map.values()){
            combineMapValues.addAll(values);
        }

        System.out.println("combineMapValues: "+combineMapValues);

    }
}
