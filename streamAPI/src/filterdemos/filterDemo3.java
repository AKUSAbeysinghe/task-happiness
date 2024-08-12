package filterdemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class filterDemo3 {

    public static void main(String[] args) {

        List<String> words = Arrays.asList("cup",null,"forest","sky","book",null,"theature");
        //List<String> result = new ArrayList<String>();

        List<String> result = words.stream().filter(w-> w!= null).collect(Collectors.toList());
        System.out.println(result);


    }

}
