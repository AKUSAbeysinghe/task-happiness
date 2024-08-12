package filterdemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class filterDemo5<evennumberList> {

    public static void main(String[] args) {


        List<Integer> numberList = (List<Integer>) Arrays.asList(10,15,20,25,30);
        List<Integer> evennumberList = new ArrayList<>();

        numberList.stream().filter(n-> n%2==0 ).forEach(n-> System.out.println(n));
        }


}
