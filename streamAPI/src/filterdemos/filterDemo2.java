package filterdemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class filterDemo2 {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Melisandre","Sansa","Jon","Daenerys","Joffery");

        List<String> longNames = new ArrayList<>();
        longNames= names.stream().filter(str->str.length()>6 && str.length()<8).collect(Collectors.toList());

        System.out.println(longNames);

    }
}
