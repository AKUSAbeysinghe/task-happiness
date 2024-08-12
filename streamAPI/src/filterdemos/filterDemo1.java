package filterdemos;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class filterDemo1 {

    public static void main(String[] args) {

        /*ArrayList <Integer>numberList = new ArrayList<Integer>();   //create an arrayList Collection
        numberList.add(10);    //Declaration Add elements to the arrayList Collection
        numberList.add(15);
        numberList.add(20);
        numberList.add(25);
        numberList.add(30);*/


        List<Integer> numberList = (List<Integer>) Arrays.asList(10,15,20,25,30);
        List<Integer> evennumberList = new ArrayList<>();

        //without using streams
        /*
        for(int n: numberList){
            if(n%2 == 0)
                evennumberList.add(n);

        }

        System.out.println(evennumberList);
*/

        //with stream
        /*
        evennumberList= numberList.stream().filter(n->n%2 == 0).collect(Collectors.toList());
        System.out.println(evennumberList);
        //filter the data and store it in some other collection
*/


        //if i want to print the data only we can use foreach method insted of store the data and printing it
        //numberList.stream().filter(n-> n%2==0 ).forEach(n-> System.out.println(n));
        //here it consumer not a fredictor expression, takes the values doesn't return anything only consuming only printing

        numberList.stream().filter(n-> n%2==0).forEach(System.out::println);  //directly printing without argument using lamda expression




    }
}
