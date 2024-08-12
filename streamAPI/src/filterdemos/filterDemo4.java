package filterdemos;
import java.util.ArrayList;
import java.util.List;

class product{
    int id;
    String name;
    double price;

    public product(int id,String name,double price){
        this.id=id;
        this.name= name;
        this.price = price;
    }
}

public class filterDemo4 {

    public static void main(String[] args) {

        List <product> productsList = new ArrayList();
        productsList.add(new product(1,"HP Laptop",25000));
        productsList.add(new product(2,"Asus Laptop",35000));
        productsList.add(new product(3,"Dell Laptop",23000));
        productsList.add(new product(4,"Lenova Laptop",90000));

        productsList.stream().filter(p-> p.price>2500)  //filtering
        .forEach(pr-> System.out.println(pr.price));    //iterating

        }
    }

