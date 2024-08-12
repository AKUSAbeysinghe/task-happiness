import java.util.ArrayList;
import java.util.Arrays;

public class filter {
    public static void main(String[] args) {

        /*ArrayList <Integer>numberList = new ArrayList<Integer>();   //create an arrayList Collation
        numberList.add(10);    //Declaration Add elements to the arrayList Collection
        numberList.add(15);
        numberList.add(20);
        numberList.add(25);
        numberList.add(30);*/


        ArrayList<Integer> numberList = (ArrayList<Integer>) Arrays.asList(10,15,20,25,30);
        ArrayList<Integer> evennumberList = new ArrayList<>();

        //without using streams
        for(int n: numberList){
            if(n%2 == 0)
                evennumberList.add(n);

        }

        System.out.println(evennumberList);



    }
}
