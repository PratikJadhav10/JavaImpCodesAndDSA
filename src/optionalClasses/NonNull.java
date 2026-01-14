package optionalClasses;

import java.util.Objects;
import java.util.Optional;

//Create an Optional object from a non-null value and retrieve the value using get().
//Create an Optional object from a null value and use orElse() to provide a default value.
public class NonNull {
    public static void main(String[] args) {
        String str = null;
        String obj = Optional.ofNullable(str).orElse("Not Found");
        System.out.println(obj);

        Optional<String> op = Optional.ofNullable(str);
        //System.out.println("get() method called:"+op.get());

        String result = op.orElse("Default value");
        System.out.println("result:"+result);

        System.out.println(optionalMethod(str));
    }

    //Write a method that takes a String as input and returns an Optional<String>.
    // If the input is null, return an empty Optional.
    // Use Optional.ofNullable() to handle a method that might return null.
    public static Optional<String> optionalMethod(String str){
        Optional<String> optionalObj = Optional.ofNullable(str);
        return  optionalObj;
    }
}
